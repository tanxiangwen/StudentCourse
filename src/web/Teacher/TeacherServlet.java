package web.Teacher;

import pojo.Classroom;
import pojo.TeacherCourse;
import pojo.TeacherInfomation;
import pojo.TeacherSelectCourse;
import service.Teacher.TeacherService;
import service.impl.TeacherServiceImpl;
import web.AllBaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class TeacherServlet extends AllBaseServlet {
    TeacherService teacherService=new TeacherServiceImpl();

    protected void Infomation(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         //获取登录时的职工号
       String tId=(String)req.getSession().getAttribute("userId");
       //调用方法查找
        TeacherInfomation teacherInfomation = teacherService.teaIfo(tId);
        //保存到session
        req.getSession().setAttribute("teacherInfomation",teacherInfomation);
        //请求转发给新界面
        req.getRequestDispatcher("/WebContent/teacherMessSel.jsp").forward(req,resp);

    }
    protected void updatePsw(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        //获取登录界面的账号
        String id=(String)req.getSession().getAttribute("userId");
        String password=  req.getParameter("pass1");

        String password1=req.getParameter("pass2");
        if(password.equals(password1)) {
            //执行修改
            int i = teacherService.updatePsw(password, id);
            if (i != 0) {
                //修改成功注销用户重新登录
                req.getSession().invalidate();
                resp.sendRedirect(req.getContextPath() + "/WebContent/Index.jsp");
            }
        }
        else{
            req.setAttribute("error","修改失败");
            String s=(String)req.getAttribute("error");

            resp.getWriter().write(s);
            req.getRequestDispatcher("WebContent/teacherMod.jsp").forward(req,resp);
            // resp.sendRedirect(req.getContextPath()+"/WebContent/stuMessMod.jsp");

        }

    }


    protected void showCourseStu(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取教师号
          String id=(String)req.getSession().getAttribute("userId");
          //调用方法获取听他课的学生
        List<TeacherSelectCourse> teacherSelectCourses = teacherService.selectStudent(id);
        //保存到session
        req.getSession().setAttribute("teacherSelectCourses",teacherSelectCourses);
        //
        req.getRequestDispatcher("/WebContent/gradestu.jsp").forward(req,resp);


    }

    protected void updateGrade(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求参数
        String sId=req.getParameter("sId");
        String cId=req.getParameter("cId");
        String grade=req.getParameter("grade");
        //方法
      int result=  teacherService.updateGrade(sId,cId,grade);
        if(result>0){
            //修改成功
            resp.sendRedirect(req.getHeader("Referer"));
        }
    }


    protected void select(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取登录的职工号
        String id=(String)req.getSession().getAttribute("userId");
        //调用方法
        List<TeacherCourse> select = teacherService.select(id);
        req.getSession().setAttribute("select",select);
        req.getRequestDispatcher("/WebContent/grade.jsp").forward(req,resp);


    }


    protected void classroom(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Classroom> classroom = teacherService.classroom();
        req.getSession().setAttribute("classroom",classroom);
        req.getRequestDispatcher("/WebContent/classroom.jsp").forward(req,resp);
    }
}

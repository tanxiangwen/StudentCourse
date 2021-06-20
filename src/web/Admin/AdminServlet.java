package web.Admin;

import pojo.*;
import service.Admin.AdminService;
import service.impl.AdminServiceImpl;
import web.AllBaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class AdminServlet extends AllBaseServlet {
    AdminService adminService=new AdminServiceImpl();
    protected void updatePsw(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        //获取登录界面的账号
        String id=(String)req.getSession().getAttribute("userId");
        String password=  req.getParameter("pass1");

        String password1=req.getParameter("pass2");
        if(password.equals(password1)) {
            //执行修改
            int i = adminService.updatePsw(password, id);
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
            req.getRequestDispatcher("WebContent/adminMod.jsp").forward(req,resp);
            // resp.sendRedirect(req.getContextPath()+"/WebContent/stuMessMod.jsp");

        }

    }


    protected void addStu(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                //获取请求参数
        String sId = req.getParameter("sId");
        String sName=req.getParameter("sName");
        String sPass=req.getParameter("sPass");
        String dId=req.getParameter("dId");
        String sSex=req.getParameter("sSex");
        String sMobil=req.getParameter("sMobil");
        String sAddress=req.getParameter("sAddress");
        //先添加学生信息如果添加成功依次添加学生详细信息和密码
        int i = adminService.addStu(new AddstudentDetail(sId, sName, sPass, dId));
        if(i>0){
            //说明插入成功继续
            adminService.addStuDetail(new AddStudentDetails(sId,sSex,sMobil,sAddress));
            adminService.savePass(sId,sPass);
            req.setAttribute("addError","addexact");
           // resp.sendRedirect(req.getHeader("Referer"));
            req.getRequestDispatcher("/WebContent/addstudent.jsp").forward(req,resp);
           // resp.sendRedirect(req.getContextPath()+"/WebContent/addstudent.jsp");
        }else{
            req.setAttribute("addError","addError");
           // req.getRequestDispatcher("/WebContent/addstudent.jsp").forward(req,resp);
           // resp.sendRedirect(req.getHeader("Referer"));
            req.getRequestDispatcher("/WebContent/addstudent.jsp").forward(req,resp);
        }


    }


    protected void addTea(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String tId= req.getParameter("tId");
        String tName= req.getParameter("tName");
        String tPass= req.getParameter("tPass");
        String dId= req.getParameter("dId");
        String tSex= req.getParameter("tSex");
        String tAge= req.getParameter("tAge");
        String tEdu= req.getParameter("tEdu");
        String tTitle= req.getParameter("tTitle");
        String tSch= req.getParameter("tSch");
        String tHealth= req.getParameter("tHealth");
        //调用方法保存
        int i = adminService.addTea(new TeacherDetail(tId, tName, tPass, dId));
        if(i>0){
            //说明保存成功，继续保存密码和详细信息
            adminService.savePassTea(tId,tPass);
            adminService.addTeaDetail(new TeacherDetails(tId,tSex,tAge,tEdu,tTitle,tSch,tHealth));
            req.setAttribute("addMsg","addexact");
            //resp.sendRedirect(req.getHeader("Referer"));
            req.getRequestDispatcher("/WebContent/addteacher.jsp.jsp").forward(req,resp);

        }else{
            req.setAttribute("addMsg","addError");
            // req.getRequestDispatcher("/WebContent/addstudent.jsp").forward(req,resp);
          //  resp.sendRedirect(req.getHeader("Referer"))
            req.getRequestDispatcher("/WebContent/addteacher.jsp.jsp").forward(req,resp);



        }
    }


    protected void courseAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cId= req.getParameter("cId");
        String cName= req.getParameter("cName");
        String tId= req.getParameter("tId");
        String credit= req.getParameter("credit");
        String period= req.getParameter("period");
        String cPlace= req.getParameter("cPlace");
        String cNumAll= req.getParameter("cNumAll");
        String cNum= req.getParameter("cNum");
        String dId= req.getParameter("dId");
        //调用保存方法
        int i = adminService.addCourse(new CourseAdd(cId, cName, tId, credit, period, cPlace, cNumAll, cNum, dId));
        if(i>0){
            req.getSession().setAttribute("addCourse","addcourse");
            resp.sendRedirect(req.getHeader("Referer"));
        }else{
            req.getSession().setAttribute("addCourse","courseError");
            resp.sendRedirect(req.getHeader("Referer"));

        }

    }

    protected void queryStu(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //调用方法
        List<QueryStudent> queryStudents = adminService.QueryStu();
        //保存到session
        req.getSession().setAttribute("queryStudents",queryStudents);
        //请求转发
        req.getRequestDispatcher("/WebContent/selstudent.jsp").forward(req,resp);
    }


    protected void queryTea(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<QueryTeacher> queryTeachers = adminService.QueryTea();
        req.getSession().setAttribute("queryTea",queryTeachers);
        req.getRequestDispatcher("/WebContent/selteacher.jsp").forward(req,resp);

    }
}

package web;


import com.google.gson.Gson;
import pojo.CourseStuItem;
import pojo.StudentInformation;
import service.CourseItem;
import service.StudentService;
import service.impl.CourseItemImpl;
import service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentServlet extends AllBaseServlet {
    StudentService studentService=new StudentServiceImpl();

    /**
     * 学生个人信息
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void stuDetail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // StudentService studentService=new StudentServiceImpl();
        //获取登录界面的账号
     String id=(String)req.getSession().getAttribute("userId");
     //根据学号查询出相应的个人信息
        StudentInformation studentInformation = studentService.selectUser(id);
        //保存到session中
        req.getSession().setAttribute("studentInformation",studentInformation);
        //请求转发
        req.getRequestDispatcher("/WebContent/studMessSel.jsp").forward(req,resp);


    }

    /**
     * 修改密码
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void updatePsw(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        //获取登录界面的账号
        String id=(String)req.getSession().getAttribute("userId");
      String password=  req.getParameter("pass1");

      String password1=req.getParameter("pass2");
      if(password.equals(password1)) {
          //执行修改
          int i = studentService.updatePsw(password, id);
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
            req.getRequestDispatcher("WebContent/stuMessMod.jsp").forward(req,resp);
           // resp.sendRedirect(req.getContextPath()+"/WebContent/stuMessMod.jsp");

        }

    }


    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CourseItem courseItem=new CourseItemImpl();
       //获取学号
        String id=(String)req.getSession().getAttribute("userId");
        //获取课程号
       String cId= req.getParameter("cId");
       //点击退
        studentService.delete(id,cId);
        pojo.CourseItem courseItem1 = courseItem.QueryCourseByid(cId);
        //数据更新
        int a = Integer.parseInt(courseItem1.getcNum()) - Integer.parseInt("1");
        String s = String.valueOf(a);

        courseItem1.setcNumAll(s);
        //数据更新操作
        courseItem.update(s, cId);
        //请求转发
       req.getRequestDispatcher("choosecourseServlet?action=showselect").forward(req,resp);
    }
}

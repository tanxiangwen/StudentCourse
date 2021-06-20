package web;

import com.google.gson.Gson;
import dao.Dao.BaseDao;
import pojo.CourseStuItem;
import pojo.chooseCourse;
import service.CourseItem;
import service.choosecourseService;
import service.impl.CourseItemImpl;
import service.impl.choosecourseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class choosecourseServlet extends AllBaseServlet {

    choosecourseService choosecourseService=new choosecourseServiceImpl();
    protected void choose(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CourseItem courseItem=new CourseItemImpl();
        //获取登录的学号
        String id=(String)req.getSession().getAttribute("userId");
        //获取点击选择的时候的课程号
       String cId= req.getParameter("cId");
       //保存
        //int add = choosecourseService.add(new chooseCourse(id, cId, null));
        //前提 //可选人数必须大于0
       pojo.CourseItem courseItem2= courseItem.QueryCourseByid(cId);
        Integer integer = courseItem2.getcNumNow();
        if(integer>0) {
            //int add = choosecourseService.add(new chooseCourse(id, cId, null));
            //先查看是否存在这个数据
          // chooseCourse chooseCourse= choosecourseService.Queryone(id,cId);
          chooseCourse chooseCourse= choosecourseService.Queryone(id,cId);
            if (chooseCourse==null) {
                //查出是哪个
                pojo.CourseItem courseItem1 = courseItem.QueryCourseByid(cId);
                //数据更新
                int a = Integer.parseInt(courseItem1.getcNum()) + Integer.parseInt("1");
                String s = String.valueOf(a);

                courseItem1.setcNum(s);
                //数据更新操作
                courseItem.update(cId,s);
                choosecourseService.add(new chooseCourse(id,cId));
              // req.setAttribute("chooseMessage", "选择成功");
               // req.setAttribute("chooseMessage", "选择成功");
               resp.sendRedirect(req.getHeader("Referer"));
                //resp.sendRedirect(req.getContextPath()+"/WebContent/choosecourse.jsp");
            } else {
              // req.setAttribute("chooseMessage", "你已经选择该课程，不要重复选择");
                req.setAttribute("chooseMessage", "chooseMessageerror");
             // resp.sendRedirect(req.getHeader("Referer"));
                req.getRequestDispatcher("courseServlet?action=QueryByPage").forward(req,resp);

            }
        }else{

            //说明已经选完
            req.setAttribute("chooseMessage", "full");

      //  resp.sendRedirect(req.getHeader("Referer"));
            req.getRequestDispatcher("courseServlet?action=QueryByPage").forward(req,resp);


        }

    }



    protected void showselect(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=(String)req.getSession().getAttribute("userId");
        List<CourseStuItem> showing = choosecourseService.showing(id);
        //保存到session
         req.getSession().setAttribute("showing",showing);
         req.getRequestDispatcher("WebContent/courseSelAndDel.jsp").forward(req,resp);
    }
}

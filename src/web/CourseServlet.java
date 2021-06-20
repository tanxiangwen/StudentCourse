package web;

import org.apache.commons.beanutils.BeanUtils;
import pojo.Page;
import service.CourseItem;
import service.impl.CourseItemImpl;
import utils.webUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CourseServlet extends AllBaseServlet {
    CourseItem courseItem=new CourseItemImpl();
    protected void courseShow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<pojo.CourseItem> courseItems = courseItem.showCourse();
        //保存
        req.setAttribute("course",courseItems);
        //请求转发
        req.getRequestDispatcher("/WebContent/choosecourse.jsp").forward(req,resp);

    }


    protected void QueryByPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer pageNo= webUtils.parseInt(req.getParameter("pageNo"),1);
        Integer pageSize=webUtils.parseInt(req.getParameter("pageSize"), Page.PAGE_SIZE);
        Page page1 = courseItem.page(pageNo, pageSize);
        //page.setUrl("manager/bookServlet?action=page");
        req.setAttribute("course",page1);
        req.getRequestDispatcher("/WebContent/choosecourse.jsp").forward(req,resp);

    }
}

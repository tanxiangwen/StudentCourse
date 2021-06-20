package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * 反射代码复用
 */
public abstract class AllBaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        String s = req.getParameter("action");
        try {
            //获取action业务，鉴别字符串，获得相应的业务，方法反射对象
            Method declaredMethod = this.getClass().getDeclaredMethod(s, HttpServletRequest.class, HttpServletResponse.class);
            declaredMethod.setAccessible(true);
            //调用方法
            declaredMethod.invoke(this,req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }


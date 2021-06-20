package web;

import pojo.LoginUser;
import service.impl.userServiceImpl;
import service.userService;
import utils.webUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends AllBaseServlet {
    /**
     * 登录验证
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userService userService=new userServiceImpl();
         //获取表单请求参数
       String userid= req.getParameter("userid");
       String userpass=req.getParameter("userpass");
      String userselect= req.getParameter("userselect");
        //分为普通用户、教师用户和管理员用户
        if(userselect.equals("student")){
            //调用service方法验证id和密码是否正确
            LoginUser user=userService.checkuser(new LoginUser(userid,userpass));
            webUtils.BeanUtils(req.getParameterMap(), new LoginUser());
            if(user!=null){
                //登录成功
                System.out.println("登录成功");
                //保存学号，方便生成个人信息
                req.getSession().setAttribute("userId",userid);
                //保存到session域
                req.getSession().setAttribute("user",user);
                //请求转发到首页
                resp.sendRedirect(req.getContextPath()+"/WebContent/studentIndex.jsp");
            }else{
                System.out.println("登录失败");
                req.setAttribute("userid",userid);
                req.getRequestDispatcher("/WebContent/Index.jsp").forward(req,resp);
            }

        }else if(userselect.equals("teacher")){
            //调用service方法验证id和密码是否正确
            LoginUser user=userService.checkuserIsteacher(new LoginUser(userid,userpass));
            webUtils.BeanUtils(req.getParameterMap(), new LoginUser());
            if(user!=null){
                //登录成功
                System.out.println("登录成功");
                //保存到session域
                req.getSession().setAttribute("userId",userid);
                req.getSession().setAttribute("user",user);
                //请求重定向到首页
               resp.sendRedirect(req.getContextPath()+"/WebContent/teacherIndex.jsp");

        }else{
                req.setAttribute("userid",userid);
              req.getRequestDispatcher("/WebContent/Index.jsp").forward(req,resp);
            }

    }else if(userselect.equals("admin")){
            //调用service方法验证id和密码是否正确
            LoginUser user=userService.checkuserIsadmain(new LoginUser(userid,userpass));
            webUtils.BeanUtils(req.getParameterMap(), new LoginUser());
            if(user!=null){
                //登录成功
                System.out.println("登录成功");
                req.getSession().setAttribute("userId",userid);
                //保存到session域
                req.getSession().setAttribute("user",user);
                //请求转发到首页
                resp.sendRedirect(req.getContextPath()+"/WebContent/adminIndex.jsp");

            }else{
                req.setAttribute("userid",userid);
                req.getRequestDispatcher("/WebContent/Index.jsp").forward(req,resp);
            }
        }

        }


    protected void loginOut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
        resp.sendRedirect(req.getContextPath()+"/WebContent/Index.jsp");

    }
}

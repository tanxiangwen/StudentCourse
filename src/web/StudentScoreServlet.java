package web;

import service.StudentScore;
import service.impl.StudentScoreImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentScoreServlet extends AllBaseServlet {
    StudentScore studentScore=new StudentScoreImpl();

    protected void stuGrade(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取登录界面中的学号
        String id=(String)req.getSession().getAttribute("userId");
        //根据学号把学生选修的课程查出来
        List<pojo.StudentScore> studentScores = studentScore.stuGrade(id);
       if(studentScores.get(2)==null){
           req.setAttribute("zero","zero");
       }
        //保存到session域
        req.getSession().setAttribute("studentScores",studentScores);
        //请求转发给gradeSelect.jsp
        req.getRequestDispatcher("/WebContent/gradeSelect.jsp").forward(req,resp);

    }
}

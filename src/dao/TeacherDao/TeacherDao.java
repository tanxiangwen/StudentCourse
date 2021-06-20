package dao.TeacherDao;

import pojo.Classroom;
import pojo.TeacherCourse;
import pojo.TeacherInfomation;
import pojo.TeacherSelectCourse;

import java.util.List;

public interface TeacherDao {
    public TeacherInfomation teaIfo(String tId);
    public int updatePsw(String password,String id);
   /* public int  updateCourse(String cId,String tId);
    public List<TeacherSelectCourse> selectCourse(String tId );*/
   //根据自己的教师号查出哪些学生选择了课程:学号，姓名，成绩
    public List<TeacherSelectCourse> selectStudent(String tId);
    public int updateGrade(String sId,String cId,String grade);
    //查询自己教的课程
 public List<TeacherCourse> select(String id);
 //教室空闲
    public List<Classroom> classroom();
}

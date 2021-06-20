package service.Teacher;

import pojo.Classroom;
import pojo.TeacherCourse;
import pojo.TeacherInfomation;
import pojo.TeacherSelectCourse;

import java.util.List;

public interface TeacherService {
    /**
     * 个人信息
     * @param tId
     * @return
     */
    public TeacherInfomation teaIfo(String tId);

    /**
     * 修改密码
     * @param password
     * @param id
     * @return
     */
    public int updatePsw(String password,String id);
    //根据自己的教师号查出哪些学生选择了课程:学号，姓名，成绩
    public List<TeacherSelectCourse> selectStudent(String tId);
    public int updateGrade(String sId,String cId,String grade);
    public List<TeacherCourse> select(String id);
    public List<Classroom> classroom();
   /* public int  updateCourse(String cId,String tId);
    public List<TeacherSelectCourse> selectCourse(String tId);*/
}

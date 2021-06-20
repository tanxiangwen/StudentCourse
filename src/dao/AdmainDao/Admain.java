package dao.AdmainDao;

import pojo.*;

import java.util.List;

public interface Admain {
    //密码修改
    public int updatePsw(String password,String id);
    //添加学生里边是(学号，姓名初始密码院系)
    public int addStu(AddstudentDetail addstudentDetail);
    //保存学生初始密码
    public int savePass(String aId,String apsw);
    //学生详细信息:学号，性别，手机号码，住址
    public int addStuDetail(AddStudentDetails addstudentDetails);
    //添加教师信息
    public int addTea(TeacherDetail teacherDetail);
    //保存教师初始化密码
    public int savePassTea(String tId,String apsw);
    //保存教师详细信息
    public int addTeaDetail(TeacherDetails teacherDetails);
    //添加课程信息
    public int addCourse(CourseAdd courseAdd);
    //展示全部学生信息
    public List<QueryStudent> QueryStu();
    //展示全部教师信息
    public List<QueryTeacher> QueryTea();


}

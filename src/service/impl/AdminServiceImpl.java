package service.impl;

import dao.AdmainDao.Admain;
import dao.impl.AdmainImpl;
import pojo.*;
import service.Admin.AdminService;

import java.util.List;

public class AdminServiceImpl implements AdminService {
    Admain admain=new AdmainImpl();

    @Override
    public int updatePsw(String password, String id) {
        return admain.updatePsw(password,id);
    }

    @Override
    public int addStu(AddstudentDetail addstudentDetail) {
       return  admain.addStu(addstudentDetail);
    }

    @Override
    public int savePass(String aId, String apsw) {
       return  admain.savePass(aId,apsw);
    }

    @Override
    public int addStuDetail(AddStudentDetails addstudentDetails) {
        return admain.addStuDetail(addstudentDetails);
    }

    @Override
    public int addTea(TeacherDetail teacherDetail) {
        return admain.addTea(teacherDetail);
    }

    @Override
    public int savePassTea(String tId, String apsw) {
        return admain.savePassTea(tId,apsw);

    }

    @Override
    public int addTeaDetail(TeacherDetails teacherDetails) {
        return admain.addTeaDetail(teacherDetails);
    }

    @Override
    public int addCourse(CourseAdd courseAdd) {
        return admain.addCourse(courseAdd);
    }

    @Override
    public List<QueryStudent> QueryStu() {
       return admain.QueryStu();
    }

    @Override
    public List<QueryTeacher> QueryTea() {
        return admain.QueryTea();
    }
}

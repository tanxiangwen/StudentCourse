package service.impl;

import dao.TeacherDao.TeacherDao;
import dao.impl.TeacherDaoImpl;
import pojo.Classroom;
import pojo.TeacherCourse;
import pojo.TeacherInfomation;
import pojo.TeacherSelectCourse;
import service.Teacher.TeacherService;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {
    TeacherDao teacherDao=new TeacherDaoImpl();

    @Override
    public TeacherInfomation teaIfo(String tId) {
        return teacherDao.teaIfo(tId);

    }

    @Override
    public int updatePsw(String password, String id) {
       return teacherDao.updatePsw(password,id);
    }

    @Override
    public List<TeacherSelectCourse> selectStudent(String tId) {
        return teacherDao.selectStudent(tId);
    }

    @Override
    public int updateGrade(String sId, String cId, String grade) {
        return teacherDao.updateGrade(sId,cId,grade);
    }
    public List<TeacherCourse> select(String id){
        return teacherDao.select(id);
    }
    public List<Classroom> classroom(){
        return teacherDao.classroom();
    }

  /*  @Override
    public int updateCourse(String cId, String tId) {
        return teacherDao.updateCourse(cId,tId);
    }

    @Override
    public List<TeacherSelectCourse> selectCourse(String tId) {
        return  teacherDao.selectCourse(tId);
    }*/
}

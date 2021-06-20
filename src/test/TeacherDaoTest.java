package test;

import dao.TeacherDao.TeacherDao;
import dao.impl.TeacherDaoImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherDaoTest {
     TeacherDao teacherDao=new TeacherDaoImpl();
    @Test
    public void teaIfo() {
        System.out.println(teacherDao.teaIfo("1"));
    }
    @Test
    public void text(){
        teacherDao.updatePsw("123456","1");
    }
    @Test
    public void text1(){
        System.out.println(teacherDao.selectStudent("1"));
    }
}
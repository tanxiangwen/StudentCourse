package test;

import dao.Dao.StudentDao;
import dao.impl.StudentDaoImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentDaoTest {
StudentDao studentDao=new StudentDaoImpl();
    @Test
    public void selectUser() {
        System.out.println(studentDao.selectUser("1"));
    }
    @Test
    public void updatePsw(){
        studentDao.updatePsw("123456","1");

    }
}
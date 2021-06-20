package test;

import dao.AdmainDao.Admain;
import dao.impl.AdmainImpl;
import org.junit.Test;
import pojo.AddStudentDetails;
import pojo.AddstudentDetail;

import static org.junit.Assert.*;

public class AdmainTest {
    Admain admain = new AdmainImpl();

    @Test
    public void addStu() {
        admain.addStu(new AddstudentDetail("20", "张三", "1111", "1"));
    }

    @Test
    public void savePass() {
        admain.savePass("20", "1111");
    }

    @Test
    public void addStuDetail() {
        admain.addStuDetail(new AddStudentDetails("20", "男", "22222es", "上海"));
    }

    @Test
    public void test() {
        System.out.println(admain.QueryTea());
    }
}
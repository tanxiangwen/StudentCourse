package test;

import dao.Dao.chooseCourseAdd;
import dao.impl.chooseCourseAddImpl;
import org.junit.Test;
import pojo.chooseCourse;

import static org.junit.Assert.*;

public class chooseCourseAddTest {
    chooseCourseAdd chooseCourseAdd=new chooseCourseAddImpl();

    @Test
    public void add() {
        chooseCourseAdd.add(new chooseCourse("7","5",null));
    }
}
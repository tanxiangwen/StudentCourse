package test;

import dao.Dao.CourseDao;
import dao.impl.CourseDaoImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseDaoTest {
    CourseDao courseDao = new CourseDaoImpl();

    @Test
    public void showCourse() {
        System.out.println(courseDao.showCourse());
    }
@Test
public void list(){
    System.out.println(courseDao.QueryCourseBypage(1,5));
}
   /* public void text() {
        return courseDao.update("8", "80");
    }*/
}
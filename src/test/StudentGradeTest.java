package test;

import dao.Dao.StudentGrade;
import dao.impl.StudentGradeImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {
     StudentGrade studentGrade=new StudentGradeImpl();
    @Test
    public void stuGrade() {
        System.out.println(studentGrade.stuGrade("1"));
    }
}
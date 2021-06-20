package dao.impl;

import dao.Dao.BaseDao;
import dao.Dao.StudentGrade;
import pojo.StudentScore;

import java.util.List;

public class StudentGradeImpl extends BaseDao implements StudentGrade {
    @Override
    public List<StudentScore> stuGrade(String id) {
        String sql="SELECT student.`sId`,course.`cName`,choosecourse.`grade` FROM student JOIN choosecourse ON student.`sId`=choosecourse.`sId` JOIN course ON choosecourse.`cId`=course.`cId` WHERE student.`sId`=?";
        return  QueryforList(StudentScore.class,sql,id);
    }
}

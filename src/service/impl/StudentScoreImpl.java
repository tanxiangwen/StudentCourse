package service.impl;

import dao.Dao.StudentGrade;
import dao.impl.StudentGradeImpl;
import service.StudentScore;

import java.util.List;

public class StudentScoreImpl implements StudentScore {
    StudentGrade studentGrade=new StudentGradeImpl();
    /**
     * 展示学生选修的课程和成绩
     * @param id
     * @return
     */
    @Override
    public List<pojo.StudentScore> stuGrade(String id) {
        return studentGrade.stuGrade(id);

    }
}

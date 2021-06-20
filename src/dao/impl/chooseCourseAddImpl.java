package dao.impl;

import dao.Dao.BaseDao;
import dao.Dao.CourseDao;
import dao.Dao.chooseCourseAdd;
import pojo.CourseItem;
import pojo.CourseStuItem;
import pojo.chooseCourse;

import java.util.List;

public class chooseCourseAddImpl extends BaseDao implements chooseCourseAdd {

    @Override
    public int add(chooseCourse choose) {
         String sql="insert into choosecourse values(?,?,?)";
         return update(sql,choose.getsId(),choose.getcId(),choose.getGrade());
    }

    @Override
    public List<CourseStuItem> showing(String id) {
       String sql="SELECT course.cId,course.`cName`,course.`credit`,course.`period`,course.`cPlace`,teacher.`tName` FROM student JOIN choosecourse ON student.`sId`=choosecourse.`sId` JOIN course ON choosecourse.`cId`=course.`cId` JOIN teacher ON course.`tId`=teacher.`tId` WHERE student.`sId`=?";
             return QueryforList(CourseStuItem.class,sql,id);
    }

    @Override
    public chooseCourse Quaryone(String id, String cId) {
        String sql="select * from choosecourse where choosecourse.sId=? and choosecourse.cId=?";
        return Queryforone(chooseCourse.class,sql,id,cId);
    }
}

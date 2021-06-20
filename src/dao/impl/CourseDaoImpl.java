package dao.impl;

import dao.Dao.BaseDao;
import dao.Dao.CourseDao;
import pojo.CourseItem;

import java.util.List;

public class CourseDaoImpl extends BaseDao implements CourseDao {

    /**
     * 展示选课科目详细信息
     * @return
     */
    @Override
    public List<CourseItem> showCourse() {
         String sql="SELECT course.cId, course.`cName`,course.`credit`,course.`period`,course.`cPlace`,teacher.`tName`,course.`cNumAll`,course.`cNum`  FROM course JOIN teacher ON course.`tId`=teacher.`tId`";
         return QueryforList(CourseItem.class,sql);
    }

    /**
     * 查出数据，进行数据变化
     * @param sId
     * @return
     */
    @Override
    public CourseItem QueryCourseByid(String sId) {
        String sql="SELECT course.cId, course.`cName`,course.`credit`,course.`period`,course.`cPlace`,teacher.`tName`,course.`cNumAll`,course.`cNum`  FROM course JOIN teacher ON course.`tId`=teacher.`tId` where course.cId=?";
        return Queryforone(CourseItem.class,sql,sId);

    }

    @Override
    public int update(String cId,String person) {
        String sql="update course set cNum=? where course.cId=?";
        return update(sql,person,cId);
    }

    @Override
    public List<CourseItem>QueryCourseBypage(Integer begin, Integer pageSize) {
        String sql="SELECT course.cId, course.`cName`,course.`credit`,course.`period`,course.`cPlace`,teacher.`tName`,course.`cNumAll`,course.`cNum`  FROM course JOIN teacher ON course.`tId`=teacher.`tId` limit ?,?";
             return QueryforList(CourseItem.class,sql,begin,pageSize);
    }

    @Override
    public Integer QueryItems() {
        String sql="select count(*) from course";
        Number number=(Number) Queryforsingalone(sql);
        return number.intValue();

    }

}

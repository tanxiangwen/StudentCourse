package dao.Dao;

import pojo.CourseItem;

import java.util.List;

public interface CourseDao {

    public List<CourseItem> showCourse();
    public CourseItem QueryCourseByid(String sId);
    //数据更新
    public int update(String cId,String person);
    //分页显示数据
    public List<CourseItem> QueryCourseBypage(Integer begin,Integer pageSize);

    public Integer QueryItems();

}

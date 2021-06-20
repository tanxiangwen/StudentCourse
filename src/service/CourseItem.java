package service;

import pojo.Page;

import java.util.List;

public interface CourseItem {
    public List<pojo.CourseItem> showCourse();
    public pojo.CourseItem QueryCourseByid(String sId);
    public int update(String cId,String person);
    //分页显示数据
    public Page page(Integer pageNo, Integer pageSize);
}

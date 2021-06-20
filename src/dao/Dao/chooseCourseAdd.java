package dao.Dao;

import pojo.CourseItem;
import pojo.CourseStuItem;
import pojo.chooseCourse;

import java.util.List;

/**
 * 保存选择的课程
 */
public interface chooseCourseAdd {
    //添加
    public int add(chooseCourse choose);
    //展示
    public List<CourseStuItem> showing(String id);
    //根据号查找
    public chooseCourse Quaryone(String id,String cId);
}

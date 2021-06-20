package service;

import pojo.CourseItem;
import pojo.CourseStuItem;
import pojo.chooseCourse;

import java.util.List;

public interface choosecourseService {
    public int add(chooseCourse choose);
    public List<CourseStuItem> showing(String id);
    public chooseCourse Queryone(String id,String cId);
}

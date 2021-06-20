package service.impl;

import dao.Dao.chooseCourseAdd;
import dao.impl.chooseCourseAddImpl;
import pojo.CourseItem;
import pojo.CourseStuItem;
import pojo.chooseCourse;
import service.choosecourseService;

import java.util.List;

public class choosecourseServiceImpl implements choosecourseService {
    chooseCourseAdd chooseCourseAdd=new chooseCourseAddImpl();
    @Override
    public int add(chooseCourse choose) {
        return chooseCourseAdd.add(choose);
    }

    @Override
    public List<CourseStuItem> showing(String id) {
        return chooseCourseAdd.showing(id);
    }

    @Override
    public chooseCourse Queryone(String id, String cId) {
       return  chooseCourseAdd.Quaryone(id,cId);
    }
}

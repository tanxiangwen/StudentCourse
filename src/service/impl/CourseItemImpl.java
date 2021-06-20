package service.impl;

import dao.Dao.CourseDao;
import dao.impl.CourseDaoImpl;
import pojo.Page;
import service.CourseItem;

import java.util.List;

public class CourseItemImpl implements CourseItem {
    CourseDao courseDao=new CourseDaoImpl();
    @Override
    public List<pojo.CourseItem> showCourse() {
        return courseDao.showCourse();
    }

    @Override
    public pojo.CourseItem QueryCourseByid(String sId) {
        return courseDao.QueryCourseByid(sId);
    }

    /**
     * 改了好几天，选课的时候点击选课后可选人数应该减一，但总是不减，找了好久才发现是这个方法的两次参数传递反了
     * @param cId
     * @param person
     * @return
     */

    @Override
    public int update(String cId, String person) {
        return courseDao.update(cId,person);
    }

    @Override
    public Page page(Integer pageNo, Integer pageSize) {
        Page<pojo.CourseItem> page=new Page<>();
       // page.setPageNo(pageNo);
       // page.setPageSize(pageSize);
        //获取总记录条数
        Integer pageTotalCount = courseDao.QueryItems();
        page.setPageTotalCount(pageTotalCount);
        //总页数
        Integer pageTotal=pageTotalCount/pageSize;
        if(pageTotalCount%pageSize>0){
            pageTotal++;
        }
        //起始页规范
        if(pageNo>pageTotal){
            pageNo=pageTotal;
        }
        if(pageNo<1){
            pageNo=1;
        }
        page.setPageNo(pageNo);
        page.setPageTotal(pageTotal);
        page.setPageTotal(pageTotal);
        //每页显示的数据
        Integer begin=(pageNo-1)*pageSize;
        List<pojo.CourseItem> courseItems = courseDao.QueryCourseBypage(begin, pageSize);
        page.setItems(courseItems);
        return page;
    }


}

package dao.impl;

import dao.Dao.BaseDao;
import dao.TeacherDao.TeacherDao;
import pojo.Classroom;
import pojo.TeacherCourse;
import pojo.TeacherInfomation;
import pojo.TeacherSelectCourse;

import java.util.List;

public class TeacherDaoImpl extends BaseDao implements TeacherDao {
    @Override
    public TeacherInfomation teaIfo(String tId) {
        String sql="SELECT teacher.`tId`,teacher.`tName`,department.`dName`,teadetail.`tSex`,teadetail.`tAge`,teadetail.`tEdu`,teadetail.`tTitle`,teadetail.`tSch`,teadetail.`tHealth` FROM teacher JOIN teadetail ON teacher.`tId`=teadetail.`tId` JOIN department ON teacher.`dId`=department.`dId` WHERE teacher.`tId`=?";
         return Queryforone(TeacherInfomation.class,sql,tId);
    }

    @Override
    public int updatePsw(String password, String id) {
        String sql="update teacher_admain set apsw=? where aid=? ";
        return update(sql,password,id);
    }

    @Override
    public List<TeacherSelectCourse> selectStudent(String tId) {
        String sql="SELECT student.`sId`,student.`sName`,course.`cName`,choosecourse.`grade`,choosecourse.`cId` FROM choosecourse JOIN student ON choosecourse.`sId`=student.`sId` JOIN course ON choosecourse.`cId`=course.`cId` WHERE course.`tId`=?;";
        return QueryforList(TeacherSelectCourse.class,sql,tId);
    }

    @Override
    public int updateGrade(String sId, String cId,String grade) {
        String sql="update choosecourse set grade=? where choosecourse.sId=? and choosecourse.cId=?";
        return update(sql,grade,sId,cId);
    }

    /**
     * 根据教师号查询
     * @param id
     * @return
     */

    @Override
    public List<TeacherCourse> select(String id) {
        String sql="SELECT course.`cId`,course.`cName`,course.`credit`,course.`period`,course.`cPlace`,course.`cNum` FROM course JOIN teacher ON course.`tId`=teacher.`tId` WHERE teacher.`tId`=?";
        return QueryforList(TeacherCourse.class,sql,id);
    }

    @Override
    public List<Classroom> classroom() {
        String sql="select * from room";
        return  QueryforList(Classroom.class,sql);
    }

    /**
     * 选课表中更新教师信息
     * @param cId
     * @param tId
     * @return
     */
  /*  @Override
    public int updateCourse(String cId, String tId) {
        String sql="UPDATE course SET course.tId=? WHERE course.cId=? AND course.tId IS NULL";
        return update(sql,tId,cId);
    }

    @Override
    public List<TeacherSelectCourse> selectCourse(String tId) {
        String sql="select course.cId,course.cName,course.credit,course.period,course.cPlace,course.cNum from course where course.tId=?";
        return  QueryforList(TeacherSelectCourse.class,sql,tId);

    }*/
}

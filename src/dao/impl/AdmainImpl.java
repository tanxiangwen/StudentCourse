package dao.impl;

import dao.AdmainDao.Admain;
import dao.Dao.BaseDao;
import pojo.*;

import java.util.List;

public class AdmainImpl extends BaseDao implements Admain {
    @Override
    public int updatePsw(String password, String id) {
        String sql="update admin set apsw=? where aid=? ";
        return update(sql,password,id);
    }

    @Override
    public int addStu(AddstudentDetail addstudentDetail) {
        String sql="insert into student(sId,sName,sPass,dId) values(?,?,?,?)";

        return  update(sql,addstudentDetail.getsId(),addstudentDetail.getsName(),addstudentDetail.getsPass(),addstudentDetail.getdId());
    }

    @Override
    public int savePass(String aId, String apsw) {
        String sql="insert into user_admain(aId,apsw) values(?,?)";
        return update(sql,aId,apsw);
    }

    @Override
    public int addStuDetail(AddStudentDetails addstudentDetails) {
        String sql="insert into studetail(sId,sSex,sMobil,sAddress) values(?,?,?,?)";
        return update(sql,addstudentDetails.getsId(),addstudentDetails.getsSex(),addstudentDetails.getsMobil(),addstudentDetails.getsAddress());

    }

    /**
     * 添加教师
     * @param teacherDetail
     * @return
     */
    @Override
    public int addTea(TeacherDetail teacherDetail) {
        String sql="insert into Teacher(tId,tName,tPass,dId)values(?,?,?,?)";
        return update(sql,teacherDetail.gettId(),teacherDetail.gettName(),teacherDetail.gettPass(),teacherDetail.getdId());
    }

    /**
     * 保存教师密码
     * @param tId
     * @param apsw
     * @return
     */
    @Override
    public int savePassTea(String tId, String apsw) {
        String sql="insert into teacher_admain(aid,apsw)values(?,?)";
        return  update(sql,tId,apsw);
    }

    /**
     * 教师详细信息
     * @param teacherDetails
     * @return
     */
    @Override
    public int addTeaDetail(TeacherDetails teacherDetails) {
        String sql="insert into teadetail(tId,tSex,tAge,tEdu,tTitle,tSch,tHealth)values(?,?,?,?,?,?,?)";
        return update(sql,teacherDetails.gettId(),teacherDetails.gettSex(),teacherDetails.gettAge(),teacherDetails.gettEdu(),teacherDetails.gettTitle(),teacherDetails.gettSch(),teacherDetails.gettHealth());

    }

    @Override
    public int addCourse(CourseAdd courseAdd) {
        String sql="insert into course(cId,cName,tId,credit,period,cPlace,cNumAll,cNum,dId)values(?,?,?,?,?,?,?,?,?)";
        return update(sql,courseAdd.getcId(),courseAdd.getcName(),courseAdd.gettId(),courseAdd.getCredit(),courseAdd.getPeriod(),courseAdd.getcPlace(),courseAdd.getcNumAll(),courseAdd.getcNum(),courseAdd.getdId());
    }

    @Override
    public List<QueryStudent> QueryStu() {
        String sql="SELECT student.`sId`,student.`sName`,department.`dName`,studetail.`sSex`,studetail.`sMobil`,studetail.`sAddress` FROM student JOIN studetail ON student.`sId`=studetail.`sId` JOIN department ON student.`dId`=department.`dId`";
        return QueryforList(QueryStudent.class,sql);
    }

    @Override
    public List<QueryTeacher> QueryTea() {
        String sql="SELECT teacher.`tId`,teacher.`tName`,department.`dName`,teadetail.`tSex`,teadetail.`tAge`,teadetail.`tEdu`,teadetail.`tTitle`,teadetail.`tSch`,teadetail.`tHealth` FROM teacher JOIN teadetail ON teacher.`tId`=teadetail.`tId` JOIN department ON teacher.`dId`=department.`dId`";
        return QueryforList(QueryTeacher.class,sql);
    }

   /* @Override
    public int addStuDetail(AddstudentDetail addstudentDetail) {
        String sql="insert into studentail(sId,sSex,sMobil,sAddress) values(?,?,?,?)";
        return update(sql,addstudentDetail.getsId(),addstudentDetail.getsSex(),addstudentDetail.getsMobil(),addstudentDetail.getsAddress());
    }*/
}

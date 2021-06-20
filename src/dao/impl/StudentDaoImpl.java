package dao.impl;

import dao.Dao.BaseDao;
import dao.Dao.StudentDao;
import pojo.StudentInformation;

public class StudentDaoImpl extends BaseDao implements StudentDao {
    /**
     * 查询学生详细信息
     * @param id
     * @return
     */
    @Override
    public StudentInformation selectUser(String id) {
        String sql="select student.sId,student.sName,student.dId,studetail.sSex,student.sPass,studetail.sAddress  from student join studetail on student.sId=studetail.sId where student.sId=?";
        return Queryforone(StudentInformation.class,sql,id);
    }

    /**
     * 修改密码
     * @param id
     * @return
     */
    @Override
    public int updatePsw(String password, String id) {
        String sql="update user_admain set apsw=? where aid=? ";
         return update(sql,password,id);
    }

    /**
     * 退选课程
     * @param id
     * @param cId
     * @return
     */
    @Override
    public int delete(String id, String cId) {
        String sql="delete from choosecourse where choosecourse.sId=? and choosecourse.cId=? ";
        return update(sql,id,cId);
    }
}

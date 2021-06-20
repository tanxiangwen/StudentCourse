package dao.Dao;

import pojo.StudentInformation;

public interface StudentDao {
    //根据登录的学号查找学生的个人信息
    public StudentInformation selectUser(String id);
    public int updatePsw(String password,String id);
    //退选自己的课程(根据学号和课程号)
    public int delete(String id,String cId);
}

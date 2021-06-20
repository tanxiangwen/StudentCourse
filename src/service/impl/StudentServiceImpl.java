package service.impl;
/**
 * 查看自己的个人信息
 */

import dao.Dao.StudentDao;
import dao.impl.StudentDaoImpl;
import pojo.StudentInformation;
import service.StudentService;

public class StudentServiceImpl implements StudentService {
    StudentDao studentDao=new StudentDaoImpl();
    @Override
    public StudentInformation selectUser(String id) {
        return studentDao.selectUser(id);
    }

    @Override
    public int updatePsw(String password, String id) {
        return studentDao.updatePsw(password,id);
    }

    @Override
    public int delete(String id, String cId) {
       return  studentDao.delete(id,cId);
    }
}

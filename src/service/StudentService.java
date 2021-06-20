package service;

import pojo.StudentInformation;

public interface StudentService {
    public StudentInformation selectUser(String id);
    public int updatePsw(String password,String id);
    public int delete(String id, String cId);
}

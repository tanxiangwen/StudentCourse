package test;

import dao.Dao.userDao;
import dao.impl.userDaoImpl;
import org.junit.Test;
import pojo.LoginUser;

import static org.junit.Assert.*;

public class userDaoTest {
    userDao userDao=new userDaoImpl();
    @Test
    public void checkuser() {
       LoginUser loginUser= userDao.checkuser(new LoginUser("201909280206","12345"));
        System.out.println(loginUser);
    }

    @Test
    public void checkuserIsteacher() {
        System.out.println(userDao.checkuserIsteacher(new LoginUser("120007","12345")));
    }

    @Test
    public void checkuserIsadmain() {
        System.out.println(userDao.checkuserIsadmain(new LoginUser("1","12345")));
    }
}
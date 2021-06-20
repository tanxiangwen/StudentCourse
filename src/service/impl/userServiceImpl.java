package service.impl;

import dao.Dao.userDao;
import dao.impl.userDaoImpl;
import pojo.LoginUser;
import service.userService;

public class userServiceImpl implements userService {
    userDao userDao=new userDaoImpl();
    @Override
    public LoginUser checkuser(LoginUser user) {
        return userDao.checkuser(user);

    }

    @Override
    public LoginUser checkuserIsteacher(LoginUser user) {
              return userDao.checkuserIsteacher(user);
    }

    @Override
    public LoginUser checkuserIsadmain(LoginUser user) {
          return userDao.checkuserIsadmain(user);
    }
}

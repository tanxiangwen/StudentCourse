package dao.Dao;

import pojo.LoginUser;

/**
 * 登录验证方法
 */
public interface userDao {
    public LoginUser checkuser(LoginUser user);
    public LoginUser checkuserIsteacher(LoginUser user);
    public LoginUser checkuserIsadmain(LoginUser user);

}

package service;

import pojo.LoginUser;

public interface userService {
    public LoginUser checkuser(LoginUser user);
    public LoginUser checkuserIsteacher(LoginUser user);
    public LoginUser checkuserIsadmain(LoginUser user);
}

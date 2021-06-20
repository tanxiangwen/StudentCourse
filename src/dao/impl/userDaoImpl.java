package dao.impl;

import dao.Dao.BaseDao;
import dao.Dao.userDao;
import pojo.LoginUser;

public class userDaoImpl extends BaseDao implements userDao {
    /**
     * 学生验证
     * @param user
     * @return
     */
    @Override
    public LoginUser checkuser(LoginUser user) {
        String sql="select * from user_admain where aid=? and apsw=? ";
        return Queryforone(LoginUser.class,sql,user.getAid(),user.getApsw());
    }

    /**
     * 老师验证
     * @param user
     * @return
     */
    @Override
    public LoginUser checkuserIsteacher(LoginUser user) {
        String sql="select * from teacher_admain where aid=? and apsw=? ";
        return Queryforone(LoginUser.class,sql,user.getAid(),user.getApsw());

    }

    @Override
    public LoginUser checkuserIsadmain(LoginUser user) {
        String sql="select * from admin where aid=? and apsw=? ";
        return Queryforone(LoginUser.class,sql,user.getAid(),user.getApsw());

    }

}

package pojo;

public class LoginUser {
      String aid;//账号
      String apsw;//密码
    String userType;//登录者的类型

    public LoginUser(String aid, String apsw, String userType) {
        this.aid = aid;
        this.apsw = apsw;
        this.userType = userType;
    }

    public LoginUser() {
    }

    public LoginUser(String aid, String apsw) {
        this.aid = aid;
        this.apsw = apsw;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getApsw() {
        return apsw;
    }

    public void setApsw(String apsw) {
        this.apsw = apsw;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "aid='" + aid + '\'' +
                ", apsw='" + apsw + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}

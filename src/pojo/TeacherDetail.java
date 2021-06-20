package pojo;

public class TeacherDetail {
    String tId;//教师号
    String tName;//姓名
    String tPass;//密码
    String dId;//院系

    public TeacherDetail() {
    }

    public TeacherDetail(String tId, String tName, String tPass, String dId) {
        this.tId = tId;
        this.tName = tName;
        this.tPass = tPass;
        this.dId = dId;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettPass() {
        return tPass;
    }

    public void settPass(String tPass) {
        this.tPass = tPass;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    @Override
    public String toString() {
        return "TeacherDetail{" +
                "tId='" + tId + '\'' +
                ", tName='" + tName + '\'' +
                ", tPass='" + tPass + '\'' +
                ", dId='" + dId + '\'' +
                '}';
    }
}

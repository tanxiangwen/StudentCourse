package pojo;

public class TeacherInfomation {
    String tId;//教师号
    String tName;//教师姓名
    String dName;//院系
    String tSex;//性别
    String tAge;//年龄
    String tEdu;//学历
    String tTitle;//职称
    String tSch;//毕业院校
    String tHealth;//健康状况

    public TeacherInfomation() {
    }

    public TeacherInfomation(String tId, String tName, String dName, String tSex, String tAge, String tEdu, String tTitle, String tSch, String tHealth) {
        this.tId = tId;
        this.tName = tName;
        this.dName = dName;
        this.tSex = tSex;
        this.tAge = tAge;
        this.tEdu = tEdu;
        this.tTitle = tTitle;
        this.tSch = tSch;
        this.tHealth = tHealth;
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

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String gettSex() {
        return tSex;
    }

    public void settSex(String tSex) {
        this.tSex = tSex;
    }

    public String gettAge() {
        return tAge;
    }

    public void settAge(String tAge) {
        this.tAge = tAge;
    }

    public String gettEdu() {
        return tEdu;
    }

    public void settEdu(String tEdu) {
        this.tEdu = tEdu;
    }

    public String gettTitle() {
        return tTitle;
    }

    public void settTitle(String tTitle) {
        this.tTitle = tTitle;
    }

    public String gettSch() {
        return tSch;
    }

    public void settSch(String tSch) {
        this.tSch = tSch;
    }

    public String gettHealth() {
        return tHealth;
    }

    public void settHealth(String tHealth) {
        this.tHealth = tHealth;
    }

    @Override
    public String toString() {
        return "TeacherInfomation{" +
                "tId='" + tId + '\'' +
                ", tName='" + tName + '\'' +
                ", dName='" + dName + '\'' +
                ", tSex='" + tSex + '\'' +
                ", tAge='" + tAge + '\'' +
                ", tEdu='" + tEdu + '\'' +
                ", tTitle='" + tTitle + '\'' +
                ", tSch='" + tSch + '\'' +
                ", tHealth='" + tHealth + '\'' +
                '}';
    }
}

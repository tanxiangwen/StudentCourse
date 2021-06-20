package pojo;

public class TeacherSelectCourse {
    String sId;
    String sName;
    String cName;
    String grade;
    String cId;

    public TeacherSelectCourse() {
    }

    public TeacherSelectCourse(String sId, String sName, String cName, String grade,String cId) {
        this.sId = sId;
        this.sName = sName;
        this.cName = cName;
        this.grade = grade;
        this.cId=cId;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "TeacherSelectCourse{" +
                "sId='" + sId + '\'' +
                ", sName='" + sName + '\'' +
                ", cName='" + cName + '\'' +
                ", grade='" + grade + '\'' +
                ", cId='" + cId + '\'' +
                '}';
    }

    /* String cId;//课程号
    String cName;//名称
    String credit;//学分
    String period;//学时
    String cPlace;//上课地点
    String cNum;//报名人数

    public TeacherSelectCourse() {
    }

    public TeacherSelectCourse(String cId, String cName, String credit, String period, String cPlace, String cNum) {
        this.cId = cId;
        this.cName = cName;
        this.credit = credit;
        this.period = period;
        this.cPlace = cPlace;
        this.cNum = cNum;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getcPlace() {
        return cPlace;
    }

    public void setcPlace(String cPlace) {
        this.cPlace = cPlace;
    }

    public String getcNum() {
        return cNum;
    }

    public void setcNum(String cNum) {
        this.cNum = cNum;
    }

    @Override
    public String toString() {
        return "TeacherSelectCourse{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", credit='" + credit + '\'' +
                ", period='" + period + '\'' +
                ", cPlace='" + cPlace + '\'' +
                ", cNum='" + cNum + '\'' +
                '}';
    }*/
}

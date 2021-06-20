package pojo;

public class TeacherCourse {
    String cId;//课程号
    String cName;//课程名
    String credit;//学分
    String period;//学时
    String cPlace;//上课地点
    String cNum;//已选人数

    public TeacherCourse() {
    }

    public TeacherCourse(String cId, String cName, String credit, String period, String cPlace, String cNum) {
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
        return "TeacherCourse{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", credit='" + credit + '\'' +
                ", period='" + period + '\'' +
                ", cPlace='" + cPlace + '\'' +
                ", cNum='" + cNum + '\'' +
                '}';
    }
}

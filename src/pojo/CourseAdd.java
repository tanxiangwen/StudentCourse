package pojo;

public class CourseAdd {
    String cId;//课程号
    String cName;//课程名
    String tId;//授课老师
    String credit;//学分
    String period;//学时
    String cPlace;//上课地点
    String cNumAll;//总人数
    String cNum;//剩余人数
    String dId;//院系

    public CourseAdd() {
    }

    public CourseAdd(String cId, String cName, String tId, String credit, String period, String cPlace, String cNumAll, String cNum, String dId) {
        this.cId = cId;
        this.cName = cName;
        this.tId = tId;
        this.credit = credit;
        this.period = period;
        this.cPlace = cPlace;
        this.cNumAll = cNumAll;
        this.cNum = cNum;
        this.dId = dId;
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

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
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

    public String getcNumAll() {
        return cNumAll;
    }

    public void setcNumAll(String cNumAll) {
        this.cNumAll = cNumAll;
    }

    public String getcNum() {
        return cNum;
    }

    public void setcNum(String cNum) {
        this.cNum = cNum;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    @Override
    public String toString() {
        return "CourseAdd{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", tId='" + tId + '\'' +
                ", credit='" + credit + '\'' +
                ", period='" + period + '\'' +
                ", cPlace='" + cPlace + '\'' +
                ", cNumAll='" + cNumAll + '\'' +
                ", cNum='" + cNum + '\'' +
                ", dId='" + dId + '\'' +
                '}';
    }
}

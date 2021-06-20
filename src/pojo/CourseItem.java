package pojo;

/**
 * 选课项
 */
public class CourseItem {
    String cId;//课程号
    String cName;//名称
   String credit;//学分
    String period;//学时
   String cPlace;//上课地点
    String tName;//教师
    String cNumAll;//总的需要人数
    String cNum;//报名人数
    Integer cNumNow;//当前剩余的可报名名额

    public CourseItem() {
    }

    public CourseItem(String cId, String cName, String credit, String period, String cPlace, String tName, String cNumAll, String cNum, Integer cNumNow) {
        this.cId = cId;
        this.cName = cName;
        this.credit = credit;
        this.period = period;
        this.cPlace = cPlace;
        this.tName = tName;
        this.cNumAll = cNumAll;
        this.cNum = cNum;
        this.cNumNow = cNumNow;
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

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
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

    public Integer getcNumNow() {
        cNumNow=Integer.parseInt(cNumAll)-Integer.parseInt(cNum);
        return cNumNow;
    }

    /*public void setcNumNow(String cNumNow) {
        this.cNumNow = cNumNow;
    }*/

    @Override
    public String toString() {
        return "CourseItem{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", credit='" + credit + '\'' +
                ", period='" + period + '\'' +
                ", cPlace='" + cPlace + '\'' +
                ", tName='" + tName + '\'' +
                ", cNumNow=" + getcNumNow() +
                '}';
    }
}

package pojo;

public class CourseStuItem {
    String cId;//课程号
    String cName;//名称
    String credit;//学分
    String period;//学时
    String cPlace;//上课地点
    String tName;//教师

    public CourseStuItem() {
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

    @Override
    public String toString() {
        return "CourseStuItem{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", credit='" + credit + '\'' +
                ", period='" + period + '\'' +
                ", cPlace='" + cPlace + '\'' +
                ", tName='" + tName + '\'' +
                '}';
    }
}

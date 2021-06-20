package pojo;

public class chooseCourse {
    String sId;//学号
    String cId;//课程号
    String grade;//成绩

    public chooseCourse() {
    }

    public chooseCourse(String sId, String cId) {
        this.sId = sId;
        this.cId = cId;
    }

    public chooseCourse(String sId, String cId, String grade) {
        this.sId = sId;
        this.cId = cId;
        this.grade = grade;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "chooseCourse{" +
                "sId='" + sId + '\'' +
                ", cId='" + cId + '\'' +
                ", grade=" + grade +
                '}';
    }
}

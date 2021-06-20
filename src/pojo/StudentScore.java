package pojo;

/**
 * 学生选修成绩
 */
public class StudentScore {
    String sId;//学号
  String cName;
    float grade;//成绩

    public StudentScore() {
    }

    public StudentScore(String cName, float grade) {
        this.cName = cName;
        this.grade = grade;
    }

    public StudentScore(String sId, String cName, float grade) {
        this.sId = sId;
        this.cName = cName;
        this.grade = grade;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cId) {
        this.cName= cId;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentScore{" +
                "sId='" + sId + '\'' +
                ", cId='" + cName + '\'' +
                ", grade=" + grade +
                '}';
    }
}

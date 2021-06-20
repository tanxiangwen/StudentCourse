package pojo;

public class TeacherDetails {
    String tId;
    String tSex;
    String tAge;
    String tEdu;
    String tTitle;
    String tSch;
    String tHealth;

    public TeacherDetails() {
    }

    public TeacherDetails(String tId, String tSex, String tAge, String tEdu, String tTitle, String tSch, String tHealth) {
        this.tId = tId;
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
        return "TeacherDetails{" +
                "tId='" + tId + '\'' +
                ", tSex='" + tSex + '\'' +
                ", tAge='" + tAge + '\'' +
                ", tEdu='" + tEdu + '\'' +
                ", tTitle='" + tTitle + '\'' +
                ", tSch='" + tSch + '\'' +
                ", tHealth='" + tHealth + '\'' +
                '}';
    }
}

package pojo;

/**
 * 学生个人信息属性
 */
public class StudentInformation {
    String sId;//学号
    String sName;//姓名
    String dId;//系号
    String sSex;//性别
    String sPass;//电话
    String sAddress;//地址

    public StudentInformation() {
    }

    public StudentInformation(String sId, String sName, String dId, String sSex, String sPass, String sAddress) {
        this.sId = sId;
        this.sName = sName;
        this.dId = dId;
        this.sSex = sSex;
        this.sPass = sPass;
        this.sAddress = sAddress;
    }

    public String getSId() {
        return sId;
    }

    public void setSId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsPass() {
        return sPass;
    }

    public void setsPass(String sPass) {
        this.sPass = sPass;
    }

    @Override
    public String toString() {
        return "StudentInformation{" +
                "sId='" + sId + '\'' +
                ", sName='" + sName + '\'' +
                ", dId='" + dId + '\'' +
                ", sSex='" + sSex + '\'' +
                ", sPass='" + sPass + '\'' +
                ", sAddress='" + sAddress + '\'' +
                '}';
    }
}

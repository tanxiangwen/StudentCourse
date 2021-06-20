package pojo;

public class AddStudentDetails {
    String sId;
    String sSex;
    String sMobil;//电话
    String sAddress;//住址

    public AddStudentDetails(String sId, String sSex, String sMobil, String sAddress) {
        this.sId = sId;
        this.sSex = sSex;
        this.sMobil = sMobil;
        this.sAddress = sAddress;
    }

    public AddStudentDetails() {

    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public String getsMobil() {
        return sMobil;
    }

    public void setsMobil(String sMobil) {
        this.sMobil = sMobil;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    @Override
    public String toString() {
        return "AddStudentDetails{" +
                "sId='" + sId + '\'' +
                ", sSex='" + sSex + '\'' +
                ", sMobil='" + sMobil + '\'' +
                ", sAddress='" + sAddress + '\'' +
                '}';
    }
}

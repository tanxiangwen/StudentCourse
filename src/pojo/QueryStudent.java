package pojo;

public class QueryStudent {
    String sId;
    String sName;
    String dName;
    String sSex;
    String sMobil;
    String sAddress;

    public QueryStudent() {
    }

    public QueryStudent(String sId, String sName, String dName, String sSex, String sMobil, String sAddress) {
        this.sId = sId;
        this.sName = sName;
        this.dName= dName;
        this.sSex = sSex;
        this.sMobil = sMobil;
        this.sAddress = sAddress;
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

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
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
        return "QueryStudent{" +
                "sId='" + sId + '\'' +
                ", sName='" + sName + '\'' +
                ", dId='" + dName + '\'' +
                ", sSex='" + sSex + '\'' +
                ", sMobil='" + sMobil + '\'' +
                ", sAddress='" + sAddress + '\'' +
                '}';
    }
}

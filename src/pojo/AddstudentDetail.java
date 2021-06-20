package pojo;

/**
 * 添加学生信息
 */
public class AddstudentDetail {
    String sId;//学号
    String sName;//性别
    String sPass;//初始密码
    String dId;//院系
   /* String sSex;
    String sMobil;//电话
    String sAddress;//住址*/

    public AddstudentDetail() {
    }

    public AddstudentDetail(String sId, String sName, String sPass, String dId/*, String sSex, String sMobil, String sAddress*/) {
        this.sId = sId;
        this.sName = sName;
        this.sPass = sPass;
        this.dId = dId;
       /* this.sSex = sSex;
        this.sMobil = sMobil;
        this.sAddress = sAddress;*/
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

    public String getsPass() {
        return sPass;
    }

    public void setsPass(String sPass) {
        this.sPass = sPass;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }


    @Override
    public String toString() {
        return "AddstudentDetail{" +
                "sId='" + sId + '\'' +
                ", sName='" + sName + '\'' +
                ", sPass='" + sPass + '\'' +
                ", dId='" + dId + '\'' +
                '}';
    }
}

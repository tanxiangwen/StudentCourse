package pojo;

public class Classroom {
    String roomName;
    String roomNum;
    String roomTime;

    public Classroom() {
    }

    public Classroom(String roomName, String roomNum, String roomTime) {
        this.roomName = roomName;
        this.roomNum = roomNum;
        this.roomTime = roomTime;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomTime() {
        return roomTime;
    }

    public void setRoomTime(String roomTime) {
        this.roomTime = roomTime;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "roomName='" + roomName + '\'' +
                ", roomNum='" + roomNum + '\'' +
                ", roomTime='" + roomTime + '\'' +
                '}';
    }
}

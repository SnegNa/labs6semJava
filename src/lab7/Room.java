package lab7;

public class Room {
    private String type;
    private int roomSquare;

    public Room(String type, int roomSquare) {
        this.type = type;
        this.roomSquare = roomSquare;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRoomSquare() {
        return roomSquare;
    }

    public void setRoomSquare(int roomSquare) {
        this.roomSquare = roomSquare;
    }




}

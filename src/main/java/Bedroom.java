public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;


    public Bedroom(int capacity, int roomNumber, RoomType roomType, int roomRate){
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomRate = roomRate;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getRoomRate() {
        return this.roomRate;
    }
}

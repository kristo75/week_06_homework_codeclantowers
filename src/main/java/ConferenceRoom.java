public class ConferenceRoom extends Room {

    private String roomName;
    public String getRoomName;


    public ConferenceRoom(int capacity, String roomName){
        super(capacity);
        this.roomName = roomName;
    }

    public String getRoomName(){
        return roomName;
    }

}

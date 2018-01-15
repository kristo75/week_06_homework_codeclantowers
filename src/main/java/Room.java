import java.util.ArrayList;

public class Room {

    private int capacity;
    private ArrayList<ArrayList<Guest>> guests;
    public int roomRate;


    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<ArrayList<Guest>>();
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getGuestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        boolean add = this.guests.add(guests);
    }


    public void removeGuest(Guest guest) {
        this.guests.remove(guests);
    }


}

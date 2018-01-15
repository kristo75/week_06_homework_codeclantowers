import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class RoomTest {

    Room room;
    Guest guest;

    @Before
    public void before(){
        room = new Room(2);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, room.getCapacity());
    }

    @Test
    public void setCapacity(){
        room.setCapacity(2);
        assertEquals(2, room.getCapacity());
    }

    @Test
    public void roomVacant(){
        assertEquals(0, room.getGuestCount());
    }

    @Test
    public abstract void addGuest();{
        room.addGuest(guest);
        assertEquals(2, room.getGuestCount());
    }

    @Test
    public void removeGuest(){
        room.addGuest(guest);
        assertEquals(1, room.getGuestCount());
        room.removeGuest(guest);
        assertEquals(0, room.getGuestCount());
    }
}

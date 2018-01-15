import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public abstract class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 201, RoomType.TWIN, 300);
    }

    @Test
    public void getRoomNumber(){

        assertEquals(201, bedroom.getRoomNumber());
    }

    @Test
    public void getRoomType(){
        assertEquals(RoomType.TWIN, bedroom.getRoomType());
    }

    @Test
    public void setRoomType(){
        bedroom.setRoomType(RoomType.TWIN);
        assertEquals(RoomType.TWIN, bedroom.getRoomType());
    }

    @Test
    public abstract void castleHasRoomRate300();{
        assertEquals(300, bedroom.getRoomRate());
    }


}



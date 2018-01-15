import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class ConferenceRoomTest {

    ConferenceRoom conferenceroom;

    @Before
    conferenceroom = new ConferenceRoom(1000, "Edinburgh Suite");

    @Test
    public abstract void getRoomName();{
        assertEquals("Edinburgh Suite", conferenceroom.getRoomName);
    }
}

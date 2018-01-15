import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceroom;

    @Before
    public void before() {
        conferenceroom = new ConferenceRoom(1000, "Edinburgh Suite");
    }
    @Test
    public void getRoomName() {
        assertEquals("Edinburgh Suite", conferenceroom.getRoomName());
    }
}

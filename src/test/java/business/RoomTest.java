package business;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class RoomTest {

    private Room room;

    @Before
    public void init() {
        room = new Room(123);
    }

    @Test
    public void isFree() {
        room.book(new Date(2019, 06, 27));
        Assert.assertFalse(room.isFree(new Date(2019, 06, 27)));
        Assert.assertTrue(room.isFree(new Date(2019, 06, 30)));
    }



}

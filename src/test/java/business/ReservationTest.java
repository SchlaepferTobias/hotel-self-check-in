package business;

import business.person.Guest;
import org.junit.Before;
import org.junit.Test;

public class ReservationTest {

    private Reservation reservation;

    private Guest guest;

    private Room room;

    private

    @Before
    void init() {
        this.guest = new Guest("Bettinger",
                "Sarah",
                new Address("Binningerstrasse 97", "Allschwil", "4123", "Schweiz"),
                "0794824462",
                "b.sarah2@hotmail.com");
        this.room = new Room(102);
        reservation = new Reservation(guest, 89002, room);
    }

    @Test
    public void testExplicitness() {
        // ist Sarah in Raum Nr. 102 und hat die Buchungsnummer 89002?
        // macht nid so viel Sinn

    }

}

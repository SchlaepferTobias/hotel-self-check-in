package business;

import business.person.Guest;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Reservation {

    private Guest guest;

    private int bookingNr;

    private Room room;

    private final Set<Date> daysOfReservation;

    public Reservation(Guest guest, int bookingNr, Room room) {
        this.guest = guest;
        this.bookingNr = bookingNr;
        this.room = room;
        this.daysOfReservation = new HashSet<>();
    }

    public Guest getGuest() {
        return guest;
    }

    public int getBookingNr() {
        return bookingNr;
    }

    public Room getRoom() {
        return room;
    }

    public Set<Date> getDaysOfReservation() {
        return daysOfReservation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return bookingNr == that.bookingNr &&
                Objects.equals(guest, that.guest) &&
                Objects.equals(room, that.room) &&
                Objects.equals(daysOfReservation, that.daysOfReservation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guest, bookingNr, room, daysOfReservation);
    }
}

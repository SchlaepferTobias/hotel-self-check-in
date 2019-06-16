package business;

public class Reservation {

    private Guest guest;

    private int bookingNr;

    public Reservation(Guest guest, int bookingNr) {
        this.guest = guest;
        this.bookingNr = bookingNr;
    }
}

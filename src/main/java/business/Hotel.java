package business;

import business.person.Guest;

import java.util.*;

public class Hotel implements Institution {

    /**
     * 'list' of all rooms in the hotel
     * Eigentlich Set (=Menge); enthaelt
     * eindeutige Elemente
     */
    private final Set<Room> rooms;
    private final Set<Reservation> reservations;

    private static Hotel hotel;


    private Hotel() {
        this.rooms = new HashSet<>();
        this.reservations = new HashSet<>();
    }

    /**
     * Singleton Hotel
     * @return instance of the hotel
     */
    public static Hotel getInstance() {
        if (hotel == null) {
            hotel = new Hotel();
        }
        return hotel;
    }


    /**
     * Hotel reserviert ein Raum fuer den Gast
     * das heisst die Raumnummer wird auf besetzt gesetzt.
     * fuer eine bestimmte Zeit
     *
     * BIS JETZT KANN NUR _EIN_ DATUM HINZUGEF.WERDEN
     *
     * @param guest
     */
    public void reserveRoom(Guest guest, Date date, int bookingNumber) {
        Room room = getFreeRoom(date);
        reservations.add(new Reservation(guest, bookingNumber, room));
    }

    /**
     * WAS PASSIERT HIER ?
     * von den Raeumen(Set) werden alle genommen(stream)
     * gefiltert, die, die frei sind, und herausgegeben;
     * kann auch 0 sein, dann wird eine Runtimexception geworfen.
     *
     * @param date
     * @return
     */

    private Room getFreeRoom(Date date) {
        return rooms.stream()
                .filter(room -> room.isFree(date))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("all rooms are booked"));
    }

    /**
     * Git nur d Schachtle zrugg!
     * (Genau das Set, aber nid d Ruem drin inne)
     * @return
     */
    public Set<Room> getRooms() {
        return rooms;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public Reservation getReservation(int bookingNr) {
        for (Reservation reservation : reservations) {
            if (reservation.getBookingNr() == bookingNr) {
                return reservation;
            }
        }
        return null;

    }

}

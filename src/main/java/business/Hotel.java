package business;

import business.person.Guest;

import java.util.*;

public class Hotel implements Institution {

    /**
     * list of all rooms in the hotel
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

    private void initialize() {
        for (int i = 101; i<110; i++) {
            rooms.add(new Room(i));
        }
        for (int i = 201; i<208; i++) {
            rooms.add(new Room(i));
        }
        for (int i = 301; i<304; i++) {
            rooms.add(new Room(i));
        }
    }

    /**
     * Hotel reserviert ein Raum fuer den Gast
     * das heisst die Raumnummer wird auf besetzt gesetzt.
     * fuer eine bestimmte Zeit
     * @param guest
     */
    public void reserveRoom(Guest guest) {

    }


    public Set<Room> getRooms() {
        return rooms;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

}

package business;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Hotel implements Institution {

    /**
     * list of all rooms in the hotel
     */
    private Map<Integer, Room> rooms = new HashMap<>();
    private List<Reservation> reservations = new LinkedList<>();

    private static Hotel hotel;


    private Hotel() {
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

    public void bookRoom() {

    }

    private void initialize() {
        for (int i = 101; i<110; i++) {
            rooms.put(i, new Room(i));
        }
        for (int i = 201; i<208; i++) {
            rooms.put(i, new Room(i));
        }
        for (int i = 301; i<304; i++) {
            rooms.put(i, new Room(i));
        }

    }

}

package business;

import java.util.LinkedList;
import java.util.List;

public class Hotel implements Institution {

    /**
     * list of all rooms in the hotel
     */
    private List<Room> rooms = new LinkedList<>();

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

}

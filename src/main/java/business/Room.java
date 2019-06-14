package business;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Room {

    private final int roomNumber;

    private final Map<Date, Guest> bookingTable;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.bookingTable = new HashMap<>();
    }

    public boolean isFree(Date date) {
        return !bookingTable.containsKey(date);
    }

    public void book(Date date, Guest guest) {
        if (!isFree(date)) {
            throw new RuntimeException("Cannot book a room twice!");
        }
        bookingTable.put(date,guest);
    }

}

package util;

import business.Hotel;
import business.Room;

public class BootStrapDataFactory {

    private static BootStrapDataFactory ourInstance = new BootStrapDataFactory();

    Hotel hotel = Hotel.getInstance();

    public static BootStrapDataFactory getInstance() {
        return ourInstance;
    }

    private BootStrapDataFactory() {
    }

    /**
     * Legt alle Sachen an und uebergibt sie ans Hotel
     * Vorallem die Reservationen, Gaeste werden hier angelegt.
     * Auch die Raeume.
     */
    public void init() {
        addRoomsToHotel();
    }

    /**
     * Fuegt der Hotel-Instanz neue Raeume hinzu.
     */
    private void addRoomsToHotel() {
        for (int i = 101; i < 110; i++) {
            hotel.getRooms().add(new Room(i));
        }
        for (int i = 201; i < 208; i++) {
            hotel.getRooms().add(new Room(i));
        }
        for (int i = 301; i < 304; i++) {
            hotel.getRooms().add(new Room(i));
        }
    }

}

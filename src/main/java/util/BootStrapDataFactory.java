package util;

import business.Address;
import business.Hotel;
import business.Room;
import business.person.Employee;
import business.person.Guest;

import java.util.Date;

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
        createReservations();
        createEmployee();
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

    private void createReservations() {
        Guest sarah = new Guest(
                "Bettinger",
                "Sarah",
                new Address("Binnigerstrasse 97", "Allschwil", "4123", "Schweiz"),
                "0794824462",
                "b.sarah2@hotmail.com");
        hotel.reserveRoom(sarah, new Date(2019 - 1900, 06 - 1, 22), 999);

        Guest tobias = new Guest(
                "Schlaepfer",
                "Tobias",
                new Address("Strasse 1", "Blauwil", "6275", "Schweiz"),
                "0798881190",
                "ts@hotmail.com");
        hotel.reserveRoom(tobias, new Date(2019 - 1900, 06 - 1, 22), 111);

    }

    private void createEmployee() {
        Employee employee = new Employee("Norris",
                "Chuck",
                new Address("Street 100", "Pensilwenya", "99012", "USA"),
                "Master of the universe",
                111,
                new Date(3050 - 1900, 8 - 1, 8));
        hotel.getEmployees().add(employee);
    }
}

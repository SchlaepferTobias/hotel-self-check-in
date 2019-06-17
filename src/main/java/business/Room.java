package business;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Room {

    private final int roomNumber;

    private final Set<Date> bookedDays;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.bookedDays = new HashSet<>();
    }

    public boolean isFree(Date date) {
        return !bookedDays.contains(date);
    }

    public void book(Date date) {
        if (!isFree(date)) {
            throw new RuntimeException("Cannot book a room twice!");
        }
        bookedDays.add(date);
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public Set<Date> getBookedDays() {
        return bookedDays;
    }

    /**
     * Um Objekte dieses Datentyps zu vergleichen
     * (macht Sinn diese zwei Methoden zu implementieren,
     * wenn in den Klassen Daten 'gehalten' werden)
     * @param o
     * @return true, if <code>roomNumber</code> and <code>bookedDays</code>
     * are the same as in <code>o</code>.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomNumber == room.roomNumber &&
                Objects.equals(bookedDays, room.bookedDays);
    }

    /**
     * Macht eine eindeutige Nr. von meinem Objekt,
     * das wiederum einfacher zu vergleichen ist.
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(roomNumber, bookedDays);
    }

}

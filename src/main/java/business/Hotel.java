package business;

import business.person.Employee;
import business.person.Guest;

import java.util.*;

public class Hotel implements Institution {

    /**
     * Ein Set (=Menge) enthaelt eindeutige Elemente.
     */
    private final Set<Room> rooms;  // Alle Raeume in einem Hotel
    private final Set<Reservation> reservations; // Alle Reservationen in einem Hotel
    private final Set<Employee> employees; // Alle Mitarbeiter in einem Hotel

    private static Hotel hotel;

    /**
     * Konstruktor des Hotels.
     */
    private Hotel() {
        this.rooms = new HashSet<>();
        this.reservations = new HashSet<>();
        this.employees = new HashSet<>();
    }

    /**
     * Singleton Hotel.
     *
     * @return die Instanz vom Hotel
     */
    public static Hotel getInstance() {
        if (hotel == null) {
            hotel = new Hotel();
        }
        return hotel;
    }

    /**
     * Diese Methode sucht einen freien Raum {@link #getFreeRoom(Date)} im HashSet <code>rooms</code>,
     * bucht {@link Room#book(Date)} diesen und erstellt eine neue <code>reservation</code>,
     * und fuegt dem Set von <code>daysOfReservation</code> das reservierte <code>date</code> hinzu.
     *
     * @param guest         welcher einen Raum reservieren moechte
     * @param date          an welchem ein Gast einen Raum reservieren moechte
     * @param bookingNumber die die Reservierung wiederspiegelt
     */
    public void reserveRoom(Guest guest, Date date, int bookingNumber) {
        Room room = getFreeRoom(date);
        room.book(date);
        Reservation reservation = new Reservation(guest, bookingNumber, room);
        reservation.getDaysOfReservation().add(date);
        reservations.add(reservation);
    }

    /**
     * Gibt einen Raum vom HashSet {@code rooms}, der zum eingegebenen <code>date</code> frei ist.
     * <p>
     * (von den Raeumen(Set) werden alle genommen(stream),
     * gefiltert und die, die frei sind herausgegeben;
     * es koennen auch keine sein, dann wird eine Runtimexception geworfen).
     *
     * @param date an welchem ein Raum frei sein koennte
     * @return <code>rooms</code> die frei sind
     * @throws <code>RuntimeException</code> wenn es keine leeren Raeume gibt
     */
    private Room getFreeRoom(Date date) {
        return rooms.stream()
                .filter(room -> room.isFree(date))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("all rooms are booked"));
    }

    /**
     * Dies ist das {@code Set} von Raeumen die ein Hotel haben kann.
     *
     * @return <code>rooms</code> vom Hotel
     */
    public Set<Room> getRooms() {
        return rooms;
    }

    /**
     * Dies ist das {@code Set} von Mitarbeitern die ein Hotel beschaeftigt.
     *
     * @return <code>employees</code> vom Hotel
     */
    @Override
    public Set<Employee> getEmployees() {
        return employees;
    }

    /**
     * Dies ist das {@code Set} von Reservationen, von allen Gaesten in einem Hotel.
     *
     * @return <code>reservations</code> von Gaesten im Hotel
     */
    public Set<Reservation> getReservations() {
        return reservations;
    }

    /**
     * Gibt eine Reservation von einem Gast, anhand einer vorhandenen Buchungsnummer,
     * ansonsten null.
     *
     * @param bookingNr einer {@code Reservation}
     * @return <code>reservation</code> des Gastes oder null bei falscher Eingabe der Buchungsnummer
     */
    public Reservation getReservation(int bookingNr) {
        for (Reservation reservation : reservations) {
            if (reservation.getBookingNr() == bookingNr) {
                return reservation;
            }
        }
        return null;
    }
}

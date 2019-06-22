package view;

import business.Hotel;
import business.Reservation;
import business.person.Guest;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SchinThreeThreeController {

    static SchinThreeThreeController instance;

    Reservation reservation;


    @FXML
    private Label guestAskEmployee;

    @FXML
    private Label guestCheckedIn;

    @FXML
    private Label roomNumber;

    @FXML
    private Label stayTime;


    public SchinThreeThreeController() {
        instance = this;
    }


    void loadReservation() {
        Guest guest = reservation.getGuest();
        guestCheckedIn.setText(guest.getFirstname() + " " + guest.getName() + " , done!");

        // Mitarbeiter ins Label
        String employeeString = Hotel.getInstance().getEmployees().stream()
                .map(employee -> employee.getName())
                .findFirst()
                .orElse("no employee found");
        guestAskEmployee.setText("(for more information, please feel free to ask " + employeeString + "at the reception)");

        // Raumnummer ins Label
        roomNumber.setText(String.valueOf(reservation.getRoom().getRoomNumber()));

        // Aufenthaltszeit ins Label
        stayTime.setText(reservation.getDaysOfReservation().stream()
                .map(date -> date.toString())
                .findFirst()
                .orElse(""));
    }



}

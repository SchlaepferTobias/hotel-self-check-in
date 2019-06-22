package view;

import business.Hotel;
import business.Reservation;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import util.ViewLoader;

public class SchinOneThreeController {

    private final Hotel hotel = Hotel.getInstance();

    @FXML
    private TextField bookingId;

    @FXML
    private TextField name;

    @FXML
    private ImageView back;

    @FXML
    private ImageView next;

    private ViewLoader viewLoader = ViewLoader.getInstance();


    public void initialize() {
        back.setOnMouseClicked(event -> {
            Stage stage = (Stage) back.getScene().getWindow();
            viewLoader.loadView(stage, ViewLoader.WELCOME_VIEW);
        });

        next.setOnMouseClicked(event -> {
            String inputBookingId = bookingId.getText().trim();
            String inputName = name.getText().trim();

            Reservation reservation = hotel.getReservation(Integer.parseInt(inputBookingId));
            if (reservation != null) {
                if (reservation.getGuest().getName().equals(inputName)) {
                    Stage stage = (Stage) next.getScene().getWindow();
                    viewLoader.loadView(stage, ViewLoader.SCHIN_TWO_THREE_VIEW);
                    SchinTwoThreeController twoController = SchinTwoThreeController.instance;
                    twoController.reservation = reservation;
                    twoController.loadReservation();
                }

            }

        });

        bookingId.setOnAction(event -> {
            String input = bookingId.getText().trim();
            Reservation reservation = null;
            if (input.length() == 3) {
                reservation = hotel.getReservation(Integer.parseInt(input));
            }

            if (reservation != null) {
                String guestLastName = reservation.getGuest().getName();
                name.setText(guestLastName);
            }


            // wenn Rueckgabe Wert == null in methode getDaysOfReservation() -> mach TextField bookingId rot
        });


    }

}

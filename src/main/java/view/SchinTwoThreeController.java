package view;

import business.Reservation;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import util.ViewLoader;

public class SchinTwoThreeController {

    static SchinTwoThreeController instance;

    Reservation reservation;

    @FXML
    private ImageView next;

    @FXML
    private ImageView back;

    @FXML
    private TextField firstname;

    @FXML
    private TextField roomnr;

    @FXML
    private TextField name;

    @FXML
    private TextField mobile;

    @FXML
    private TextField arriving;

    @FXML
    private TextField leaving;

    @FXML
    private TextField email;

    private ViewLoader viewLoader = ViewLoader.getInstance();

    public SchinTwoThreeController() {
        instance = this;
    }

    public void initialize() {

        back.setOnMouseClicked(event -> {
            Stage stage = (Stage) back.getScene().getWindow();
            viewLoader.loadView(stage, ViewLoader.SCHIN_ONE_THREE_VIEW);
        });

        next.setOnMouseClicked(event -> {
            Stage stage = (Stage) next.getScene().getWindow();
            viewLoader.loadView(stage, ViewLoader.SCHIN_THREE_THREE_VIEW);

            SchinThreeThreeController threeController = SchinThreeThreeController.instance;
            threeController.reservation = reservation;
            threeController.loadReservation();

        });

    }

    void loadReservation() {
        firstname.setText(reservation.getGuest().getFirstname());
        name.setText(reservation.getGuest().getName());
        roomnr.setText(String.valueOf(reservation.getRoom().getRoomNumber()));
        email.setText(reservation.getGuest().getEmail());
        mobile.setText(reservation.getGuest().getMobile());

        arriving.setText(reservation
                .getDaysOfReservation()
                .stream()
                .map(date -> date.toString())
                .findFirst()
                .orElse(""));

        leaving.setText(reservation
                .getDaysOfReservation()
                .stream()
                .map(date -> date.toString())
                .findFirst()
                .orElse(""));
    }



}

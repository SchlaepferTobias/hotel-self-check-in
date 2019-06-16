package view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SchinOneThreeController {

    @FXML
    private TextField bookingId;

    @FXML
    private TextField name;


    @FXML
    public void handleNext() {
        System.out.println(name);
        System.out.println(bookingId);
    }
}

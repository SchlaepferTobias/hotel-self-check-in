package view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import util.ViewLoader;

public class SchinOneThreeController {

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
            Stage stage = (Stage) next.getScene().getWindow();
            viewLoader.loadView(stage, ViewLoader.SCHIN_TWO_THREE_VIEW);
        });

    }

}

package view;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import util.ViewLoader;

public class BarOneFourController {

    @FXML
    private ImageView back;

    private ViewLoader viewLoader = ViewLoader.getInstance();


    public void initialize() {
        back.setOnMouseClicked(event -> {
            Stage stage = (Stage) back.getScene().getWindow();
            viewLoader.loadView(stage, ViewLoader.WELCOME_VIEW);
        });
    }

}

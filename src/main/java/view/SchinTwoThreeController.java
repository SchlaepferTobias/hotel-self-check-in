package view;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import util.ViewLoader;

public class SchinTwoThreeController {

    @FXML
    private ImageView back;

    @FXML
    private ImageView next;

    private ViewLoader viewLoader = ViewLoader.getInstance();


    public void initialize() {
        back.setOnMouseClicked(event -> {
            Stage stage = (Stage) back.getScene().getWindow();
            viewLoader.loadView(stage, ViewLoader.SCHIN_ONE_THREE_VIEW);
        });

        next.setOnMouseClicked(event -> {
            Stage stage = (Stage) next.getScene().getWindow();
            viewLoader.loadView(stage, ViewLoader.SCHIN_THREE_THREE_VIEW);
        });

    }



}

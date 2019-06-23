package view;

import business.Institution;
import business.InstitutionFactory;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import util.ViewLoader;


public class WelcomeController {

    private InstitutionFactory factory;
    private Institution hotel;

    @FXML
    private ImageView door;

    @FXML
    private ImageView bed;

    private ViewLoader viewLoader = ViewLoader.getInstance();

    public WelcomeController() {
        factory = InstitutionFactory.getInstance();
        this.hotel = factory.getInstitution(InstitutionFactory.Type.HOTEL);
    }

    public void initialize() {
        door.setOnMouseClicked(event -> {
            Stage stage = (Stage) door.getScene().getWindow();
            viewLoader.loadView(stage, ViewLoader.SCHIN_ONE_THREE_VIEW);
        });

        bed.setOnMouseClicked(event -> {
            Stage stage = (Stage) bed.getScene().getWindow();
            viewLoader.loadView(stage, ViewLoader.BAR_ONE_FOUR_VIEW);
        });
    }

}

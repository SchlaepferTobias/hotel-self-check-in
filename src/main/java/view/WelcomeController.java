package view;

import business.Institution;
import business.InstitutionFactory;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import util.ViewLoader;

import java.io.IOException;

public class WelcomeController {

    private static WelcomeController instance;
    private InstitutionFactory factory;
    private Institution hotel;

    @FXML
    private ImageView door;

    public synchronized WelcomeController getInstance() {
        if (instance == null) {
            instance = new WelcomeController();
        }
        return instance;
    }

    public WelcomeController() {
        factory = InstitutionFactory.getInstance();
        this.hotel = factory.getInstitution(InstitutionFactory.Type.HOTEL);
    }


    public void loadOneThreeView() {

        Stage stage = (Stage) door.getScene().getWindow();

        Parent root = ViewLoader.getInstance().loadView(ViewLoader.SCHIN_ONE_THREE_VIEW);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void initialize() {
        door.setOnMouseClicked(event -> loadOneThreeView());
    }

}

package view;

import business.Institution;
import business.InstitutionFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import util.ViewLoader;

import java.io.IOException;
import java.util.Properties;

public class MainController {

    private static MainController instance;
    private InstitutionFactory factory;
    private Institution hotel;

    @FXML
    private ImageView door;

    public synchronized MainController getInstance() {
        if (instance == null) {
            instance = new MainController();
        }
        return instance;
    }

    public MainController() {
        factory = InstitutionFactory.getInstance();
        this.hotel = factory.getInstitution(InstitutionFactory.Type.HOTEL);
    }

    @FXML
    public void handleDoor(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.load(getClass()
                .getClassLoader()
                .getResource("fxml/schin_one-three_view.fxml"));
        //ViewLoader.getInstance().loadView(ViewLoader.SCHIN_ONE_THREE_VIEW);
    }
}

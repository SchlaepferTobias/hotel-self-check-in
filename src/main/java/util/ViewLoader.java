package util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewLoader {
    private static ViewLoader ourInstance = new ViewLoader();

    private FXMLLoader loader = new FXMLLoader();

    public static final String VIEW_DIR = "fxml/";

    public static final String WELCOME_VIEW = "welcome_view.fxml";
    public static final String SCHIN_ONE_THREE_VIEW = "schin_one-three_view.fxml";
    public static final String SCHIN_TWO_THREE_VIEW = "schin_two-three_view.fxml";
    public static final String SCHIN_THREE_THREE_VIEW = "schin_three-three_view.fxml";


    public static ViewLoader getInstance() {
        return ourInstance;
    }

    private ViewLoader() {
    }

    private Parent loadFXMLFile(String filename) {

        System.err.println(VIEW_DIR + filename);

        try {
            return loader.load(getClass()
                    .getClassLoader()
                    .getResource(VIEW_DIR + filename));
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }

    }

    public void loadView(Stage stage, String filename) {

        Parent root = getInstance().loadFXMLFile(filename);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



}

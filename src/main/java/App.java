import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public String greeting() {
        return "hallo";
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

//        Parent page = FXMLLoader.<Parent>load(getClass().getResource("main.fxml").toExternalForm());

        primaryStage.setTitle("Hotel self check-in");
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass()
                        .getClassLoader()
                        .getResource("resources/fxml/Vorlage.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(App.class, args);
    }

}

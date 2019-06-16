import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.ViewLoader;

import java.io.IOException;


public class App extends Application {

    public App() {
        System.out.println("App class");
    }

    /**
     * The {@link #launch} method sets up my
     * <code>Main</code> class as a JavaFX application.
     *
     * @param args
     */
    public static void main(String[] args) {
        launch(App.class, args);
    }

    /**
     * is created for the test class #AppTest
     * @return
     */
    public String greeting() {
        return "hallo";
    }

    @Override
    public void start(Stage primaryStage) throws IOException{

        primaryStage.setTitle("Hotel self check-in");
        FXMLLoader loader = new FXMLLoader();
        Parent root = ViewLoader.getInstance().loadView(ViewLoader.WELCOME_VIEW);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
/**
 * Einstiegspunkt der Applikation - hotel-self-check-in.
 * Es wird ein Hotel erstellt welches Raeume hat und Mitarbeiter.
 * Ebenso Gaeste, die Raeume gebucht haben. Der Gast kann sich
 * anand der Reservierungsnummer einchecken ohne
 * an die Rezeption zu muessen. Er erhaelt die Bestaetigung und die
 * Keycard.
 *
 * @author Sarah Bettinger, Tobias Schlaepfer
 * @version 1.0
 * @since 23.06.2019
 */

import javafx.application.Application;
import javafx.stage.Stage;
import util.BootStrapDataFactory;
import util.ViewLoader;
import java.io.IOException;

public class App extends Application {

    // private Stage primaryStage;
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

        BootStrapDataFactory bootStrapDataFactory = BootStrapDataFactory.getInstance();
        bootStrapDataFactory.init();

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

        primaryStage.setTitle("Hotel Self Check-In");
        ViewLoader.getInstance().loadView(primaryStage, ViewLoader.WELCOME_VIEW);
    }

}
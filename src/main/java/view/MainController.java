package view;

import business.Institution;
import business.InstitutionFactory;

public class MainController {

    private static MainController instance;
    private InstitutionFactory factory;
    private Institution hotel;


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

}

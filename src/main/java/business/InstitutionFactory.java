package business;

public class InstitutionFactory {

    private static InstitutionFactory instance;

    private InstitutionFactory(){
    }


    public static InstitutionFactory getInstance() {
        if (instance == null) {
            instance = new InstitutionFactory();
        }
        return instance;
    }

    public Institution getInstitution(Type type) {
        switch (type) {
            case HOTEL:
                return Hotel.getInstance();
            default:
                throw new RuntimeException();
        }
    }

    public enum Type {
        HOTEL
    }

}

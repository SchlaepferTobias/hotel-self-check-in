package util;

public class BootStrapDataFactory {
    private static BootStrapDataFactory ourInstance = new BootStrapDataFactory();

    public static BootStrapDataFactory getInstance() {
        return ourInstance;
    }

    private BootStrapDataFactory() {
    }

    /**
     * Legt alle Sachen an und uebergibt sie ans Hotel
     * Vorallem die Reservationen, Gaeste werden hier angelegt.
     * Auch die Raeume.
     */
}

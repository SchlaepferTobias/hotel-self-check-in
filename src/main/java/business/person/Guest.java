package business.person;

import business.Address;

public class Guest extends Person {

    private String mobile;
    private String email;

    /**
     * Filtert die wichtigen informationen aus den mitgegebenen werten und speichert diese.
     *
     * @param name Familienname des Gastes
     * @param firstname Vorname des Gastes
     * @param address Adresse des Gastes
     * @param mobile MobileNr des Gastes
     * @param email Email adresse des Gastes
     */
    public Guest(String name, String firstname, Address address, String mobile, String email) {
        super(name, firstname, address);
        this.mobile = mobile;
        this.email = email;
    }

    /**
     * Giebt die mobilnummer des Gastes zurück
     *
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Giebt die Email adresse des Gastes zurück
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }
}

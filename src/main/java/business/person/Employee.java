package business.person;

import business.Address;

import java.util.Date;

public class Employee extends Person {

    private String position;
    private int employeeNumber;
    private Date birthDate;

    /**
     *Filtert die wichtigen informationen aus den mitgegebenen werten und speichert diese.
     *
     * @param name Name des Mitarbeiters
     * @param firstname Vorname des Mitarbeiters
     * @param address Adresse des Mitarbeiters
     * @param position Position des Mitarbeiters
     * @param employeeNumber Nummer des Mitarbeiters
     * @param birthDate Geburtsdatum des Mitarbeiters
     */
    public Employee(String name, String firstname, Address address, String position, int employeeNumber, Date birthDate) {
        super(name, firstname, address);
        this.position = position;
        this.employeeNumber = employeeNumber;
        this.birthDate = birthDate;
    }

    /**
     * Giebt die Position des Mitarbeiters zurück.
     *
     * @return position
     */
    public String getPosition() {
        return position;
    }

    /**
     * Giebt die Mitarbeiter nummer zurück.
     *
     * @return employeeNumber
     */
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * giebt das Geburtzdatum des Mitarbeiters zurück.
     *
     * @return birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }
}

package business.person;

import business.Address;

import java.util.Date;

public class Employee extends Person {

    private String position;
    private int employeeNumber;
    private Date birthDate;

    public Employee(String name, String firstname, Address address, String position, int employeeNumber, Date birthDate) {
        super(name, firstname, address);
        this.position = position;
        this.employeeNumber = employeeNumber;
        this.birthDate = birthDate;
    }

    public String getPosition() {
        return position;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}

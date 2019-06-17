package business.person;

import business.Address;

public abstract class Person {

    private String name;
    private String firstname;
    private Address address;

    public Person(String name, String firstname, Address address) {
        this.name = name;
        this.firstname = firstname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public Address getAddress() {
        return address;
    }
}

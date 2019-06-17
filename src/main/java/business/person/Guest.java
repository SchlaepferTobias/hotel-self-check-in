package business.person;

import business.Address;

public class Guest extends Person {

    private String mobile;
    private String email;

    public Guest(String name, String firstname, Address address, String mobile, String email) {
        super(name, firstname, address);
        this.mobile = mobile;
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }
}

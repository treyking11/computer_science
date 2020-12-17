package ContactService;

public class Contact {
    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact (String id, String firstName, String lastName, String phone, String address) {
        if (id == null || id.length()>10) {
            throw new IllegalArgumentException("Invalid id");
        } else {
            this.id = id;
        }

        if(firstName == null || firstName.length()>10) {
            throw new IllegalArgumentException("Invalid first name");
        } else {
            this.firstName = firstName;
        }

        if(lastName == null || lastName.length()>10) {
            throw new IllegalArgumentException("Invalid last name");
        } else {
            this.lastName = lastName;
        }

        if(phone == null || phone.length()!=10) {
            throw new IllegalArgumentException("Invalid phone");
        } else {
            this.phone = phone;
        }

        if(address == null || address.length()>30) {
            throw new IllegalArgumentException("Invalid address");
        } else {
            this.address = address;
        }

    }

    public String getId() { return  id; }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPhone(){
        return phone;
    }

    public String getAddress(){
        return address;
    }

}

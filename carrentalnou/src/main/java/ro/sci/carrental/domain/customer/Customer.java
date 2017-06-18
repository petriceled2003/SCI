package ro.sci.carrental.domain.customer;


public class Customer {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    //private String adresa;
   private Address adresa;
 //  private String adresa;

//scoatem tot ce tine de adresa in alta clasa : Adresa
    //adresa o definim noi
    // constructor

    public Customer() {
    }

//    public Customer(String firstName, String lastName, String streetAddress, String city, String adresa) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.streetAddress = streetAddress;
//        this.city = city;
//        this.adresa = adresa;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

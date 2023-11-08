package Proyecto;
/**
 * Represents a flight reservation made by a person
 * @author chava
 */
public class Booking {

    private String idBooking;

    private String status;

    private Person person;

    private Flight fligth;
/**
 * Constructor of the booking class
 * @param idBooking
 * @param status
 * @param person
 * @param fligth 
 */
    public Booking(String idBooking, String status, Person person, Flight 
            fligth) {
        this.idBooking = idBooking;
        this.status = status;
        this.person = person;
        this.fligth = fligth;
    }

    public Booking() {
    }
/**
 * get and set methods for class attributes
 * @return 
 */
    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Flight getFligth() {
        return fligth;
    }

    public void setFligth(Flight fligth) {
        this.fligth = fligth;
    }
    
}

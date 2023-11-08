package Proyecto;


import Proyecto.Booking;

public class Passanger {

    private Tiket tikect;

    private Booking booking;
/**
 * Constructor of the Passanger class
 * @param tikect
 * @param booking 
 */
    public Passanger(Tiket tikect, Booking booking) {
        this.tikect = tikect;
        this.booking = booking;
    }

    public Passanger() {
    }
/**
 * get and set methods for class attributes
 * @return 
 */
    public Tiket getTikect() {
        return tikect;
    }

    public void setTikect(Tiket tikect) {
        this.tikect = tikect;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
    
}

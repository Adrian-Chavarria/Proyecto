package Proyecto;


import Proyecto.Itinerary;
import Proyecto.Booking;

public class Tiket {

    private String assignedSeat;

    private Booking booking;

    private String idTiket;

    private Itinerary itinerary;

    private String gate;
/**
 * Constructor of the tiket class
 * @param assignedSeat
 * @param booking
 * @param idTiket
 * @param itinerary
 * @param gate 
 */
    public Tiket(String assignedSeat, Booking booking, String idTiket, 
            Itinerary itinerary, String gate) {
        this.assignedSeat = assignedSeat;
        this.booking = booking;
        this.idTiket = idTiket;
        this.itinerary = itinerary;
        this.gate = gate;
    }

    public Tiket() {
    }
/**
 * get and set methods for class attributes
 * @return 
 */
    public String getAssignedSeat() {
        return assignedSeat;
    }

    public void setAssignedSeat(String assignedSeat) {
        this.assignedSeat = assignedSeat;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(String idTiket) {
        this.idTiket = idTiket;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }
    
}

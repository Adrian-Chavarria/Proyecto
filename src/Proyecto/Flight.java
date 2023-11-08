package Proyecto;
import Proyecto.Plane;
import  Proyecto.Itinerary;
/**
 * Flight class represents the information of a flight.
 * @author chava
 */
public class Flight implements Nacional, Internacional {

    private String availability;

    private String destination;

    private String duration;

    private String idFligth;

    private String origin;

    private Itinerary itinerary;

    private String flighttType;

    private Plane plane;
/**
 * Flight class constructor.
 * @param availability
 * @param destination 
 * @param duration 
 * @param idFligth
 * @param origin
 * @param itinerary
 * @param flighttType
 * @param plane 
 */
    public Flight( String availability, String destination, 
            String duration, String idFligth, String origin, 
            Itinerary itinerary, String flighttType, Plane plane) {
       
        this.availability = availability;
        this.destination = destination;
        this.duration = duration;
        this.idFligth = idFligth;
        this.origin = origin;
        this.itinerary = itinerary;
        this.flighttType = flighttType;
        this.plane = plane;
    }

    public Flight() {
    }

/**
 * get and set methods for class attributes
 * @return 
 */
    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getIdFligth() {
        return idFligth;
    }

    public void setIdFligth(String idFligth) {
        this.idFligth = idFligth;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    public String getFlighttType() {
        return flighttType;
    }

    public void setFlighttType(String flighttType) {
        this.flighttType = flighttType;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
/**
 * throws an exception indicating that it has not been implemented yet
 * @return 
 */
    @Override
    public String getIdDocument() {
        throw new UnsupportedOperationException("Not supported yet."); 

    }

    @Override
    public String setIdDocument(String idDocument) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String getpassport() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String setpassport(String passport) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String getVisa() {
        throw new UnsupportedOperationException("Not supported yet."); //To 
        //change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String setVisa(String Visa) {
        throw new UnsupportedOperationException("Not supported yet."); 
/**
 * this method is responsible for recording flight, planes and itineraries 
 * and the information related to them
 */
    }
   public void registrationFlight() {
    Flight[] flights = new Flight[5];   
    Plane[] planes = Plane.aircraftRegistration();
  Itinerary[] itineraries = Itinerary.registrationItinerary();
  
  
    flights[0] = new Flight("Disponible", "Destino1", "2 horas", "F001",
            "Origen1", null, "Tipo1", null);
    flights[1] = new Flight("Disponible", "Destino2", "3 horas", "F002", 
            "Origen2", null, "Tipo2", null);
    flights[2] = new Flight("No Disponible", "Destino3", "2 horas", "F003", 
            "Origen3", null, "Tipo3", null);
    flights[3] = new Flight("Disponible", "Destino4", "4 horas", "F004", 
            "Origen4", null, "Tipo4", null);
    flights[4] = new Flight("No Disponible", "Destino5", "3 horas", "F005", 
            "Origen5", null, "Tipo5", null);

 
    for (int i = 0; i < flights.length; i++) {
        System.out.println("--------------------------------------------------"
                + "------");
        System.out.println("Vuelo " + (i + 1));
        System.out.println("Disponibilidad: " + flights[i].getAvailability());
        System.out.println("Destino: " + flights[i].getDestination());
        System.out.println("Duración: " + flights[i].getDuration());
        System.out.println("ID de Vuelo: " + flights[i].getIdFligth());
        System.out.println("Origen: " + flights[i].getOrigin());
        System.out.println("Tipo de Vuelo: " + flights[i].getFlighttType());
          System.out.println("");
         System.out.println("Avión:");
            System.out.println("Aereolina: " + planes[i].getAirline());
            System.out.println("ID Avión: " + planes[i].getIdPlane());
            System.out.println("Modelo: " + planes[i].getModel());
            System.out.println("Año: " + planes[i].getYear());
            System.out.println("Asientos disponibles: " + planes[i]
                    .getPassengerCapacity());
             System.out.println("");
            System.out.println("Itinerario:");
            System.out.println("Fecha de Salida : " + itineraries[i]
                    .getDepartureDate());
            System.out.println("Hora de Salida: " + itineraries[i]
                    .getDepartureTime());
            System.out.println("Fecha de regreso: " + itineraries[i]
                    .getReturnDate());
            System.out.println("Hora de regreso: " + itineraries[i]
                    .getReturnTime());
        System.out.println("--------------------------------------------------"
                + "------");
    }
    
}
}
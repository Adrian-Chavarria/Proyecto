package Proyecto;


import java.util.Date;
/**
 * The instances, constructors, get and set were determined for each instance 
 * and its respective ToString.
 * @author chava
 */
public class Itinerary {

    private Date departureDate;

    private String departureTime;

    private Date returnDate;

    private String returnTime;
/**
 * Constructor of the Itinerary class
 * @param departureDate
 * @param departureTime
 * @param returnDate
 * @param returnTime 
 */
    public Itinerary(Date departureDate, String departureTime, Date returnDate, 
            String returnTime) {
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.returnDate = returnDate;
        this.returnTime = returnTime;
    }

    public Itinerary() {
    }
/**
 * get and set methods for class attributes
 * @return 
 */
    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }
    /**
     * The registration Itinerary method was created which stores specific 
     * values
     * @return 
     */
    public static Itinerary[] registrationItinerary(){
      Itinerary[] itineraryList = new Itinerary[5];
        
        // Crear y asignar valores a las instancias de Itinerary con fechas diferentes
        itineraryList[0] = new Itinerary(new Date(124, 0, 5), "08:00 AM",
                new Date(124, 0, 15), "06:00 PM");
        itineraryList[1] = new Itinerary(new Date(123, 11, 20), "10:00 AM", 
                new Date(124, 0, 3), "08:00 PM");
        itineraryList[2] = new Itinerary(new Date(123, 10, 20), "12:00 PM", 
                new Date(123, 10, 30), "10:00 PM");
        itineraryList[3] = new Itinerary(new Date(124, 2, 10), "02:00 PM", 
                new Date(124, 2, 20), "12:00 AM");
        itineraryList[4] = new Itinerary(new Date(124, 2, 18), "04:00 PM", 
                new Date(124, 2, 23), "02:00 AM");
        return itineraryList;

        
      
    }
    /**
     * displays the data for each itinerary.
     */
    public void showItinerary() {
         Itinerary[] itinerary = new Itinerary[5];
    // Mostrar los datos utilizando los métodos getter
        for (int i = 0; i < itinerary.length; i++) {
            System.out.println("Itinerario" + (i + 1));
            System.out.println("Fecha de Salida : " + itinerary[i]
                    .getDepartureDate());
            System.out.println("Hora de Salida: " + itinerary[i]
                    .getDepartureTime());
            System.out.println("Fecha de regreso: " + itinerary[i]
                    .getReturnDate());
            System.out.println("Hora de regreso: " + itinerary[i]
                    .getReturnTime());
            System.out.println("---------------------------------------"
                    + "-----------------");
        }
}
}



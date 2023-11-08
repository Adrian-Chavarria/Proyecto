package Proyecto;
/**
 * The instances, constructors, get and set were determined for each instance 
 * and its respective ToString
 * @author chava
 */
public class Plane {

    
    
    private String airline;
    private String idPlane;
    private String model;
    private String year;
    
    
    private int passengerCapacity;

    /**
     * Constructor of the Plane class
     * @param airline
     * @param idPlane
     * @param model
     * @param year
     * @param passengerCapacity 
     */
    public Plane (String airline, String idPlane, String model, String year, int passengerCapacity){ 
        this.airline = airline; 
        this.idPlane = idPlane; 
        this.model = model; 
        this.year = year;
        this.passengerCapacity = passengerCapacity; 
    }

    public Plane() {
        this.airline = "Sin asignar"; 
        this.idPlane = "Sin asignar"; 
        this.model = "Sin asignar"; 
        this.year = "Sin asignar";
        this.passengerCapacity = 0; 
        
    }
    
    
    /**
     * The aircraft Registration method was created which stores the available 
     * aircraft.
     * @return 
     */
   public static Plane[] aircraftRegistration (){
       
       Plane [] aircraftlist = new Plane [5];
       
       aircraftlist [0] = new Plane ("Avianca","AV123", "Boeing 787",
               "2018", 100);
       aircraftlist [1] = new Plane ("Qatar Airways","QR456", "Airbus A350",
               "2017",250 );
       aircraftlist [2] = new Plane ("Copa Airlines","CM789", "Boeing 737",
               "2019",230);
       aircraftlist [3] = new Plane ("American Airlines","AA321", "Airbus A321",
               "2020",80);
       aircraftlist [4] = new Plane ("Sansa","RZ101", "Cessna Grand Caravan",
               "2015",345);
       
       return aircraftlist; 
   }
   /**
    * The show aircraft method was created.
    */
  public void showAircraft(){
      Plane [] aircraft = aircraftRegistration (); 
      
      for (int i = 0; i < aircraft.length; i++) {
          System.out.println("Aviones disponibles");
          System.out.println("Aereolina: " + aircraft[i].getAirline());
          System.out.println("ID Avión: " + aircraft[i].getIdPlane());
          System.out.println("Modelo: " + aircraft[i].getModel());
          System.out.println("Año: " + aircraft[i].getYear());
          System.out.println("Asientos disponibles: " + 
                  aircraft[i].getPassengerCapacity());
          System.out.println("------------------------------------");
          
      }
  }
   
/**
 * get and set methods for class attributes
 * @return 
 */
    public String getAirline() {
        return airline;
    }

    public String getIdPlane() {
        return idPlane;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setIdPlane(String idPlane) {
        this.idPlane = idPlane;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
   
    
    
}

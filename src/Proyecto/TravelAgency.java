package Proyecto;


import Proyecto.Booking;
import java.util.Scanner;
/**
 * The instances, constructors, get and set were determined for each instance 
 * and its respective ToString.
 * @author chava
 */
public class TravelAgency {

    private Booking booking;
/**
 * Constructor of the travelAgency class
 * @param booking 
 */
    public TravelAgency(Booking booking) {
        this.booking = booking;
    }

    public TravelAgency() {
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
   /**
    * The menu method was created which allows passengers to interact with 
    * different options.
    */
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Principal");
            System.out.println("1. Registro");
            System.out.println("2. Vuelos");
            System.out.println("3. Reserva");
            System.out.println("4. Estado");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                 
                    System.out.println("Ha seleccionado Registro.");
                    break;
                case 2:
                    
                    System.out.println("Ha seleccionado Vuelos.");
                       Flight flight = new Flight();
                    flight.registrationFlight();
                    break;
                case 3:
                  
                    System.out.println("Ha seleccionado Reserva.");
                    break;
                case 4:
                  
                    System.out.println("Ha seleccionado Estado.");
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}


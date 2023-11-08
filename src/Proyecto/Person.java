package Proyecto;


import Proyecto.Passanger;
import Proyecto.Contact;
import Proyecto.Booking;

public class Person  extends Passanger {

    private String idUser;

    private String name;

    private Contact contac;
/**
 * Constructor of the Person class
 * @param idUser
 * @param name
 * @param contac
 * @param tikect
 * @param booking 
 */
    public Person(String idUser, String name, Contact contac, Tiket tikect, 
            Booking booking) {
        super(tikect, booking);
        this.idUser = idUser;
        this.name = name;
        this.contac = contac;
    }

  
/**
 * 
 * @return 
 */
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContac() {
        return contac;
    }

    public void setContac(Contact contac) {
        this.contac = contac;
    }
    
}

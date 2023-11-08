package Proyecto;

import java.util.Scanner;
/**
 * The instances, constructors, get and set were determined for each instance 
 * and its respective ToString.
 * @author chava
 */
public class Contact {

    private String email;

    private String phone;
/**
 * class constructor
 * @param email
 * @param phone 
 */
    public Contact(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    public Contact() {
    }
/**
 * get and set methods for class attributes
 * @return 
 */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * The create contact method was created which stores the passenger data.
     */
    public void createContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su numero de celular");
        String phoneNumber = scanner.nextLine();
        setPhone(phoneNumber);
         
        System.out.println("Ingrese su correo electronico");
        String emailAdress = scanner.nextLine();
        setEmail(emailAdress);
    }
}

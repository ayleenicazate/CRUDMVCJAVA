
package cl.mingoalmacen.model;

/**
 *
 * @author Ayleen Guajardo
 * @version 14/11/2023
 */
public class Client {
    
//  ↓ Atributtes of Class 'Client' ↓
    private int rut;
    private String dvrun;
    private String nameUser;
    private int phone;
    private String email;
    private String password;
    private String addres;
/*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑<Atributtes>↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/
    
//  ↓ Constructors ↓                                                                           
    public Client() {
    }

    public Client(int rut, String dvrun, String nameUser, int phone, String email, String password, String addres) {
        this.rut = rut;
        this.dvrun = dvrun;
        this.nameUser = nameUser;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.addres = addres;
    }
/*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑<Constructors>↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/
    
//  ↓ Getters and Setters ↓
    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDvrun() {
        return dvrun;
    }

    public void setDvrun(String dvrun) {
        this.dvrun = dvrun;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String name) {
        this.nameUser = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
/*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑<Getters and Setters>↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/
    
    @Override /*ToString: shows all of atributtes on class, however, you can edit. Like: secret password ↓*/
    public String toString() {
        return nameUser + "User{" + "rut=" + rut + ", dvrun=" + dvrun + ", name=" + ", phone=" + phone + ", email=" + email + ", password=***********"+ '}';
    }
    
    
    
    
    
}

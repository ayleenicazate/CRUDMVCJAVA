
package cl.mingoalmacen.model;

/**
 *
 * @author Ayleen Guajardo
 * @version 14/11/2023
 */
public class Cliente {
    
//  ↓ Atributtes of Class 'Cliente' ↓

    private String nombre_usuario;
    private String contrasena;
/*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑<Atributtes>↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/
    
//  ↓ Constructors ↓                                                                           
    public Cliente() {
    }

    public Cliente(String nombre_usuario, String contrasena) {
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
    }
/*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑<Constructors>↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/
    
//  ↓ Getters and Setters ↓
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String name) {
        this.nombre_usuario = name;
    }


    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
/*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑<Getters and Setters>↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/

    @Override
    public String toString() {
        return "Cliente{" + "nombre_usuario=" + nombre_usuario + ", contrasena=" + contrasena + '}';
    }

    
    

    
    
    
    
    
}

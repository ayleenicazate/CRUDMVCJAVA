/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.mingoalmacen.img;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Ayleen
 */
public class ImagenLogin {
    
    public static final String ICON_PATH_JFRAME = "/cl/mingoalmacen/img/tienda.png";
    
    public static void cambiarIconoJFrame (JFrame frame){
        try {
            ImageIcon icono = new ImageIcon(ImagenLogin.class.getResource(ICON_PATH_JFRAME));
            frame.setIconImage(icono.getImage());
        } catch (Exception e) {
            ImageIcon icono = new ImageIcon();
            frame.setIconImage(icono.getImage());
        }
    };

    
    
            
            
}

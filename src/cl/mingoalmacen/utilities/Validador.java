/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.mingoalmacen.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ayleen
 */
public class Validador {

    public static boolean validarCorreo(String correo) {
        // Expresión regular para validar un correo electrónico
        String expresionRegular = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        Pattern pattern = Pattern.compile(expresionRegular);

        Matcher matcher = pattern.matcher(correo);

        return matcher.matches();
    }

    public boolean esTextoValido(String texto) {
        return texto.matches("[a-zA-Z\\s]+");
    }

    public boolean esNumeroValido(String numero) {
        return numero.matches("\\d+");
    }

}

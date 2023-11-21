/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import cl.mingoalmacen.model.Cliente;
import cl.mingoalmacen.model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ayleen
 */
public class ClienteDAO {
    

    
    public void guardarUsuario(Cliente cliente) {
        try {
            Connection connection = Conexion.obtenerConexion();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO CLIENTE (NOMBRE_USUARIO, CONTRASENA) VALUES (?, ?)");
            statement.setString(1, cliente.getNombre_usuario());
            statement.setString(2, cliente.getContrasena());
            statement.executeUpdate();
            System.out.println("Usuario registrado correctamente en la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al intentar registrar usuario: " + e.getMessage());
        }
    }
}


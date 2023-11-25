/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import cl.mingoalmacen.model.Cliente;
import cl.mingoalmacen.model.Conexion;
import static cl.mingoalmacen.model.Conexion.obtenerConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Ayleen
 */
public class ClienteDAO {

    public void guardarUsuario(Cliente cliente) {
        try {
            Connection connection = Conexion.obtenerConexion();
            String query = "INSERT INTO CLIENTE (NOMBRE_USUARIO, CONTRASENA) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, cliente.getNombre_usuario());
            statement.setString(2, cliente.getContrasena());
            statement.executeUpdate();

            System.out.println("Usuario registrado correctamente en la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al intentar registrar usuario: " + e.getMessage());
        }
    }
    // Métodos para verificar la existencia de nombre de usuario y contraseña

    public boolean existeNombreUsuario(String nombreUsuario) {
        try {
            Connection connection = Conexion.obtenerConexion();
            String query = "SELECT COUNT(*) FROM CLIENTE WHERE NOMBRE_USUARIO = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, nombreUsuario);

            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error al verificar la existencia del nombre de usuario: " + e.getMessage());
        }
        return false;
    }

    public boolean verificarCredenciales(String nombre_usuario, String contrasena) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean credencialesValidas = false;

        try {
            conn = obtenerConexion(); // Método para obtener la conexión a la base de datos

            String query = "SELECT * FROM CLIENTE WHERE nombre_usuario = ? AND contrasena = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, nombre_usuario);
            stmt.setString(2, contrasena);
            
            rs = stmt.executeQuery();
            
            // Si el resultado tiene al menos una fila, las credenciales son válidas
            credencialesValidas = rs.next();

        } catch (SQLException e) {
            // Manejo de excepciones
            e.printStackTrace();
        } finally {
            // Cerrar recursos (ResultSet, Statement, Connection)
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return credencialesValidas;
    }
        
    }


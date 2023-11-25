/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.mingoalmacen.vista;

import DAO.ProductoDAO;
import cl.mingoalmacen.controller.ControladorProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cl.mingoalmacen.model.Conexion;

/**
 *
 * @author Ayleen
 */
public class testMain {

    public static void main(String[] args) throws Exception {
//        mostrarProductos();
        ControladorProducto.imprimirProductos();
    }

    public static void mostrarProductos() throws Exception {
        String query = "SELECT * FROM PRODUCTO";

        try {
            Connection connection = Conexion.obtenerConexion();
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id_prod = resultSet.getInt("ID_PROD");
                String nombre_prod = resultSet.getString("NOMBRE_PROD");
                int precio = resultSet.getInt("PRECIO");


                System.out.println("\n" + "Informacion del producto: " + "\n"
                + "ID = " + id_prod + "\n"
                + "Nombre = " + nombre_prod + "\n"
                + "Precio = $" + precio +  
                "\n");

            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la lista de productos: " + e.getMessage());

        }

    }
}



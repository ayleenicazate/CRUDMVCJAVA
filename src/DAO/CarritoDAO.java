/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import cl.mingoalmacen.model.Conexion;
import cl.mingoalmacen.model.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ayleen
 */
//public class CarritoDAO {
//
//    public ArrayList<C> obtenerTodosLosProductos() {
//        String query = "SELECT * FROM CARRITODECOMPRAS";
//
//        ArrayList<Producto> productoBuscados = new ArrayList<>();
//
//        try {
//            Connection connection = Conexion.obtenerConexion();
//            PreparedStatement statement = connection.prepareStatement(query);
//            ResultSet resultSet = statement.executeQuery();
//
//            while (resultSet.next()) {
//                int id_prod = resultSet.getInt("ID_PROD");
//                String nombre_prod = resultSet.getString("NOMBRE_PROD");
//                int precio = resultSet.getInt("PRECIO");
//                int stock = resultSet.getInt("STOCK");
//
//                productoBuscados.add(new Producto(id_prod, nombre_prod, precio, stock));
//
//            }
//        } catch (SQLException e) {
//            System.err.println("Error al obtener la lista de productos: " + e.getMessage());
//
//        }
//        return productoBuscados;
//    }
//        
//        
//
//    public boolean guardarProductosEnCarrito(int id_carrito, List<Integer> idsProductos) {
//        boolean exito = false;
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//
//        try {
//            connection = Conexion.obtenerConexion();
//            String query = "INSERT INTO CARRITO_DE_COMPRAS (ID_CARRITO, ID_PROD, CANTIDAD) VALUES (?, ?, ?)";
//            preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setInt(1, id_carrito);
//            preparedStatement.setInt(2, id_prod);
//            preparedStatement.setInt(3, cantidad);
//
//            int filasInsertadas = preparedStatement.executeUpdate();
//            
//            // Si al menos una fila fue insertada, se considera un éxito
//            exito = (filasInsertadas > 0);
//        } catch (SQLException e) {
//            System.err.println("Error al intentar agregar producto al carrito: " + e.getMessage());
//        } finally {
//            // Cerrar recursos (preparedStatement y conexión)
//            // Manejo de excepciones
//        }
//
//        return exito;
//    }
//}

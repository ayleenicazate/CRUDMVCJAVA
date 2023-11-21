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

/**
 *
 * @author Ayleen
 */
public class ProductoDAO implements IProductoDAO{

    public ProductoDAO() {
        
    }

    @Override
    public ArrayList<Producto> obtenerTodosLosProductos() {
        String query = "SELECT * FROM PRODUCTO";
        
        ArrayList<Producto> productoBuscados = new ArrayList<>();
        
        try {
            Connection connection = Conexion.obtenerConexion();
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id_prod = resultSet.getInt("ID_PROD");
                String nombre_prod = resultSet.getString("NOMBRE_PROD");
                int precio = resultSet.getInt("PRECIO");
                int stock = resultSet.getInt("STOCK");

                productoBuscados.add(new Producto(id_prod, nombre_prod, precio, stock));

            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la lista de productos: " + e.getMessage());

        }
        return productoBuscados;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.mingoalmacen.controller;

import cl.mingoalmacen.model.CarritoDeCompras;
import cl.mingoalmacen.model.Conexion;
import cl.mingoalmacen.model.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ayleen
 */
public class RegistroCarrito {

//    CarritoDeCompras carrito = new CarritoDeCompras();
    public static boolean agregarProdCarrito(CarritoDeCompras carrito) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            ControladorProducto cp = new ControladorProducto();

            List<Producto> productos = cp.buscarPorNombre(carrito.getNombre_prod());
            if (productos.isEmpty()) {
                System.out.println("El producto no existe en la tabla de productos.");
                cnx.close(); // Cerrar la conexión antes de salir
                return false;
            }

            String query = "INSERT INTO CARRITODECOMPRAS (NOMBRE_PROD, PRECIO, CANTIDAD) VALUES (?,?,?)";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setString(1, carrito.getNombre_prod());
            stmt.setInt(2, carrito.getPrecio());
            stmt.setInt(3, carrito.getCantidad());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL agregar producto, " + e.getMessage());
            return false;
        }
    }

    /**
     * Método que permite eliminar productos del carrito
     *
     * Este método verifica si el producto existe en la base de datos Carro de
     * compras mediante una query, en caso de que sí exista el producto dejará
     * eliminarlo.
     *
     */
    public boolean eliminarProdCarrito(String nombre_prod) {

        boolean flag = false;

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            // Verificar si el producto existe antes de eliminarlo
            String existenciaQuery = "SELECT * FROM CARRITODECOMPRAS WHERE NOMBRE_PROD = ?";
            PreparedStatement existenciaStmt = cnx.prepareStatement(existenciaQuery);
            existenciaStmt.setString(1, nombre_prod);
            ResultSet existenciaResult = existenciaStmt.executeQuery();

            if (existenciaResult.next()) { // Si el producto existe, proceder a eliminarlo
                String eliminarQuery = "DELETE FROM CARRITODECOMPRAS WHERE NOMBRE_PROD = ?";
                try (PreparedStatement eliminarStmt = cnx.prepareStatement(eliminarQuery)) {
                    eliminarStmt.setString(1, nombre_prod);

                    int resp = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar producto?", "Eliminar producto", JOptionPane.YES_NO_OPTION);
                    if (resp == JOptionPane.YES_OPTION) {
                        eliminarStmt.executeUpdate();
                        flag = true;
                    }
                }
            } else {
                System.out.println("El producto no existe en el carrito.");
            }

            existenciaStmt.close();
            existenciaResult.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL eliminar producto, " + e.getMessage());
            flag = false;
        }
        return flag;
    }

    public boolean actualizarProdCarrito(String nombre_prod, String nombreNew) {

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE CARRITODECOMPRAS SET NOMBRE_PROD = ? WHERE NOMBRE_PROD = ?";
            PreparedStatement stmt = cnx.prepareCall(query);

            stmt.setString(1, nombreNew);
            stmt.setString(2, nombre_prod);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL actualizar producto, " + e.getMessage());
            return false;
        }

    }

    public Producto buscarPorNombre(String nombre_prod) {

        Producto prod = new Producto();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM CARRITODECOMPRAS WHERE NOMBRE_PROD = ?";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setString(1, nombre_prod);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                prod.setId_prod(rs.getInt("id_prod"));
                prod.setNombre_prod(rs.getString("nombre_prod"));
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL buscar por nombre en Carrito, " + e.getMessage());
        }
        return prod;

    }

    public List<CarritoDeCompras> buscarTodos() {
        List<CarritoDeCompras> listaCarrito = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM CARRITODECOMPRAS";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                CarritoDeCompras carrito = new CarritoDeCompras();

                carrito.setNombre_prod(rs.getString("NOMBRE_PROD"));
                carrito.setPrecio(rs.getInt("PRECIO"));
                carrito.setCantidad(rs.getInt("CANTIDAD"));

                listaCarrito.add(carrito);
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL buscar, " + e.getMessage());
        }
        return listaCarrito;
    }

    public boolean borrarTodo() {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            // Sentencia SQL para eliminar todos los elementos del carrito
            String deleteQuery = "DELETE FROM CARRITODECOMPRAS";

            PreparedStatement stmt = cnx.prepareStatement(deleteQuery);

            // Ejecutar la sentencia SQL
            int rowsAffected = stmt.executeUpdate();

            // Cerrar conexiones
            stmt.close();
            cnx.close();

            // Devolver true si se eliminaron filas, false si no se encontraron elementos para borrar
            return rowsAffected > 0;

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL borrar todo, " + e.getMessage());
            return false;
        }
    }

    public double calcularTotalCompra(List<CarritoDeCompras> productos) {
        // Inicializar el total en 0
        double total = 0.0;

        // Iterar sobre los productos y sumar al total
        for (CarritoDeCompras producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }

        return total; // Devolver el total calculado
    }

}

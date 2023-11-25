/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.mingoalmacen.controller;

import DAO.ProductoDAO;
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
public class ControladorProducto {



    public static void imprimirProductos() {

        ProductoDAO prodDao = new ProductoDAO();

        ArrayList<Producto> productoBuscados = prodDao.obtenerTodosLosProductos();

        for (Producto productoBuscado : productoBuscados) {
            System.out.println(productoBuscado);
        }
    }

    public List<Producto> buscarTodos() {

        List<Producto> lista = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM PRODUCTO";
            PreparedStatement stmt = cnx.prepareCall(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Producto prod = new Producto();

                prod.setId_prod(rs.getInt("id_prod"));
                prod.setNombre_prod(rs.getString("nombre_prod"));
                prod.setPrecio(rs.getInt("precio"));
                prod.setStock(rs.getInt("stock"));
                lista.add(prod);
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL listar , " + e.getMessage());
        }
        return lista;

    }

    public List buscarPorNombre(String nombre_prod) {

        List<Producto> prodBusc = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM PRODUCTO WHERE NOMBRE_PROD = ?";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setString(1, nombre_prod);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Producto prodEnc = new Producto();

                prodEnc.setId_prod(rs.getInt("id_prod"));
                prodEnc.setNombre_prod(rs.getString("nombre_prod"));
                prodEnc.setPrecio(rs.getInt("precio"));
                prodEnc.setStock(rs.getInt("stock"));
                prodBusc.add(prodEnc);
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL buscar por nombre en Inventario, " + e.getMessage());
        }
        return prodBusc;

    }

    public List<Producto> buscarPorPrecioInferior(double precioIngresado) {
        List<Producto> productosEncontrados = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM PRODUCTO WHERE PRECIO < ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setDouble(1, precioIngresado);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Producto producto = new Producto();
                producto.setId_prod(rs.getInt("id_prod"));
                producto.setNombre_prod(rs.getString("nombre_prod"));
                producto.setPrecio(rs.getInt("precio"));
                producto.setStock(rs.getInt("stock"));

                productosEncontrados.add(producto);
            }

            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL buscar por precio inferior en Inventario, " + e.getMessage());
        }

        return productosEncontrados;
    }

}

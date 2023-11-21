/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.mingoalmacen.model;


import java.sql.DriverManager;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Ayleen
 */
public class Conexion {

    private static final String WALLET_PATH = "C:/Users/Ayleen/Documents/WALLET ORACLE/Wallet_VUTKYCEBSYHZOASV";
    private static final String WALLET_PASSWORD = "Icaz.20880880-K!";
    private static final String JDBC_URL = "jdbc:oracle:thin:@vutkycebsyhzoasv_high";

    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            // Configuración del wallet
            String trustStorePath = Paths.get(WALLET_PATH, "truststore.jks").toString();
            String keyStorePath = Paths.get(WALLET_PATH, "keystore.jks").toString();
            
            System.setProperty("oracle.net.tns_admin", WALLET_PATH);
            System.setProperty("javax.net.ssl.truststore", trustStorePath);
            System.setProperty("javax.net.ssl.trustStorePassword", WALLET_PASSWORD);
            System.setProperty("javax.net.ssl.keystore", keyStorePath);
            System.setProperty("javax.net.ssl.keystore Password", WALLET_PASSWORD);

            Properties properties = new Properties();
            properties.put("user", "admin");
            properties.put("password", WALLET_PASSWORD);
            
            // Intento de conexión
            conexion = DriverManager.getConnection(JDBC_URL, properties);
        } catch (SQLException e) {
            // Manejo de excepciones para depurar la causa de la falla
            // En un entorno de producción, seria mejor usar logging en lugar de printStackTrace 
            System.out.println(e);
        }
            return conexion;
    }    
            
            
            // Método para cerrar la conexión
    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
             } catch (SQLException e) {
                // Manejo de la excepción al intentar cerrar la conexión 
                // De igual forma, preferir usar logging
            System.out.println(e);
            }
        }
    
    }
}

        

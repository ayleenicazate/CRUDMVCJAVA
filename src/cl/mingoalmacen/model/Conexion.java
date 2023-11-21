/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.mingoalmacen.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.nio.file.Paths;
import java.util.Properties;

/**
 *
 * @author Ayleen
 */
public class Conexion {


    private static final String WALLET_PATH = "C:/Users/Ayleen/Documents/WALLET ORACLE";
    private static final String WALLET_PASSWORD = "Icaz.20880880-K!";
    private static final String JDBC_URL = "jdbc:oracle:thin:@vutkycebsyhzoasv_high";

    public static Connection obtenerConexion() throws Exception {
        // Configuración del wallet
        String trustStorePath = Paths.get(WALLET_PATH, "truststore.jks").toString();
        String keyStorePath = Paths.get(WALLET_PATH, "keystore.jks").toString();

        System.setProperty("oracle.net.tns_admin", WALLET_PATH);
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", WALLET_PASSWORD);
        System.setProperty("javax.net.ssl.keyStore", keyStorePath);
        System.setProperty("javax.net.ssl.keyStorePassword", WALLET_PASSWORD);

        Properties properties = new Properties();
        properties.put("user", "admin");
        properties.put("password", WALLET_PASSWORD);

        return DriverManager.getConnection(JDBC_URL, properties);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.mingoalmacen.controller;

import DAO.ClienteDAO;
import cl.mingoalmacen.model.Cliente;

/**
 *
 * @author Ayleen
 */
public class ControladorLogin {

    private ClienteDAO clienteDAO;

    public ControladorLogin() {
        this.clienteDAO = new ClienteDAO(); // Instancia del DAO para interactuar con la base de datos
    }

    // Método para registrar un nuevo usuario
    public void registrarUsuario(String nombre_usuario, String contrasena) {
        Cliente nuevoCliente = new Cliente(nombre_usuario, contrasena);

        // Llamada al método del DAO para guardar el usuario en la base de datos
        clienteDAO.guardarUsuario(nuevoCliente);
    }

    public boolean verificarCredenciales(String nombre_usuario, String contrasena) {
        // Llamada al método del DAO para verificar si las credenciales son válidas
        return clienteDAO.verificarCredenciales(nombre_usuario, contrasena);
    }

}

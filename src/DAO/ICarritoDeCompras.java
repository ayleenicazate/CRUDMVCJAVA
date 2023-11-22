/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import cl.mingoalmacen.model.CarritoDeCompras;

/**
 *
 * @author Ayleen
 */
public interface ICarritoDeCompras {

    boolean agregarProductoAlCarrito(CarritoDeCompras carrito);
    boolean eliminarProductoDelCarrito(int id_carrito);
    boolean actualizarCantidadProductoEnCarrito(int id_carrito, int id_producto, int nuevaCantidad);

}

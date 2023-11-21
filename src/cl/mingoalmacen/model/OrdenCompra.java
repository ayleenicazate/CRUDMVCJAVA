/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.mingoalmacen.model;

import java.util.Date;

/**
 *
 * @author Ayleen
 */
public class OrdenCompra extends CarritoDeCompras{
    private int id_compra;
    private Double total;
    private Date fecha;

    public OrdenCompra() {
    }

    public OrdenCompra(int id_compra, Double total, Date fecha, int id_carrito, int cantidad, int id_prod, String nombre_prod, int precio, int stock) {
        super(id_carrito, cantidad, id_prod, nombre_prod, precio, stock);
        this.id_compra = id_compra;
        this.total = total;
        this.fecha = fecha;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}

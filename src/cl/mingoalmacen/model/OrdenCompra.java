/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.mingoalmacen.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Ayleen
 */
public class OrdenCompra {

    private int id_cliente;
    private Double total;
    private Date fecha;

    public OrdenCompra() {
    }

    public OrdenCompra(int id_cliente, Double total, Date fecha) {

        this.id_cliente = id_cliente;
        this.total = total;
        this.fecha = fecha;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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

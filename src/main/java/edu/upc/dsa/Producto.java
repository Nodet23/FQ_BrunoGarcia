package edu.upc.dsa;

/**
 * Created by nodet on 18/12/17.
 */
public class Producto {

    String name;
    String id;
    Integer cantidad;
    Integer precio;
    Integer ventas;

    public Producto(String name, String id, Integer cantidad, Integer precio, Integer ventas) {
        this.name = name;
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
        this.ventas = ventas;
    }

    public Producto(){

    }


    public Integer getVentas() {
        return ventas;
    }

    public void setVentas(Integer ventas) {
        this.ventas = ventas;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


}

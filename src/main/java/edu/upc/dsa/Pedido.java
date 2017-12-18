package edu.upc.dsa;

import java.util.*;

/**
 * Created by nodet on 18/12/17.
 */
public class Pedido {

    String idPedido;
    String nombreUsuario;
    ArrayList<Producto> productos;
    boolean realizado;

    public Pedido(){

    }

    public Pedido(String idPedido, String nombreUsuario, ArrayList<Producto> productos, boolean realizado) {
        this.idPedido = idPedido;
        this.nombreUsuario = nombreUsuario;
        this.productos = productos;
        this.realizado = realizado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }


    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }



}

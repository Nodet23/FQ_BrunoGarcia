package edu.upc.dsa;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.*;

/**
 * Created by nodet on 18/12/17.
 */

@Path("/")
public class JSONService {

    ProductManagerImpl miProductManagerImpl;


    public JSONService() {

        miProductManagerImpl = ProductManagerImpl.getInstance();

    }


    @GET
    @Path("/listaProductos")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Producto> listarProductos() {
        return miProductManagerImpl.listarProductos();
    }

    @GET
    @Path("/listarPedidos")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Pedido> listarPedidos() {
        return miProductManagerImpl.getListaPedidosPendientes();
    }


    @POST
    @Path("/nuevoPedido/{idPedido}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response nuevoPedido(@PathParam("idPedido") String idPedido) {
        Pedido pedido = new Pedido(idPedido, "bruno", new ArrayList<Producto>(), false);
        miProductManagerImpl.getListaPedidosPendientes().add(pedido);
        return Response.status(201).entity("Añadido pedido con id:" +idPedido).build();
    }

}

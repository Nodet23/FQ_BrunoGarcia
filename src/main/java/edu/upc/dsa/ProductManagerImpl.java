package edu.upc.dsa;



import java.util.*;

/**
 * Created by nodet on 18/12/17.
 */
public class ProductManagerImpl implements ProductManager{


    private static ProductManagerImpl instance=null;


    HashMap<String, Producto> mapaProductos;
    ArrayList<Pedido> listaPedidosPendientes;
    HashMap<String, Usuario> mapaUsuarios;
    Usuario usuarioTest;

    private ProductManagerImpl() {

        mapaProductos = new HashMap<String, Producto>();
        listaPedidosPendientes = new ArrayList<>();
        mapaUsuarios = new HashMap<String, Usuario>();



        mapaProductos = new HashMap<String, Producto>();
        usuarioTest = new Usuario("bruno","123");
        Producto productoTest = new Producto("coca", "123", 1, 1, 1);
        Producto productoTest2 = new Producto("coca2", "1234", 1, 2, 2);
        Producto productoTest3 = new Producto("coca3", "12345", 1, 3, 3);
        Producto productoTest4 = new Producto("coca4", "123456", 1, 4, 4);
        mapaProductos.put(productoTest.getId(), productoTest);
        mapaProductos.put(productoTest2.getId(), productoTest2);
        mapaProductos.put(productoTest4.getId(), productoTest4);
        mapaProductos.put(productoTest3.getId(), productoTest3);
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(productoTest);
        productos.add(productoTest2);
        Pedido pedidoTest = new Pedido(" 123", "bruno", productos, false);


    }
    public static ProductManagerImpl getInstance(){
        if(instance==null){
            instance=new ProductManagerImpl();
        }
        return instance;
    }


    public ArrayList<Producto> listarProductos(){
        ArrayList<Producto> todosProductos = new ArrayList<>(mapaProductos.values());
        return todosProductos;
    }

    public List<Producto> listarProductosAsPrecio() {

        List<Producto> todosProductos = (List<Producto>) mapaProductos.values();

        Collections.sort(todosProductos, new Comparator<Producto>() {
            public int compare(Producto product1, Producto product2) {
                Integer idea1 = new Integer(product1.getPrecio());
                Integer idea2 = new Integer(product2.getPrecio());
                return idea1.compareTo(idea2);

            }

        });

        return todosProductos;
    }

    public boolean realizarPedido (Usuario usuario, Pedido pedido) {

        pedido.setNombreUsuario(usuario.getName());
        mapaUsuarios.get(usuario.getName()).getMapaPedidos().put(pedido.getIdPedido(), pedido);
        listaPedidosPendientes.add(pedido);

        return false;
    }

    public boolean servirPedido() {

        mapaUsuarios.get(listaPedidosPendientes.get(0).getNombreUsuario()).getMapaPedidos().
                get(listaPedidosPendientes.get(0).getIdPedido()).setRealizado(true);
        listaPedidosPendientes.remove(0);
        return true;
    }

    public List<Pedido> pedidosRealizados(Usuario usuario) {

        List<Pedido> todosPedidos;
        List<Pedido> pedidosRealizados = new List<Pedido>() {
            public int size() {
                return 0;
            }

            public boolean isEmpty() {
                return false;
            }

            public boolean contains(Object o) {
                return false;
            }

            public Iterator<Pedido> iterator() {
                return null;
            }

            public Object[] toArray() {
                return new Object[0];
            }

            public <T> T[] toArray(T[] a) {
                return null;
            }

            public boolean add(Pedido pedido) {
                return false;
            }

            public boolean remove(Object o) {
                return false;
            }

            public boolean containsAll(Collection<?> c) {
                return false;
            }

            public boolean addAll(Collection<? extends Pedido> c) {
                return false;
            }

            public boolean addAll(int index, Collection<? extends Pedido> c) {
                return false;
            }

            public boolean removeAll(Collection<?> c) {
                return false;
            }

            public boolean retainAll(Collection<?> c) {
                return false;
            }

            public void clear() {

            }

            public Pedido get(int index) {
                return null;
            }

            public Pedido set(int index, Pedido element) {
                return null;
            }

            public void add(int index, Pedido element) {

            }

            public Pedido remove(int index) {
                return null;
            }

            public int indexOf(Object o) {
                return 0;
            }

            public int lastIndexOf(Object o) {
                return 0;
            }

            public ListIterator<Pedido> listIterator() {
                return null;
            }

            public ListIterator<Pedido> listIterator(int index) {
                return null;
            }

            public List<Pedido> subList(int fromIndex, int toIndex) {
                return null;
            }
        } ;

        todosPedidos = (List<Pedido>) mapaUsuarios.get(usuario.getName()).getMapaPedidos().values();

        for (int x = 0; x < todosPedidos.size(); x++){
            if (todosPedidos.get(x).isRealizado()){
                pedidosRealizados.add(todosPedidos.get(x));
            }
        }

        return pedidosRealizados;

    }

    public List<Producto> listarProductosDesVentas() {

        List<Producto> todosProductos = (List<Producto>) mapaProductos.values();

        Collections.sort(todosProductos, new Comparator<Producto>() {
            public int compare(Producto product1, Producto product2) {
                Integer idea1 = new Integer(product1.getVentas());
                Integer idea2 = new Integer(product2.getVentas());
                return idea2.compareTo(idea1);
            }
        });

        return todosProductos;
    }

    public HashMap<String, Producto> getMapaProductos() {
        return mapaProductos;
    }

    public void setMapaProductos(HashMap<String, Producto> mapaProductos) {
        this.mapaProductos = mapaProductos;
    }

    public ArrayList<Pedido> getListaPedidosPendientes() {
        return listaPedidosPendientes;
    }

    public void setListaPedidosPendientes(ArrayList<Pedido> listaPedidosPendientes) {
        this.listaPedidosPendientes = listaPedidosPendientes;
    }

    public HashMap<String, Usuario> getMapaUsuarios() {
        return mapaUsuarios;
    }

    public void setMapaUsuarios(HashMap<String, Usuario> mapaUsuarios) {
        this.mapaUsuarios = mapaUsuarios;
    }
}


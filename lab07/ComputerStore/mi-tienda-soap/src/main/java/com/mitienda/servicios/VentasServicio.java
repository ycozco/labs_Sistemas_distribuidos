package com.mitienda.servicios;

import javax.jws.WebService;
import javax.jws.WebMethod;
import com.mitienda.modelos.Pedido;
import com.mitienda.modelos.Producto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebService
public class VentasServicio {
    private Map<String, Producto> productos = new HashMap<>();
    private Map<String, Pedido> pedidos = new HashMap<>();

    public VentasServicio() {
        // Inicializar con algunos datos de prueba
        productos.put("P001", new Producto("P001", "PC Gamer", 1500.00));
        productos.put("P002", new Producto("P002", "Laptop Workstation", 2000.00));
        // Agregar más productos según sea necesario
    }

    @WebMethod
    public List<Producto> listarProductos() {
        return new ArrayList<>(productos.values());
    }

    @WebMethod
    public String realizarPedido(Pedido pedido) {
        // Lógica para añadir el pedido al sistema
        pedidos.put(pedido.getIdPedido(), pedido);
        return "Pedido " + pedido.getIdPedido() + " realizado con éxito.";
    }

    @WebMethod
    public String actualizarPedido(String idPedido, String nuevoEstado) {
        // Lógica para actualizar el estado de un pedido
        if (pedidos.containsKey(idPedido)) {
            Pedido pedido = pedidos.get(idPedido);
            pedido.setEstado(nuevoEstado);
            return "Pedido " + idPedido + " actualizado a estado: " + nuevoEstado;
        } else {
            return "Pedido no encontrado.";
        }
    }

    @WebMethod
    public Pedido buscarPedido(String idPedido) {
        // Lógica para buscar y retornar un pedido
        return pedidos.getOrDefault(idPedido, null);
    }
}

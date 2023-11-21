package com.mitienda.modelos;

import java.util.List;

public class Pedido {
    private String idPedido;
    private List<Producto> productos;
    private String estado;

    public Pedido(String idPedido, List<Producto> productos, String estado) {
        this.idPedido = idPedido;
        this.productos = productos;
        this.estado = estado;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // ... otros métodos como toString, equals, etc., si son necesarios
}

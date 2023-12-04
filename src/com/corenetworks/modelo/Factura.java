package com.corenetworks.modelo;

import java.util.List;
import java.util.Objects;

public class Factura {
    protected Iimpuesto impuesto;
    protected List<Producto> productos;
    public double calcularTotalFactura(){
        double total=0;
        for (Producto elemento:productos
             ) {
            total+=elemento.getPrecio()+impuesto.calcularImpuesto(elemento);
        }
        return total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "impuesto=" + impuesto +
                ", productos=" + productos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return Objects.equals(impuesto, factura.impuesto) && Objects.equals(productos, factura.productos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(impuesto, productos);
    }

    public Factura() {
    }

    public Factura(Iimpuesto impuesto, List<Producto> productos) {
        this.impuesto = impuesto;
        this.productos = productos;
    }

    public Iimpuesto getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Iimpuesto impuesto) {
        this.impuesto = impuesto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}

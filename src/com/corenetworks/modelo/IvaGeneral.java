package com.corenetworks.modelo;

public class IvaGeneral implements Iimpuesto{
    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio()*0.21;
    }
}

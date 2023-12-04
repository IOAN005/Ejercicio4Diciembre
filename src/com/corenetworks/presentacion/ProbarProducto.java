package com.corenetworks.presentacion;

import com.corenetworks.modelo.Factura;
import com.corenetworks.modelo.Iimpuesto;
import com.corenetworks.modelo.Producto;

import java.awt.*;

public class ProbarProducto {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("boligrafo",1.2));
        productos.add(new Producto("libreta" , 3));

        Iimpuesto general = new IvaGeneral();
        Iimpuesto reducido = new IvaSuperReducido();

        Factura f1 = new Factura();
        f1.setImpuesto(general);
        f1.setProductos(productos);
        System.out.println("IVA general " + f1.calcularTotalFactura());
        f1.setImpuesto(reducido);
        System.out.println("IVA reducido " + f1.calcularTotalFactura());
    }
}

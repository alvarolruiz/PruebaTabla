package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
public static final String  SEPARATOR = "-----------------------------------------------------------------------------";
    public static void main(String[] args) {
        ArrayList<Producto> listadoProductos= new ArrayList<>();
        listadoProductos.add(new ProductoJardineria(1, "Regadera", 23.2d, 23));
        listadoProductos.add(new ProductoJardineria(2, "Pala", 23.2d, 23));
        listadoProductos.add(new ProductoJardineria(3, "Rastrillo", 23.2d, 23));
        listadoProductos.add(new ProductoPlanta(4, "Flor", 23.2d, 23, 2));
        listadoProductos.add(new ProductoPlanta(5, "Cesped", 23.2d, 23, 2));
        listadoProductos.add(new ProductoPlanta(6, "Catcus", 23.2d, 23, 2));
        System.out.println(SEPARATOR);
        // Esto lo que hace es formatear las cadenas y alinearlas a la derecha
        System.out.printf("%5s %15s %10s %5s %20s", "ID", "DESCRIPCIÓN", "PRECIO", "STOCK", "TIPO");
        System.out.println();
        System.out.println(SEPARATOR);
        for (Producto p : listadoProductos ) {
            if(p instanceof ProductoPlanta){
                imprimirProducto(p, "Planta");
            }else if (p instanceof ProductoJardineria){
                imprimirProducto(p, "Producto Jardineria");
            }
        }
        System.out.println(SEPARATOR);
    }

    private static void imprimirProducto(Producto p, String tipo) {
        System.out.format("%5s %15s %10s %5d %20s",
                p.getId(),p.getDescripcion(), imprimirDouble(p.getPrecioUnitario()),p.getUnidadesDisponibles(), tipo );
        System.out.println();
    }

    private static String imprimirDouble (double d){
        DecimalFormat df = new DecimalFormat("#.00");
        String string = df.format(d);
        return string;
    }

}

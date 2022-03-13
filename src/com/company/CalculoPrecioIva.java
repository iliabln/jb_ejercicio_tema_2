package com.company;
import java.util.*;
public class CalculoPrecioIva {

    public static void main(String[] args) {

        //Añado un input de usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio sin IVA:");
        double precio = scanner.nextDouble();

        double precioConIva = getPrecioConIva(precio);
        double precioConIvaRedondeado = Math.round(precioConIva * 100.0) / 100.0; // obtengo el valor redondeado del precio con IVA
        System.out.println("Precio con IVA es:");
        System.out.println(precioConIvaRedondeado);

        }

    static double getPrecioConIva(double precio) {
        return precio * 1.21;
    }
}

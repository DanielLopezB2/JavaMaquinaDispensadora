package com.mycompany.maquinadispensadora;

import java.util.ArrayList;
import java.util.Scanner;

public class MaquinaDispensadora {

    public static void main(String[] args) {
        

        // Crear una instancia de Dispensadora
        Dispensadora dispensadora = new Dispensadora();
        

        // Mostrar lista de productos
        dispensadora.listarProductos();

        // Pedir código del producto a comprar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código del producto a comprar: ");
        int codigo = scanner.nextInt();

        // Pedir las monedas en formato "xx,xxx"
        System.out.print("Ingrese las monedas en formato \"xx,xxx\": ");
        String monedas = scanner.next();

        // Validar las monedas
        double[] resultadoValidacion = dispensadora.validarMonedas(monedas);
        if (resultadoValidacion[1] == 0) {
            // Si la validación es correcta, sacar el producto
            if (dispensadora.sacarProducto(codigo)) {
                System.out.println("Producto entregado.");
                // Mostrar devueltas
                double devueltas = resultadoValidacion[0] - dispensadora.getProductos().get(codigo).getPrecio() ;
                System.out.println("Devueltas: " + devueltas);
            } else {
                System.out.println("No se pudo sacar el producto.");
            }
        } else {
            System.out.println("Las siguientes monedas son incorrectas: " + resultadoValidacion[1]);
        }
    }
}




//MaquinaDispensadora

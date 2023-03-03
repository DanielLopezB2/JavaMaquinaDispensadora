package com.mycompany.maquinadispensadora;

import java.util.ArrayList;
import java.util.Arrays;

public class Dispensadora {
    private ArrayList<Producto> productos;
    private String monedas;

    // Constructor
    public Dispensadora() {
        // Inicializar el atributo Productos con 10 productos reales
        
        productos = new ArrayList<>(Arrays.asList(
            new Producto("001", "Galletas", "Marinela", 10.0, 5),
            new Producto("002", "Refresco", "Coca-Cola", 20.0, 3),
            new Producto("003", "Agua", "Cielo", 12.0, 7),
            new Producto("004", "Chicles", "Trident", 5.0, 10),
            new Producto("005", "Papas", "Sabritas", 15.0, 4),
            new Producto("006", "Chocolate", "Hershey's", 18.0, 2),
            new Producto("007", "Gomitas", "Haribo", 8.0, 6),
            new Producto("008", "Café", "Nescafé", 22.0, 1),
            new Producto("009", "Paletas", "La Michoacana", 7.0, 8),
            new Producto("010", "Cigarros", "Marlboro", 40.0, 3)
        ));
    }

    // Getters y setters
    public String getMonedas() {
        return monedas;
    }

    public void setMonedas(String monedas) {
        this.monedas = monedas;
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    // Método para validar las monedas ingresadas
    public double[] validarMonedas(String monedas) {
        double[] resultado = new double[2];
        resultado[0] = 0.0; // Suma de las monedas correctas
        resultado[1] = 0.0; // Valor de las monedas incorrectas
        String[] partes = monedas.split(",");
        for (String parte : partes) {
            int moneda = Integer.parseInt(parte);
            if (moneda == 10 || moneda == 50 || moneda == 100 || moneda == 500) {
                resultado[0] += moneda;
            } else {
                resultado[1] += moneda;
            }
        }
        return resultado;
    }

    // Método para sacar un producto
    public boolean sacarProducto(int codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(String.format("%03d", codigo))) {
                if (producto.getCantidad() > 0) {
                    producto.setCantidad(producto.getCantidad() - 1);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    // Método para listar los productos
   public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.mostrarProducto());
        }
    }


}


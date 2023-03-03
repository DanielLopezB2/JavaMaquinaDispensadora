package com.mycompany.maquinadispensadora;


public class Producto {
    private String codigo;
    private String nombre;
    private String marca;
    private double precio;
    private int cantidad;

    // Constructor
    public Producto(String codigo, String nombre, String marca, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método para mostrar información del producto
    public String mostrarProducto() {
        return "\n-----------------------------------"+ 
                 "Código: " + codigo + "\n" +
               "Nombre: " + nombre + "\n" +
               "Marca: " + marca + "\n" +
               "Precio: " + precio + "\n" +
               "Cantidad: " + cantidad +
                "\n-----------------------------------";
    }
}

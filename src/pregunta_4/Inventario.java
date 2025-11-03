package pregunta_4;

import java.util.ArrayList;

//Clase principal Inventario con métodos sobrecargados
public class Inventario {
 private ArrayList<Producto> productos = new ArrayList<>();

 // Agregar producto solo con nombre
 public void agregarProducto(String nombre) {
     productos.add(new Producto(nombre));
 }

 // Agregar producto con nombre y precio
 public void agregarProducto(String nombre, double precio) {
     if (precio < 0) {
         System.out.println("Error: El precio no puede ser negativo.");
         return;
     }
     productos.add(new Producto(nombre, precio));
 }

 // Agregar producto con nombre, precio y cantidad
 public void agregarProducto(String nombre, double precio, int cantidad) {
     if (precio < 0 || cantidad < 0) {
         System.out.println("Error: El precio o la cantidad no pueden ser negativos.");
         return;
     }
     productos.add(new Producto(nombre, precio, cantidad));
 }

 // Mostrar todos los productos
 public void mostrarProductos() {
     System.out.println("=== Inventario de Productos ===");
     for (Producto p : productos) {
         System.out.println(p);
     }
 }

 // Método principal de prueba
 public static void main(String[] args) {
     Inventario inv = new Inventario();

     inv.agregarProducto("Lapicero");
     inv.agregarProducto("Cuaderno", 5.50);
     inv.agregarProducto("Mochila", 45.90, 10);
     inv.agregarProducto("Regla", -3.0, 5); // Caso con error

     inv.mostrarProductos();
 }
}

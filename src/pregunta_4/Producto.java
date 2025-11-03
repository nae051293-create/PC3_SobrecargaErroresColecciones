package pregunta_4;

//Clase Producto para representar los elementos del inventario
class Producto {
 private String nombre;
 private double precio;
 private int cantidad;

 public Producto(String nombre) {
     this(nombre, 0.0, 0);
 }

 public Producto(String nombre, double precio) {
     this(nombre, precio, 0);
 }

 public Producto(String nombre, double precio, int cantidad) {
     this.nombre = nombre;
     this.precio = precio;
     this.cantidad = cantidad;
 }

 @Override
 public String toString() {
     return "Producto: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidad;
 }
}

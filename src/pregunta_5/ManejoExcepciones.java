package pregunta_5;

import java.util.Scanner;

//Clase principal para manejo de excepciones
public class ManejoExcepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Ingreso de números ===");
        System.out.println("Puede ingresar varios números enteros.");
        System.out.println("El programa se detendrá cuando ocurra un error o número negativo.\n");

        while (true) {
            try {
                System.out.print("Ingrese un número entero: ");
                String entrada = sc.nextLine();

                // Posible NumberFormatException
                int numero = Integer.parseInt(entrada);

                // Lanza excepción personalizada si el número es negativo
                if (numero < 0) {
                    throw new NumeroNegativoException("Error: El número no puede ser negativo.");
                }

                System.out.println("Número válido ingresado: " + numero + "\n");

            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un valor numérico entero.");
                break; // Detiene el bucle al ocurrir una excepción
            } catch (NumeroNegativoException e) {
                System.out.println("Error: " + e.getMessage());
                break; // Detiene el bucle al ocurrir una excepción
            }
        }

        sc.close();
        System.out.println("\nPrograma finalizado por error o número negativo.");
    }
}
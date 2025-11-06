package pregunta_2;

import java.util.Scanner;

public class manejo_errores {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese el primer número entero: ");
            int num1 = input.nextInt();
            
            System.out.print("Ingrese el segundo número entero: ");
            int num2 = input.nextInt();
            
            int resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: división entre cero no permitida.");
        } finally {
            input.close();
        }
		
	}

}


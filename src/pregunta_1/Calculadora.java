package pregunta_1;

public class Calculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado1 = sumar(5, 10);
        int resultado2 = sumar(3, 7, 2);
        double resultado3 = sumar(4.5, 3.2);

        System.out.println("Suma de dos enteros (5 + 10): " + resultado1);
        System.out.println("Suma de tres enteros (3 + 7 + 2): " + resultado2);
        System.out.println("Suma de dos doubles (4.5 + 3.2): " + resultado3);
    }
}

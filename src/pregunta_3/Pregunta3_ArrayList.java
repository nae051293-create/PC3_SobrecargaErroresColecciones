package pregunta_3;

import java.util.ArrayList;

public class Pregunta3_ArrayList {

    public static void main(String[] args) {

        // Creamos un ArrayList para almacenar nombres de estudiantes
        ArrayList<String> estudiantes = new ArrayList<>();

        // Agregamos 5 nombres al ArrayList
        estudiantes.add("Julio");
        estudiantes.add("Gustavo");
        estudiantes.add("Kleider");
        estudiantes.add("Angela");
        estudiantes.add("Angel");

        // Mostramos la lista completa antes de eliminar
        System.out.println("Lista completa de estudiantes:");
        for (String nombre : estudiantes) {
            System.out.println("- " + nombre);
        }

        // Eliminamos el tercer elemento 
        estudiantes.remove(2);

        // Mostramos la lista después de eliminar el tercer elemento
        System.out.println("\nLista después de eliminar el tercer elemento:");
        for (String nombre : estudiantes) {
            System.out.println("- " + nombre);
        }
    }
}

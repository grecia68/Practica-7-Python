package practicaTraducidoJava;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        System.out.print("¿Cuántos estudiantes desea registrar? ");
        int numEstudiantes = scanner.nextInt();
        scanner.nextLine();

        for(int i =0; i < numEstudiantes; i++){
            System.out.println("\nEstudiante: " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            

            ArrayList<Double> calificaciones = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                System.out.print("Calificación " + (j + 1) + ": ");
                double calificacion = scanner.nextDouble();
                calificaciones.add(calificacion);
                
            }
            scanner.nextLine();

            Estudiante est = new Estudiante(nombre, calificaciones);
            estudiantes.add(est);
        }
        int aprob = 0;
        int reprob = 0;


        System.out.println("\n--- Resultados ---");
        for (Estudiante est : estudiantes) {
            System.out.println("Nombre: " + est.nombre);
            System.out.println("Promedio: " + est.promedio);
            System.out.println("Estado: " + est.estado + "\n");

            if (est.estado.equals("Aprobado")) {
                aprob++;
            } else {
                reprob++;
            }
        }

        System.out.println("Total de estudiantes aprobados: " + aprob);
        System.out.println("Total de estudiantes reprobados: " + reprob);
    }
}

package practicaTraducidoJava;
import java.util.ArrayList;

public class Estudiante {

    public String nombre;
    public ArrayList<Double> calificaciones;
    public double promedio;
    public String estado;

    public Estudiante(String nombre, ArrayList<Double> calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
        this.promedio = calcularPromedio(calificaciones);
        this.estado = evaluarAprobacion(this.promedio);
    }

    public static double calcularPromedio(ArrayList<Double> lista) {
        double suma = 0;
        for (double calificacion : lista) {
            suma += calificacion;
        }
        return suma / lista.size();
    }

    public static String evaluarAprobacion(double promedio){
        if (promedio >= 6.0 ) {
            return "Aprobado";
        }else if(promedio < 0){
           return "Califiación inválida ";  
        }else{
            return "Reprobado";
        }
    }
}

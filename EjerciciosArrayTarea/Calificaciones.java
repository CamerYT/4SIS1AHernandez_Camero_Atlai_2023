package EjerciciosArrayTarea;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] calificaciones = new int[10];
        int sumaCalificaciones = 0;
        int calificacionMasAlta = Integer.MIN_VALUE;
        int calificacionMasBaja = Integer.MAX_VALUE;
        int calificacionesSuperiorAlPromedio = 0;
        int alumnosAprobados = 0;
        int alumnosReprobados = 0;

        // Leer las calificaciones para que realice los calculos
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ", del (00 - 100): ");
            calificaciones[i] = scanner.nextInt();
            sumaCalificaciones += calificaciones[i];

            if (calificaciones[i] > calificacionMasAlta) {
                calificacionMasAlta = calificaciones[i];
            }

            if (calificaciones[i] < calificacionMasBaja) {
                calificacionMasBaja = calificaciones[i];
            }
        }

        //Aqui calcula el promedio :3
        double promedio = (double) sumaCalificaciones / 10;

        //Contar las calificaciones superiores al promedio, tanto "alumnos aprobados" y "reprobados"
        for (int calificacion : calificaciones) {
            if (calificacion > promedio) {
                calificacionesSuperiorAlPromedio++;
            }

            if (calificacion >= 60) { //Coloque como 60 como nota de aprobación
                alumnosAprobados++;
            } else {
                alumnosReprobados++;
            }
        }

        //Me muestre los resultados :v
        System.out.println("Calificaciones de los estudiantes:");
        System.out.println("-------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + calificaciones[i]);
        }

        System.out.println("El promedio de las calificaciones: " + promedio);
        System.out.println("Calificación más alta: " + calificacionMasAlta);
        System.out.println("Calificación más baja: " + calificacionMasBaja);
        System.out.println("Número de calificaciones que son superior al promedio: " + calificacionesSuperiorAlPromedio);
        System.out.println("Alumnos aprobados: " + alumnosAprobados);
        System.out.println("Alumnos reprobados: " + alumnosReprobados);

        scanner.close();
    }
}

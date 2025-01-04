/**
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al 
 * finalizar el periodo, la Dirección de la carrera de Computación a solicitado 
 * las siguientes estadísticas de la materia INTRODUCCIÓN A LA PROGRAMACIÓN en 
 * función a los promedios por estudiante, dichos promedios se deben calcular 
 * (ponderar, ya que el docente ingresa todo sobre 10pts.) de 3 calificaciones 
 * (ACD que representa el 35% de la nota, APE del 35% y la nota del AA con un 
 * peso del 30%). En resumen, los requerimientos son los siguientes:
 * Registre los nombres de cada estudiante de dicho paralelo.
 * Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28
 * estudiantes de 0-10 pts.
 * Calcule el promedio de cada uno de los estudiantes del paralelo dada la 
 * siguiente ponderación: ACD->35%, APE->35%, y el AA->30%.
 * Obtenga el promedio del curso, del paralelo C.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un 
 * promedio por encima del promedio del curso.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un 
 * promedio por debajo del promedio del curso.
 * Muestre el estudiante con su calificación, si es el del mayor promedio 
 * (el más alto de la clase).
 * Muestre el estudiante con su calificación, si es el del menor promedio 
 * (el más bajo de la clase).
 * 
 * @author Juan Jose Calva
 */

import java.util.Scanner;


public class Ejercicio3_Ciclo {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int totalEstudiantes = 28; 
        String[] nombres = new String[totalEstudiantes];
        double[] promedios = new double[totalEstudiantes];
        double procurso = 0.0;
        String mejorEstu = "";
        String peorEstu = "";
        double mnota = -1.0;
        double pnota = 11.0;

        for (int i = 0; i < totalEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante #" + (i + 1) + ": ");
            nombres[i] = tcl.nextLine();

            double ACD = Math.random() * 10;
            double APE = Math.random() * 10;
            double AA = Math.random() * 10;

            promedios[i] = (ACD * 0.35) + (APE * 0.35) + (AA * 0.30);
            procurso += promedios[i];

            if (promedios[i] > mnota) {
                mnota = promedios[i];
                mejorEstu = nombres[i];
            }
            if (promedios[i] < pnota) {
                pnota = promedios[i];
                peorEstu = nombres[i];
            }

            System.out.printf("Generacion de notas...: ACD=%.2f, APE=%.2f, AA=%.2f, Promedio=%.2f%n", ACD, APE, AA, promedios[i]);
        }

        procurso /= totalEstudiantes;

        System.out.printf("%nPromedio del curso: %.2f%n", procurso);
        System.out.println("Estudiantes con promedio por encima del curso:");
        for (int i = 0; i < totalEstudiantes; i++) {
            if (promedios[i] > procurso) {
                System.out.printf("%s con promedio %.2f%n", nombres[i], promedios[i]);
            }
        }

        System.out.println("\nEstudiantes con promedio por debajo del curso:");
        for (int i = 0; i < totalEstudiantes; i++) {
            if (promedios[i] < procurso) {
                System.out.printf("%s con promedio %.2f%n", nombres[i], promedios[i]);
            }
        }

        System.out.printf("%nMejor estudiante: %s con promedio %.2f%n", mejorEstu, mnota);
        System.out.printf("Peor estudiante: %s con promedio %.2f%n", peorEstu, pnota);

        tcl.close();
    }
}

/**
 * BLOQUE DE COMENTARIOS
 * 
 * run:
 * Ingrese el nombre del estudiante #1: JUAN
 * Generacion de notas...: ACD=4,57, APE=6,28, AA=9,21, Promedio=6,56
 * Ingrese el nombre del estudiante #2: JUAN2
 * Generacion de notas...: ACD=5,79, APE=5,13, AA=5,82, Promedio=5,56
 * Ingrese el nombre del estudiante #3: JUAN3
 * Generacion de notas...: ACD=2,91, APE=5,94, AA=4,58, Promedio=4,47
 * Ingrese el nombre del estudiante #4: JUAN4
 * Generacion de notas...: ACD=1,23, APE=7,95, AA=8,54, Promedio=5,78
 * Ingrese el nombre del estudiante #5: JUAN5
 * Generacion de notas...: ACD=2,48, APE=8,04, AA=6,43, Promedio=5,61
 * Ingrese el nombre del estudiante #6: JUAN6
 * Generacion de notas...: ACD=0,16, APE=4,18, AA=6,59, Promedio=3,50
 * Ingrese el nombre del estudiante #7: JUAN7
 * Generacion de notas...: ACD=5,94, APE=9,67, AA=0,46, Promedio=5,60
 * Ingrese el nombre del estudiante #8: JUAN8
 * Generacion de notas...: ACD=5,57, APE=6,25, AA=7,11, Promedio=6,27
 * Ingrese el nombre del estudiante #9: JUAN9
 * Generacion de notas...: ACD=1,07, APE=5,80, AA=2,79, Promedio=3,24
 * Ingrese el nombre del estudiante #10: JUAN10
 * Generacion de notas...: ACD=4,18, APE=2,36, AA=7,37, Promedio=4,50
 * Ingrese el nombre del estudiante #11: JUAN11
 * Generacion de notas...: ACD=9,39, APE=2,47, AA=1,01, Promedio=4,46
 * Ingrese el nombre del estudiante #12: JUAN12
 * Generacion de notas...: ACD=9,52, APE=9,94, AA=3,62, Promedio=7,90
 * Ingrese el nombre del estudiante #13: JUAN13
 * Generacion de notas...: ACD=0,51, APE=4,78, AA=3,16, Promedio=2,80
 * Ingrese el nombre del estudiante #14: JUAN14
 * Generacion de notas...: ACD=3,72, APE=4,09, AA=5,60, Promedio=4,41
 * Ingrese el nombre del estudiante #15: JUAN15
 * Generacion de notas...: ACD=7,29, APE=2,81, AA=8,37, Promedio=6,05
 * Ingrese el nombre del estudiante #16: JUAN16
 * Generacion de notas...: ACD=4,46, APE=1,70, AA=9,28, Promedio=4,94
 * Ingrese el nombre del estudiante #17: JUAN17
 * Generacion de notas...: ACD=4,62, APE=6,07, AA=0,63, Promedio=3,93
 * Ingrese el nombre del estudiante #18: JUAN18
 * Generacion de notas...: ACD=7,81, APE=0,50, AA=3,25, Promedio=3,88
 * Ingrese el nombre del estudiante #19: JUAN19
 * Generacion de notas...: ACD=0,31, APE=9,40, AA=3,72, Promedio=4,51
 * Ingrese el nombre del estudiante #20: JUAN20
 * Generacion de notas...: ACD=6,64, APE=4,24, AA=1,42, Promedio=4,23
 * Ingrese el nombre del estudiante #21: JUAN21
 * Generacion de notas...: ACD=0,56, APE=1,88, AA=3,27, Promedio=1,83
 * Ingrese el nombre del estudiante #22: JUAN22
 * Generacion de notas...: ACD=5,97, APE=6,09, AA=6,99, Promedio=6,32
 * Ingrese el nombre del estudiante #23: JUAN23
 * Generacion de notas...: ACD=6,16, APE=5,00, AA=0,50, Promedio=4,06
 * Ingrese el nombre del estudiante #24: JUAN24
 * Generacion de notas...: ACD=7,01, APE=3,92, AA=1,62, Promedio=4,31
 * Ingrese el nombre del estudiante #25: JUAN25
 * Generacion de notas...: ACD=5,27, APE=2,47, AA=5,74, Promedio=4,43
 * Ingrese el nombre del estudiante #26: JUAN26
 * Generacion de notas...: ACD=7,83, APE=5,99, AA=3,36, Promedio=5,84
 * Ingrese el nombre del estudiante #27: JUAN27
 * Generacion de notas...: ACD=7,74, APE=0,35, AA=3,82, Promedio=3,98
 * Ingrese el nombre del estudiante #28: JUAN28
 * Generacion de notas...: ACD=0,32, APE=5,68, AA=7,88, Promedio=4,47
 * 
 * Promedio del curso: 4,77
 * Estudiantes con promedio por encima del curso:
 * JUAN con promedio 6,56
 * JUAN2 con promedio 5,56
 * JUAN4 con promedio 5,78
 * JUAN5 con promedio 5,61
 * JUAN7 con promedio 5,60
 * JUAN8 con promedio 6,27
 * JUAN12 con promedio 7,90
 * JUAN15 con promedio 6,05
 * JUAN16 con promedio 4,94
 * JUAN22 con promedio 6,32
 * JUAN26 con promedio 5,84
 * 
 * Estudiantes con promedio por debajo del curso:
 * JUAN3 con promedio 4,47
 * JUAN6 con promedio 3,50
 * JUAN9 con promedio 3,24
 * JUAN10 con promedio 4,50
 * JUAN11 con promedio 4,46
 * JUAN13 con promedio 2,80
 * JUAN14 con promedio 4,41
 * JUAN17 con promedio 3,93
 * JUAN18 con promedio 3,88
 * JUAN19 con promedio 4,51
 * JUAN20 con promedio 4,23
 * JUAN21 con promedio 1,83
 * JUAN23 con promedio 4,06
 * JUAN24 con promedio 4,31
 * JUAN25 con promedio 4,43
 * JUAN27 con promedio 3,98
 * JUAN28 con promedio 4,47
 * 
 * Mejor estudiante: JUAN12 con promedio 7,90
 * Peor estudiante: JUAN21 con promedio 1,83
 * BUILD SUCCESSFUL (total time: 1 minute 31 seconds)
 * 
 */
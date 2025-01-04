/**
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios, desarrollar 
 * su procesamiento para presentar los elementos:
 * De la diagonal principal.
 * De la diagonal segundaria.
 * Ubicados bajo la diagonal principal.
 * Ubicados sobre la diagonal principal.
 * Ubicados bajo la diagonal secundaria.
 * Ubicados sobre la diagonal secundaria.
 * 
 * @author Juan Jose Calva
 */

import java.util.Scanner;


public class Ejercicio1_Matriz {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        int size;
        System.out.print("Dime el tamano de la matriz: ");
        size = tcl.nextInt();

        int[][] matriz = new int[size][size];

        System.out.println("Generando....");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < size; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println("\n\nDiagonal secundaria:");
        for (int i = 0; i < size; i++) {
            System.out.print(matriz[i][size - i - 1] + " ");
        }

        System.out.println("\n\nBajo la diagonal principal:");
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println("\n\nSobre la diagonal principal:");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println("\n\nBajo la diagonal secundaria:");
        for (int i = 1; i < size; i++) {
            for (int j = size - i; j < size; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println("\n\nSobre la diagonal secundaria:");
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}

/**
 * BLOQUE DE COMENTARIOS *
 * 
 * run:
 * Dime el tamano de la matriz: 4
 * Generando....
 * 16	4	74	28	
 * 23	91	40	73	
 * 58	38	14	52	
 * 53	96	53	52	

 * Diagonal principal:
 * 16 91 14 52 

 * Diagonal secundaria:
 * 28 40 38 53 

 * Bajo la diagonal principal:
 * 23 58 38 53 96 53 

 * Sobre la diagonal principal:
 * 4 74 28 40 73 52 

 * Bajo la diagonal secundaria:
 * 73 14 52 96 53 52 

 * Sobre la diagonal secundaria:
 * 16 4 74 23 91 58 
 * BUILD SUCCESSFUL (total time: 11 seconds)
 */


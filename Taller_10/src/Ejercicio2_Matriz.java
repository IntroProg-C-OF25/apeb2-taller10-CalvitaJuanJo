/**
 * Dadas dos matrices (cuadradas y/o rectangulares) de valores enteros 
 * aleatorios, desarrollar su procesamiento para calcular y presentar:
 * La suma de las dos matrices (considerar las restricciones matemáticas para 
 * ello).
 * La multiplicación de las dos matrices (considerar las reglas matemáticas para
 * ello).
 * 
 * @author Juan Jose Calva
 */

import java.util.Scanner;

public class Ejercicio2_Matriz {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        int filas, columnas;

        System.out.print("Dime el numero de filas: ");
        filas = tcl.nextInt();
        System.out.print("Dime el numero de columnas: ");
        columnas = tcl.nextInt();

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] suma = new int[filas][columnas];

        System.out.println("\nMatriz1...");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = (int) (Math.random() * 50);
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz2...");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz2[i][j] = (int) (Math.random() * 50);
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nSuma de las matrices...");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }

        if (filas == columnas) {
            System.out.println("\nMultiplicacion de las matrices...");
            int[][] producto = new int[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    for (int k = 0; k < columnas; k++) {
                        producto[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                    System.out.print(producto[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nError en la multiplicacion, dimensiones incorrectas.");
        }
    }
}

/**
 * BLOQUE DE COMENTARIOS
 * 
 * run:
 * Dime el numero de filas: 4
 * Dime el numero de columnas: 4
 * 
 * Matriz1...
 * 14	37	27	46	
 * 37	31	17	8	
 * 40	38	29	41	
 * 44	10	46	7	
 * 
 * Matriz2...
 * 32	20	48	39	
 * 19	21	44	18	
 * 32	45	34	26	
 * 18	27	22	34	
 * 
 * Suma de las matrices...
 * 46	57	75	85	
 * 56	52	61	26	
 * 72	83	63	67	
 * 62	37	68	41	
 * 
 * Multiplicacion de las matrices...
 * 2843	3514	4230	3478	
 * 2461	2372	3894	2715	
 * 3668	4010	5480	4392	
 * 3196	3349	4270	3330	
 * BUILD SUCCESSFUL (total time: 4 seconds)
 */


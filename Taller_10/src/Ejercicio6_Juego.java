/**
 * Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3. 
 * Permita a dos jugadores marcar sus movimientos alternativamente. El juego 
 * debe verificar si alguno de los jugadores ha ganado o si hay un empate.
 * 
 * @author Juan Jose Calva
 */

import java.util.Scanner;

public class Ejercicio6_Juego {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        char[][] tablero = new char[3][3];
        boolean jterminado = false;
        char juactual = 'X';
        int fila, columna;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }

        while (!jterminado) {
            System.out.println("\nTablero:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
            
            System.out.println("Turno del jugador " + juactual);
            System.out.print("Ingrese fila (0-2): ");
            fila = tcl.nextInt();
            System.out.print("Ingrese columna (0-2): ");
            columna = tcl.nextInt();
            
            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == '-') {
                tablero[fila][columna] = juactual;
                if (verificarGanador(tablero, juactual)) {
                    System.out.println("!Jugador " + juactual + " gana!");
                    jterminado = true;
                } else if (empate(tablero)) {
                    System.out.println("¡Es un empate!");
                    jterminado = true;
                } else {
                    juactual = (juactual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Movimiento invalido, intentalo de nuevo :)");
            }
        }
        
        tcl.close();
    }
    
     public static boolean verificarGanador(char[][] tablero, char jugador) {
         
        for (int i = 0; i < 3; i++) {
        
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) return true;
          
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) return true;
        }
   
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) return true;
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) return true;

        return false;
    }
    
    public static boolean empate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') return false;
            }
        }
        return true;
    }
}

/***
 * BLOQUE DE COMENTARIOS
 * 
 * run:
 * 
 * Tablero:
 * - - - 
 * - - - 
 * - - - 
 * Turno del jugador X
 * Ingrese fila (0-2): 1
 * Ingrese columna (0-2): 2
 * 
 * Tablero:
 * - - - 
 * - - X 
 * - - - 
 * Turno del jugador O
 * Ingrese fila (0-2): 0
 * Ingrese columna (0-2): 1
 * 
 * Tablero:
 * - O - 
 * - - X 
 * - - - 
 * Turno del jugador X
 * Ingrese fila (0-2): 1
 * Ingrese columna (0-2): 2
 * Movimiento invalido, intentalo de nuevo :)
 * 
 * Tablero:
 * - O - 
 * - - X 
 * - - - 
 * Turno del jugador X
 * Ingrese fila (0-2): 1
 * Ingrese columna (0-2): 1
 * 
 * Tablero:
 * - O - 
 * - X X 
 * - - - 
 * Turno del jugador O
 * Ingrese fila (0-2): 0
 * Ingrese columna (0-2): 2
 * 
 * Tablero:
 * - O O 
 * - X X 
 * - - - 
 * Turno del jugador X
 * Ingrese fila (0-2): 1
 * Ingrese columna (0-2): 0
 * !Jugador X gana!
 * BUILD SUCCESSFUL (total time: 58 seconds)
 * 
 */
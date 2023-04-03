/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;
   import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca los números del cuadrado mágico
        int[][] cuadrado = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduce el número de la fila " + (i+1) + ", columna " + (j+1) + ": ");
                cuadrado[i][j] = scanner.nextInt();

                // Comprobar si el número introducido es correcto
                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Error: El número debe estar entre 1 y 9.");
                    return;
                }
            }
        }
                System.out.println("Generando Matriz A: ");          
            for (int i = 0; i <  3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + cuadrado[i][j] + "]");
            }
            System.out.println("");
                }

        // Comprobar si el cuadrado es mágico
        if (esCuadradoMagico(cuadrado)) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }

    /**
     * Comprueba si un cuadrado de 3x3 es mágico o no.
     *
     * @param cuadrado el cuadrado a comprobar
     * @return true si el cuadrado es mágico, false en caso contrario
     */
    public static boolean esCuadradoMagico(int[][] cuadrado) {
        // Calcular la suma de la primera fila
        int sumaFila = 0;
        for (int j = 0; j < 3; j++) {
            sumaFila += cuadrado[0][j];
        }

        // Comprobar si todas las filas tienen la misma suma
        for (int i = 1; i < 3; i++) {
            int sumaFilaActual = 0;
            for (int j = 0; j < 3; j++) {
                sumaFilaActual += cuadrado[i][j];
            }
            if (sumaFilaActual != sumaFila) {
                return false;
            }
        }

        // Comprobar si todas las columnas tienen la misma suma
        for (int j = 0; j < 3; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 3; i++) {
                sumaColumna += cuadrado[i][j];
            }
            if (sumaColumna != sumaFila) {
                return false;
            }
        }

        // Comprobar si las diagonales tienen la misma suma
        int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
        // Si todas las sumas son iguales, el cuadrado es mágico
        return !(sumaDiagonal1 != sumaFila || sumaDiagonal2 != sumaFila);
    }
}

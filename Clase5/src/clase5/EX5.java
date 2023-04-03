/*
Realizar un programa que llene una matriz de tamaño NxM 
con valores aleatorios y muestre la suma de sus elementos.
 */
package clase5;
   import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class EX5 {
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
    }
}

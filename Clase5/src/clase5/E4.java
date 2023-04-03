/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package clase5;

import java.util.Scanner;


/**
 *
 * @author Ignacio Carrera
 */
public class E4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz [][] , fila , col;
        boolean simetrica = true;
        
        fila = leer.nextInt();
        col = leer.nextInt();
          matriz = new int [fila][col];
          
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < col; j++) {
                    matriz[i][j] = (int) (Math.random()*10+1);
            }
                }
        System.out.println("Generando Matriz A: ");          
            for (int i = 0; i <  fila; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
                }
            
        System.out.println("Generando Matriz B: ");    
            for (int j = 0; j < fila; j++) {
                for (int i = 0; i < col; i++) {
                    System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
                }
 }       
}

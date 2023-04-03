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
public class E5 {
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz [][] , fila , col;
        boolean simetrica = true;
        
        fila = leer.nextInt();
        col = leer.nextInt();
          matriz = new int [fila][col];
          
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < col; j++) {
                    matriz[i][j] = (int) (Math.random()*10-5);
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
                    matriz[i][j] = matriz[i][j]*(-1);
                    System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
                }
            if (fila == col) {
                int i,j;
                i=0;
                while (i<fila && simetrica==true) {
                    j=0;
                    while (j<i && simetrica==true) {
                        if (matriz [i][j] != matriz [j][i]) {
                            simetrica = false;
                            
                        }
                        j++;
                    }
                    i++;
                }
                if (simetrica == true) {
                    System.out.println("La matriz es simetrica ");
                } else {
                     System.out.println("La matriz No simetrica ");
                }
        } else {
                System.out.println("La matriz No simetrica ");
            }
 }       
}

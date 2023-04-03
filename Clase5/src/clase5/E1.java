/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
y los muestre por pantalla en orden descendente.
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author Ignacio Carrera
 */
public class E1 {
        public static void main(String[] args) {
        int[] vec = new int[100];  
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Se estan generaron los 100 primeros numeros: ");
            for (int i = 0; i < 100; i++) {
                vec[i] = i;
            }
                  
            for (int i = 0; i < 100; i++) {
                System.out.println("[" + vec[i] + "]");   	 
             }
            
        System.out.println("");
        
}

    }  

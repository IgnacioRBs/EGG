/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author Ignacio Carrera
 */
public class E2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la dimencion del vector: ");
            int dimencion = leer.nextInt();
            int[] vec = new int[dimencion];  
      
        
         System.out.println("Se estan generaron los "+dimencion+ " primeros numeros: ");
            for (int i = 0; i < dimencion; i++) {
                vec[i] = (int) (Math.random()*10+1);
            }
                  
            for (int i = 0; i < dimencion; i++) {
                System.out.println("[" + vec[i] + "]");   	 
            }
            
        System.out.println("Escriba el numero que desea buscar: ");
            int num = leer.nextInt();
        
            for (int i = 0; i < dimencion; i++) {
                if (vec[i] == num) {
                    System.out.println("[" + vec[i] + "] se Ubica en el index "+i);
                }   
            }
        System.out.println("");
        
    }
}

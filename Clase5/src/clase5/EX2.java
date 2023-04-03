/*
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna 
diferencia entre los elementos).
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EX2 {
public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Inicializar la dimencion del vector: ");
             int index = scanner.nextInt();
             int comparacion = 0;
             int[] vecA = new int[index];
             int[] vecB = new int[index];
                
            for (int i = 0; i < index; i++) {
                System.out.print("Introduce el numero de Vector A "+i+"= ");
                vecA[i] = scanner.nextInt();
                System.out.print("Introduce el numero de Vector B "+i+"= ");
                vecB[i] = scanner.nextInt();
                
                
		
		
		
		 if(vecA[i] == vecB[i]){
			comparacion++;
			
		    }
                 else{
                     System.out.println("Se encontro una diferencia en la posicion "+i);
                     break;
                 }
            }
		
                 
                 
		 
                 
		
                if(comparacion == index){
			 System.out.println("Los dos vectores son iguales");
			
		        }
                
		/*if(comparacion < index)
		{
			System.out.println("Los dos vectores son distintos");
			
		}*/	
	}
}
    


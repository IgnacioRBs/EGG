/*
 * Realizar un algoritmo que calcule la suma de todos los elementos de 
un vector de tamaño N, con los valores ingresados por el usuario.

 */
package clase5;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class EX1 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inicializar la dimencion del vector: ");
             int index = scanner.nextInt();
             int[] vec = new int[index];
        
        for (int i = 0; i < index; i++) {
                System.out.print("Introduce el número de Vector "+i+"=");
                vec[i] = scanner.nextInt();
        }
                System.out.println("Generando Vector: ");          
        for (int i = 0; i <  index; i++) {
                System.out.print("[" + vec[i] + "]");
        }
             int vecsuma = 0;
        for (int i = 0; i <  index; i++) {
                    vecsuma += vec[i];
        }
        System.out.println("");
        System.out.println("La suma de los vectores: "+vecsuma);        
        }
    }

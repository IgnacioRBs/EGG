/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        /*Implementar un programa que le pida dos números enteros al usuario y
        determine si ambos o alguno de ellos es mayor a 25.*/
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("Escriba un numero");
        num1 = teclado.nextInt();
        System.out.println("Escriba el segundo numero");
        num2 = teclado.nextInt();
        
        if (num1 > 25 || num2 > 25) {
            System.out.println("Uno de los numeros o ambos es mayor a 25");
        } else {
            System.out.println("Los dos numeros son menores a 25");
        }
        
                
        
        
        
        
        
        
    }
    
}
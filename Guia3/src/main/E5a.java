/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class E5a {
  public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Ingresa un numero limite positivo");
        int numero=num.nextInt();
       
        int suma = 0;
        
        while (suma<=numero){
            
            System.out.println("Ingresa un numero");
            
            int numero2 = num.nextInt();
            suma += numero2;
            
           }      
        
        System.out.println("La suma de los numeros introducidos es:" + suma);
    }
    
}  

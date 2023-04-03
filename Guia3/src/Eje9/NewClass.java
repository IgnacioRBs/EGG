/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eje9;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class NewClass {
    

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba una nota entre 0 y 10");
       int nota = teclado.nextInt();
        while (nota<0 || nota>10){
            System.out.println("La nota ha sido ingresada incorrectamente, ingrese una nueva");
         nota = teclado.nextInt();   
        }
        System.out.println("La nota ha sido ingresada correctamente");
    }
    
}

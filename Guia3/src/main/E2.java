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
public class E2 {
   
    public static void main(String[] args) {
   Scanner Input = new Scanner(System.in);
        String Palabra = Input.nextLine();
        
        if (Palabra.equals("eureka")){
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        } 
}
}
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
public class T14 {
        public static void main(String[] args) {
        String[] vec = new String[4];  
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres del los integrantes del Equipo: ");
            for (int i = 0; i < 4; i++) {
                vec[i] = leer.nextLine();	 
            }
                  
            for (int i = 0; i < 4; i++) {
                System.out.print("[" + vec[i] + "]");   	 
             }
            
        System.out.println("");
        
}

    }    

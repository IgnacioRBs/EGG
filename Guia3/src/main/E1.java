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


public class E1 {
    
        public static void main(String[] args) {
    
        System.out.println("Ingresar un numero");
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        if ((n % 2) == 0){
            System.out.println("Su numero es par");
        } else{
            System.out.println("Su numero no par");
        }
 }
 }

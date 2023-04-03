/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class T12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //¨Pido datode entrada
        System.out.println("Ingrese primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int b = sc.nextInt();
        
        if (a % b == 0) {
            System.out.println("El numero: "+b+", es multiplo de: "+a);
            
        }else {
           System.out.println("El numero: "+b+", no es multiplo de: "+a);
        }
    }
    
}

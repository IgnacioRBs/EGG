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
public class E5 {
    
/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero".  El programa deberá 
calcular y mostrar el resultado de la suma de los números leídos, pero si el número 
es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        int num1, num2, opci;
        String Salida;
        Salida = "n";

        do {
            System.out.println("Ingrese dos numeros enteros positivos");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            Menu();
            opci = leer.nextInt();
      
            switch (opci) {
                case 1:
                    num1 = num1 + num2;
                    System.out.println("El resultado es: " + num1);
                    break;
                case 2:   
                    num1 = num1 - num2;
                    System.out.println("El resultado es: " + num1);
                    break;
                case 3:
                    num1 = num1 * num2;
                    System.out.println("El resultado es: " + num1);
                    break;
                case 4:
                    num1 = num1 / num2;
                    System.out.println("El resultado es: " + num1);
                    break;
                case 5:
                    System.out.println("Desea Salir s/n");
                    Salida = leer2.nextLine();
                    break;
                default:
                    System.out.println("por favor ingresar u numero del 1 al 5");          
            }
        }
        while (Salida.contentEquals("n"));
    }
    
    
    static void Menu() {
        System.out.println("Seleecione una operacion");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
    }
}
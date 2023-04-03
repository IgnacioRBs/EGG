/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eje10;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Eje10 {
    
public static void main(String[] args) {

            /*
            Escriba un programa que lea 20 números. Si el número leído es igual a cero se 
            debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
            programa deberá calcular y mostrar el resultado de la suma de los números
            leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
            de la sentencia break.
            */
            Scanner leer = new Scanner(System.in);
            int num, suma, i;
            i=0;
            suma=0;
            
            do{
                System.out.print("Ingrese un número : ");
                num = leer.nextInt();
                if (num>0){
                    suma+=num;
                }
                if (num==0){
                    System.out.println("Se capturó el numero cero");
                    break;
                }
                i++;
            } while ((i<20)||(num==0)); 
            System.out.println("La suma de los numero positivos es " + suma);
        }
    }

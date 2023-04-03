/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores 
de edad. Después de cada persona, el programa debe preguntarle al usuario si 
quiere seguir mostrando personas y frenar cuando el usuario ingrese 
la palabra “No”.
 */
package clase4;

import java.util.Scanner;

/**
 *
 * @author Ignacio Carrera
 */
public class E2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        
           String name;
              int edad;
        
        do{
            System.out.println("Ingrese el nombre y edad de sus empleados: ");
                name = leer.next();
                edad = leer.nextInt();      
            Detector(name,edad);
            
            System.out.println("Desea Salir s/n");
          } while (leer2.nextLine().contentEquals("n"));  
        
    }
    
    static void  Detector(String name,int edad){
         if(edad >= 18) { 
              System.out.println("Su empleado " + name+ ",Tiene la edad de "+edad+" años por lo que es Mayor de edad" );
         } else {
              System.out.println("Su empleado " + name+ ",Tiene la edad de "+edad+" años por lo que es Menor de edad" );
         } 
    }
}

/*
 * Crea una aplicación que le pida dos números al usuario y 
este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática 
y deben devolver sus resultados para imprimirlos en el main. 

 */
package clase4;

import java.util.Scanner;

/**
 *
 * @author Ignacio Carrera
 */
public class E1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
            System.out.println("Ingrese dos numeros enteros positivos");
                int num1 = leer.nextInt();
                int num2 = leer.nextInt();
           
            System.out.println("Seleecione una operacion");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
                int opt = leer.nextInt();
        
        switch (opt) {
                case 1:
                    int Cala = calcu(num1,num2);
                    System.out.println("El resultado es: " + Cala);
                    break;
                case 2:   
                    int Cala2 = calcu2(num1,num2);
                    System.out.println("El resultado es: " + Cala2);
                    break;
                case 3:
                    int Cala3 = calcu3(num1,num2);
                    System.out.println("El resultado es: " + Cala3);
                    break;
                case 4:
                    int Cala4 = calcu4(num1,num2);
                    System.out.println("El resultado es: " + Cala4);
                    break;
                default:
                    System.out.println("por favor ingresar u numero del 1 al 5");          
            }
    }
    
    // Funcione de Suma
    public static int calcu(int num1,int num2){
        int Resu= num1 + num2;
        return Resu;  
    }
   // Funcione de Resta
        public static int calcu2(int num1,int num2){
        int Resu= num1 - num2;
        return Resu;  
    }
    // Funcione de Multiplicasion
            public static int calcu3(int num1,int num2){
        int Resu= num1 * num2;
        return Resu;  
    }
    // Funcione de Division  
                public static int calcu4(int num1,int num2){
        int Resu= num1 / num2;
        return Resu;  
    }
}

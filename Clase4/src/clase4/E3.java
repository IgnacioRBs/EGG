/*
 *Crea una aplicación que a través de una función nos convierta una cantidad 
de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
yenes o libras. La función tendrá como parámetros, la cantidad de euros y 
la moneda a convertir que será una cadena, este no devolverá ningún valor y 
mostrará un mensaje indicando el cambio (void).

El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package clase4;

import java.util.Scanner;

/**
 *
 * @author Ignacio Carrera
 */
public class E3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
         System.out.println("Ingrese la Cantidad de Euros que quiere convertir");
                int euro = leer.nextInt();
                
         System.out.println("Escriba el Tipo de moneda de cambio: libras, $ , yenes");
               String mon = leer.next();
                
            switch (mon) {
                case "libras":
                    Visa(euro,mon);
                    break;
                case "$":   
                    Visa2(euro,mon);
                    break;
                case "yenes":
                    Visa3(euro,mon);
                    break;
                default:
                    System.out.println("Lo sentimos , no podemos cambiar sus € a esa moneda");          
            }
        
        }
    
    static void  Visa(int euro,String mon){
        double Resu= 0.86 * euro;
              System.out.println("Sus "+euro+" €, fueron convertidos a "+Resu+" libras." );
    }
    
    static void  Visa2(int euro,String mon){
        double Resu= 1.28611 * euro;
              System.out.println("Sus "+euro+" €, fueron convertidos a "+Resu+" $." );
    }
        
    static void  Visa3(int euro,String mon){
        double Resu= 129.852 * euro;
              System.out.println("Sus "+euro+" €, fueron convertidos a "+Resu+" yenes." );
    }
}

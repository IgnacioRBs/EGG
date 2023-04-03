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
public class Clase4 {
    
    public static void main(String[] args) {
    /**
     * @param args the command line arguments
     */
System.out.println("ingrese una frase");
        Scanner leer = new Scanner(System.in);
        String frase1 = leer.next();
        
        
    //    frase = equalsIgnoreCase(frase str);
        String retorno = convertidor(frase1);
        System.out.println(retorno);
        
   }
        
   public static String convertidor(String frase){
     
    
        
     //substring(int beginIndex, int endIndex)
      
     int largo = frase.length();
     String letra;
     String fraseA="";
     
     
     for (int i = 0; i < largo; i++) {
         letra = frase.substring(i, i+1);
         
         switch (letra){
             case "a":
                 fraseA = fraseA.concat("@");
                 break;
             case "e":
                 fraseA = fraseA.concat("#");
                 break;
             case "i":
                 fraseA = fraseA.concat("$");
                 break;
             case "o":
                 fraseA = fraseA.concat("%");
                 break;
             case "u":
                 fraseA = fraseA.concat("#");
                 break;
             default:
                 fraseA = fraseA.concat(letra);
                 break;
         }
     }       
                         
        return fraseA;   
    }
    

 }   
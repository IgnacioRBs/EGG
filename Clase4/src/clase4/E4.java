/*
Crea una aplicación que nos pida un número por teclado y con una función se 
lo pasamos por parámetro para que nos indique si es o no un número primo, debe 
devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package clase4;

import java.util.Scanner;

/**
 *
 * @author Ignacio Carrera
 */
public class E4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
            int numero = leer.nextInt();
            boolean Verificador = esPrimo(numero);
            
        System.out.println(Verificador);
    }
    
    
    public static boolean esPrimo(int numero) {
  // El 0, 1 y 4 no son primos
  if (numero == 0 || numero == 1 || numero == 4) {
    return false;
  }
  for (int x = 2; x < numero / 2; x++) {
    // Si es divisible por cualquiera de estos números, no
    // es primo
    if (numero % x == 0)
      return false;
  }
  // Si no se pudo dividir por ninguno de los de arriba, sí es primo
  return true;
}
    
}

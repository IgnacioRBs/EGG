/*
Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro. Después haremos otra función o 
procedimiento que imprima el vector.
 */
package clase5;

/**
 *
 * @author usuario
 */
public class EX3 {
    public class Ejercicio3Extra {
  
  }
  public static void main(String[] args) {
      int num;
      int[] vector = new int[num=3];
     rellenar(vector, num);
     imprimir(vector, num);
  }
  
  public static int[] rellenar (int vector[],int num){
      for (int i = 0; i < num; i++) {
          vector[i] = (int)(Math.random()*10-1)+1;
      }
      
      return vector;
  
  } 
  public static void imprimir (int vector[], int num){
      for (int i = 0; i < num; i++) {
          System.out.print("[" + vector[i]+ "] =" + i + " "); 
      }
      System.out.println(""); 
  }
}

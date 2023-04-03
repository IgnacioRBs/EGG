/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author Ignacio Carrera
 */
public class E3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de nﾃｺmeros a ingresar: ");
        int n = leer.nextInt();

        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nﾃｺmero " + (i + 1) + ": ");
            vector[i] = leer.nextInt();
        }
        int[] contar = new int[5]; // Inicializar vector de conteo
        for (int num : vector) { //for mejorado
            int digitos = String.valueOf(num).length(); // Contar cantidad de dﾃｭgitos
            if (digitos <= 5) {
                contar[digitos - 1]++; // Incrementar elemento correspondiente del vector de conteo
            }

        }
        System.out.println("Cantidad de nﾃｺmeros de 1 dﾃｭgito: " + contar[0]);
        System.out.println("Cantidad de nﾃｺmeros de 2 dﾃｭgitos: " + contar[1]);
        System.out.println("Cantidad de nﾃｺmeros de 3 dﾃｭgitos: " + contar[2]);
        System.out.println("Cantidad de nﾃｺmeros de 4 dﾃｭgitos: " + contar[3]);
        System.out.println("Cantidad de nﾃｺmeros de 5 dﾃｭgitos: " + contar[4]);
    }
}
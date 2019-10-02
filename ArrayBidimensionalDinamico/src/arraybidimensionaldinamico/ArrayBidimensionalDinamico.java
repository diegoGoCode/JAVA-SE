package arraybidimensionaldinamico;

import java.util.Scanner;

/**
 *
 * @author diego.diaz
 */
public class ArrayBidimensionalDinamico {

    public static void main(String[] args) {
        
        int filas;
        int columnas;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numeros de filas para la matriz: ");
        filas = entrada.nextInt();
        System.out.print("Ingrese el numeros de columnas para la matriz: ");
        columnas = entrada.nextInt();
        
        int numeros[][] = new int[filas][columnas];
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("ingrese el valor para fila: " + i + " columna: " + j);
                numeros[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("");
        System.out.println("Asi queda la matriz");
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("["+numeros[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
}

package pkg5.entradadedatosscanner;

import java.util.Scanner;

/**
 *
 * @author diego.diaz
 */
public class EntradaDeDatosScanner {

    public static void main(String[] args) {
        String nombre;
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ingresa tu nombre");
        nombre = teclado.next();
        
        System.out.println("Ingrese por favor dos numeros para sumarlos");
        System.out.println("ingresa tu nombre");
        a = teclado.nextInt();
      
        System.out.println("ingresa tu nombre");
        b = teclado.nextInt();
        
        c = a + b;
        
        System.out.println(nombre + " El resultado de la suma es : " + c );
    }
    
}

package cadenalengthsubstring;

import java.util.Scanner;

/**
 *
 * @author diego.diaz
 */
public class CadenaLengthSubstring {

    public static void main(String[] args) {
        String cadena;
        int ncadena, desde, hasta;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        cadena = entrada.nextLine();
        ncadena = cadena.length();
        System.out.println(cadena + " tiene " + ncadena + " caracteres");
        
        System.out.print("¿Desde que parte deseas obtener la nueva? :");
        desde = entrada.nextInt();
        System.out.print("¿Hasta que parte deseas obtener la nueva? :");
        hasta = entrada.nextInt();
        
        System.out.println("Nueva cadena: " + cadena.substring(desde, hasta));
    }
    
}

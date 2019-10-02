package metodoequalscaracteres;

import java.util.Scanner;

/**
 *
 * @author diego.diaz
 */
public class MetodoEqualsCaracteres {

    public static void main(String[] args) {

        String nombre1, nombre2;
        int volver = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("************");
        System.out.println("*Bienvenido*");
        System.out.println("************");
        System.out.println("");

        while (volver == 1) {
            System.out.println("Este es un programa para comprar dos nombres");
            System.out.println("Por favor, ingrese el primer nombre");
            nombre1 = entrada.nextLine();

            System.out.println("Por favor, ingrese el segundo nombre");
            nombre2 = entrada.nextLine();

            if (nombre1.equals(nombre2)) {
                System.out.println("Los nombres son iguales");
            } else {
                System.out.println("Los nombres son diferentes");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("¿Desea comparar nuevamente?");
            System.out.println("1.Si");
            System.out.println("Cualquier tecla. No");
            
            volver = entrada.nextInt();
            if(volver == 1){
                entrada.nextLine();
            }else{
                entrada.close();
            }
        }

    }

}

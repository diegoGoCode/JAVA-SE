package pkg7.pkgswitch.pkgcase;

import java.util.Scanner;

/**
 *
 * @author diego.diaz
 */
public class SwitchCase {

    public static void main(String[] args) {

        int operacion = 0;
        int numero1 = 0, numero2 = 0, r = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("*************************************");
        System.out.println("*Bienvenido a la calculadora en JAVA*");
        System.out.println("*************************************");
        System.out.println("");

        System.out.println("*Operaciones disponibles*");
        System.out.println("1-suma");
        System.out.println("2-resta");
        System.out.println("3-multiplicación");
        System.out.println("4-división");
        System.out.println("");

        System.out.println("¿Que operacion desea realizar?, ingrese el numero de la operacion");
        operacion = entrada.nextInt();

        System.out.println("Ingrese el numero 1");
        numero1 = entrada.nextInt();

        System.out.println("Ingrese el numero 2");
        numero2 = entrada.nextInt();

        switch (operacion) {
            case 1:
                r = numero1 + numero2;
                System.out.println(numero1 + " + " + numero2 + " = " + r);
                break;
            case 2:
                r = numero1 - numero2;
                System.out.println(numero1 + " - " + numero2 + " = " + r);
                break;
            case 3:
                r = numero1 * numero2;
                System.out.println(numero1 + " x " + numero2 + " = " + r);
                break;
            case 4:
                r = numero1 / numero2;
                System.out.println(numero1 + " % " + numero2 + " = " + r);
                break;
            default:
                System.out.println("La operacion: " + operacion + " no existe");
                break;
        }

    }
}

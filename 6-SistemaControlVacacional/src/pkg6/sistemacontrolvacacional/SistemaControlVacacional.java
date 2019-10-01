package pkg6.sistemacontrolvacacional;

import java.util.Scanner;

/**
 *
 * @author diego.diaz
 */
public class SistemaControlVacacional {

    public static void main(String[] args) {
        
        Scanner entrada  = new Scanner(System.in);
        
        String nombre = "";
        
        int clave = 0, antiguedad = 0;
        
        System.out.println("*******************************************************");
        System.out.println("*Bienvenido al sistema vacacional de Coca-Cola Company*");
        System.out.println("*******************************************************");
        System.out.println("");
        System.out.println("");
        
        System.out.print("¿Cual es el nombre del trabajador?: ");
        nombre = entrada.nextLine();
        System.out.println("");
        
        System.out.print("¿Cuanto timepo de servicio tiene el trabajador?: ");
        antiguedad = entrada.nextInt();
        System.out.println("");
        
        System.out.print("¿Cual es la clave del trabajador?: ");
        clave = entrada.nextInt();
        System.out.println("");
        
        if(clave == 1){
            if(antiguedad == 1){
                System.out.println(nombre + " Tiene derecho a 6 dias");
            }else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println(nombre + " Tiene derecho a 14 dias");
            }else if(antiguedad == 7){
                System.out.println(nombre + " Tiene derecho a 20 dias");
            }else{
                System.out.println("Aun no tiene derecho a vacaciones   ");
            }
        }else if(clave == 2){
            if(antiguedad == 1){
                System.out.println(nombre + " Tiene derecho a 7 dias");
            }else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println(nombre + " Tiene derecho a 15 dias");
            }else if(antiguedad == 7){
                System.out.println(nombre + " Tiene derecho a 22 dias");
            }else{
                System.out.println("Aun no tiene derecho a vacaciones   ");
            }
        }else if(clave == 3){
            if(antiguedad == 1){
                System.out.println(nombre + " Tiene derecho a 10 dias");
            }else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println(nombre + " Tiene derecho a 20 dias");
            }else if(antiguedad == 7){
                System.out.println(nombre + " Tiene derecho a 30 dias");
            }else{
                System.out.println("Aun no tiene derecho a vacaciones");
            }
        }else{
            System.out.println("Error!, la calve es incorrecta");
        }
    }
    
}

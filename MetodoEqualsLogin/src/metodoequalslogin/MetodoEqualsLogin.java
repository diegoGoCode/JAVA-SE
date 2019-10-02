package metodoequalslogin;

import java.util.Scanner;

/**
 *
 * @author diego.diaz
 */
public class MetodoEqualsLogin {

    public static void main(String[] args) {
        
        String usuario = "";
        String password = "";
        int volver = 1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido, ingrese su usuario y su contraseña para ingresar");

        while (volver == 1) {

            System.out.print("Usuario: ");
            usuario = entrada.nextLine();
            System.out.print("Contraseña: ");
            password = entrada.nextLine();

            if (usuario.equals("diego@gmail.com") && password.equals("123")) {

                System.out.println("Bienvenido a su perfil");
                volver = 0;

            } else {

                System.out.println("Usuario o Contraseña incorrecta! intente nuevamente");
                volver = 1;

            }
        }
    }
}

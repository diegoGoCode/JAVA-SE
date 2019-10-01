package pkg4.calculadoraifelseif;

/**
 *
 * @author diego.diaz
 */
public class CalculadoraIfElseIf {

    public static void main(String[] args) {

        int operacion = 3   ;
        int n1 = 2;
        int n2 = 4;
        int re = 0;
        
        if(operacion == 1){
            re = n1 + n2;
            System.out.println("El resultado de la suma es: " + re);
        }else if(operacion == 2){
            re = n1 - n2;
            System.out.println("El resultado de la resta es: " + re);
        }else if(operacion == 3){
            re = n1 * n2;
            System.out.println("El resultado de la multiplicacion es: " + re);
        }else if(operacion == 4){
            re = n1 / n2;
            System.out.println("El resultado de la division es: " + re);
        }

    }
    
}

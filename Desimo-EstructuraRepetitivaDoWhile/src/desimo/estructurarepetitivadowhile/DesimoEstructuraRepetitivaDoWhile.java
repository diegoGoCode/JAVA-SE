package desimo.estructurarepetitivadowhile;

/**
 *
 * @author diego.diaz
 */
public class DesimoEstructuraRepetitivaDoWhile {

    public static void main(String[] args) {
       int i = 1000;
        do {            
            
            System.out.print(i + ",");
           
            // Es lo mismo que utilizar  (i = i - 200);
            i -= 200;
            
        } while (i >= 0);
    }
    
}

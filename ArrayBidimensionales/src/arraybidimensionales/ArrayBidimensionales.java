package arraybidimensionales;

/**
 *
 * @author diego.diaz
 */
public class ArrayBidimensionales {

    public static void main(String[] args) {
       int numeros[][] = new int [2][2];
       
       numeros[0][0] = 23;
       numeros[0][1] = 46;
       numeros[1][0] = 89;
       numeros[1][1] = 3;
       
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("["+numeros[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
}

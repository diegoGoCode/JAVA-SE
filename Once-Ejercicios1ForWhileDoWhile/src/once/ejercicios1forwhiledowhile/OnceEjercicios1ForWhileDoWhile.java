package once.ejercicios1forwhiledowhile;

/**
 *
 * @author diego.diaz
 */
public class OnceEjercicios1ForWhileDoWhile {

    public static void main(String[] args) {
        //imprimir 1,2,3,4,5,6,7,8,9,10 con ciclo for, while y do-while
        int i = 0;
        System.out.println("Serie con for: ");
        for (i = 1; i <= 10; i++) {
            if (i < 10) {
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
        }

        i = 1;
        System.out.println(" ");

        System.out.println("Serie con while: ");
        while (i <= 10) {
            if(i < 10){
                System.out.print(i + ",");
            }else{
                System.out.print(i);
            }
            //Se incrementa en uno la variable i
            i++;
        }
        
        i = 1;
        System.out.println(" ");
        
        System.out.println("Serie con do-while: ");
        do {            
            if(i < 10){
                System.out.print(i + ",");
            }else{
                System.out.print(i);
            }
            //Se incrementa en uno la variable i
            i++;
        } while (i <= 10);
    }

}

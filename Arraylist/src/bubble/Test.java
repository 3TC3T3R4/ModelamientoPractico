package bubble;

/**
 * Esta clase representa a seleccion del usuario el mejor metodo para ordenar
 * numeros de un arreglo.
 *
 *
 * @version 18.0.0 2022-07-20
 *
 * @author Estevan Tangarife Correa teban_1928@hotmail.com
 *
 * @since 18
 *
 */
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        /**
         * Representa la opcion escojida por el usuario.
         */
        int option;

        /**
         * Crea una instancia de la clase Bubble.
         */
        BubbleAlgorithm Algorithm = new BubbleAlgorithm();
        /**
         * Crea una instancia de la clase Quicksort.
         */
        Quicksort alQuicksort = new Quicksort();
        /**
         * Crea una instancia de la clase Scanner.
         */
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Cual metodo te gustaria usar?\n 1.METODO BURBUJA\n 2.QUICK SORT");
        option = keyboard.nextInt(); //opcion del evento escojido por el usuario.
        if (option == 1) { //accede a todos los metodos de la clase Bubble.
            Algorithm.getsize();
            Algorithm.getnumbers();
            Algorithm.orderarray();
            Algorithm.showarray();

        } else {
            alQuicksort.Retursize(); // Se accede a todos los metodos de la clase quicksort
            double a[] = alQuicksort.vectorfull(); // se crea un arreglo que depende del metodo.
            int n = a.length;
            alQuicksort.quick(a, 0, n - 1);//se envian los parametros al metodo.
            System.out.println("\nVector ordenado ");
            alQuicksort.printArr(a);
            System.out.println();

        }

    }

}

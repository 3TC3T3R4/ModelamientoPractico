package bubble;

/**
 * Esta clase representa el motodo de ordenamiento mas conocido como metodo
 * burbuja.
 *
 * @version 18.0.0 2022-07-20
 *
 * @author Estevan Tangarife Correa teban_1928@hotmail.com
 *
 * @since 18
 *
 */
import java.util.Scanner;

public class BubbleAlgorithm {

    private double array1[];
    private int size1;
    private int stop;
    private double temp;
    /**
     * Representa la creacion de la instancia de la clase scanner.
     */
    Scanner keyboard = new Scanner(System.in);

    /**
     * Representa la creacion de la instancia de la clase.
     */
    public BubbleAlgorithm() {
    }

    /**
     * Representa la obtencion de el tamaño del vector y el rango de numeros al
     * azar
     *
     */
    public void getsize() {
        System.out.println("Ingrese el tamano del vector");
        size1 = keyboard.nextInt();//Tamaño del vector.
        System.out.println("Ingrese el tope de numeros aleatorios");
        stop = keyboard.nextInt();//Numero aleatorio hasta este indice.
        array1 = new double[size1];//Creacion del arreglo con el tamaño ingresado por el usuario.
    }

    /**
     * Representa el llenado del arreglo con los numeros reales aleatoriamente.
     */
    public void getnumbers() {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Math.ceil(Math.random() * stop);
            /*Numeros reales aleatorios en formato corto
             * multiplicandose por el limite de rango de numeros aleatorios.                                             
             */
        }
    }

    /**
     * Representa el ordenamiento del arreglo por metodo burbuja.
     */
    public void orderarray() {
        /*
         *El arreglo se ordena si el valor inicial es mayor
         * a el valor siguiente, en caso que se cumpla
         *  una variable auxiliar obtiene el valor mayor
         *  y en la posicion del mayor se coloca el valor menor
         * por ultimo el valor mayor es colocado donde estaba
         * el valor menor
         */
        for (int i = 0; i < size1 - 1; i++) {
            for (int j = 0; j < array1.length - 1; j++) {
                if (array1[j] > array1[j + 1]) {
                    temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Representa la impresion del arreglo ordenado de menos a mayores.
     */
    public void showarray() {

        for (int i = 0; i < size1; i++) {
            System.out.print("[" + array1[i] + "]" + " ");//imprime el vector.
        }

    }

}

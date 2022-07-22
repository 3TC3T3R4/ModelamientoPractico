package bubble;

/**
 * Esta clase representa el metodo de ordenamiento mas conocido como metodo
 * quicksort.
 *
 * @version 18.0.0 2022-07-20
 *
 * @author Estevan Tangarife Correa teban_1928@hotmail.com
 *
 * @since 18
 *
 */
import java.util.Scanner;

public class Quicksort {

    private double array[];
    private int size;
    private int stop;
    private double pivot;
    private int i;
    private double t;
    private double x;
    private int k;
    /**
     * Representa la instancia de la clase SCANNER.
     */
    Scanner keyboard = new Scanner(System.in);

    /**
     * Representa la obtencion del tamaño y tope de numeros aleatorios del
     * vector
     */
    public void Retursize() {
        System.out.println("Ingrese tamaño del vector");
        size = keyboard.nextInt();// valor del tamaño del vector.
        array = new double[size]; // creacion y asignacion del tamaño al vector.
        System.out.println("Ingrese el tope al azar del vector");
        stop = keyboard.nextInt();//valor limite del rango de numeros aleatorios.
    }

    /**
     * Representa el llenado del vector con numeros reales.
     *
     * @return vector de numeros aleatorios reales.
     */
    public double[] vectorfull() {
        /*
         *llenado del vector con numeros reales has completar su tamaño
         * redondeando los valores a su forma corta y con un rango especifico.
         */
        for (int j = 0; j < array.length; j++) {
            array[j] = Math.ceil(Math.random() * stop);
        }
        return array;
    }

    /**
     * Representa la divicion, obteniendo la posicion inicial.
     *
     * @param a arreglo con numeros reales.
     * @param start valor de inicio.
     * @param end valor de fin.
     * @return posicion inicial del arreglo.
     */
    public int partition(double a[], int start, int end) {
        pivot = a[end]; // Elemento pivote que iniciara en la posicion final del vector 
        i = (start - 1);
        for (int j = start; j <= end - 1; j++) {
            // Si el elemento actual es menor que el pivote  
            if (a[j] < pivot) {
                i++; //  indice de incremento del elemento mas pequeño 
                x = a[i];
                a[i] = a[j];
                a[j] = x;
            }
        }
        t = a[i + 1];
        a[i + 1] = a[end];
        a[end] = t;
        return (i + 1);
    }

    /**
     * Representa la comparacion entre el indice inicial y el final
     *
     * @param a arreglo de numeros
     * @param start posicion inicial del arreglo.
     * @param end posicion final el arreglo.
     */
    public void quick(double a[], int start, int end) {
        if (start < end) {
            int p = partition(a, start, end);
            quick(a, start, p - 1); //llamados al mismo metodo con direrentes argumentos.
            quick(a, p + 1, end);
        }
    }

    /**
     * Representa la impresion del arreglo ordenado.
     *
     * @param a vector ordenado
     *
     */
    public void printArr(double a[]) {
        for (k = 0; k < a.length; k++) {
            System.out.print("[" + a[k] + "]" + " ");//Imprime el vector has completar su tamaño.
        }
    }

}

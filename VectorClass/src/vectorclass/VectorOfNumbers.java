package vectorclass;

/**
 * Esta clase tiene como objetivo crear vectores y como se comportan.
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
import java.util.Vector;

public class VectorOfNumbers {

    private boolean flag = true;
    private int number;
    private int count = 0;
    private int i = 0;

    /**
     * Se crea instancia de la clase Scanner.
     */
    Scanner keyboard = new Scanner(System.in);
    /**
     * Se crea instancia de la clase vector.
     */
    Vector Vector = new Vector(); /*la clase esta obsoleta, 
                                   *preferiblemente se usa Arraylist
                                   *pero el programa se ejecuta normalmente
                                   *ya que esta obsoleta mas no funcional.
                                   */
    /**
     *Representa un vector donde se almacenan numeros
     * el cual se detendra a ingresar dos veces el mismo numero
     */
    public void getnumbers() {
        do {                    //Preterminadamente comienza el ciclo obteniendo los numeros
            if (count == 0) { //contador el cual direccionara siempre al else
                count += 1;
                System.out.println("Ingrese numero");
                number = keyboard.nextInt();
                Vector.add(number);
                System.out.println("Ingrese numero");
                number = keyboard.nextInt();
                Vector.add(number); //con el metodo add se agrega al vector los numeros.
               /*
                *Si el numero en la posicion actual es igual al de la posicion proxima finaliza el programa.
                */
                if (Vector.get(i) == Vector.get(i + 1)) { // validador de numeros
                    flag = false; // bandera encargada de detener el programa.
                }
                i++; // se aumenta el indice para validar todas las posiciones.
            } else {
                /*
                 *Despues de la primer interacion siempre ingresara al else
                 * ya que la idea es que el usuario ingrese 1 numero se valide
                 * con el numero colocado en la iteracion 1
                 * 
                 */
                System.out.println("Ingrese numero");
                number = keyboard.nextInt();
                Vector.add(number);
                if (Vector.get(i) == Vector.get(i + 1)) {
                    flag = false;
                    System.out.println("INGRESASTE DOS NUMEROS IGUALES SEGUIDAMENTE");
                }
                i++;
            }
        } while (flag);
        System.out.println("");
        System.out.println("NUMEROS INGRESADOS EN EL VECTOR");
        for (int j = 0; j < Vector.size(); j++) { // se encarga de imprimir por consola los numero cuando finaliza el programa.

            System.out.print("[" + Vector.get(j) + "]");
        }
    }
}

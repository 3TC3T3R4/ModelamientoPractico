package vehicle;

/**
 * Esta clase representa una agencia autorizada de distribuir
 * vehiculos.
 *
 * @version 18.0.0 2022-07-20
 *
 * @author Estevan Tangarife Correa teban_1928@hotmail.com
 *
 * @since 18
 *
 */
import java.util.ArrayList;
import java.util.List;

public class AuthorizedDealer {

    public static void main(String[] args) {
        /**
         * Creacion de instancia de la clase List de tipo de dato vehiculo.
         */
        List<Vehicle> listvehicles = new ArrayList<>();
        /**
         * Representa la creacion de instancias de la clase vehiculo.
         */
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        Vehicle v3 = new Vehicle();
        Vehicle v4 = new Vehicle();
        Vehicle v5 = new Vehicle();
        Vehicle v6 = new Vehicle();
        Vehicle v7 = new Vehicle();
        Vehicle v8 = new Vehicle();
        Vehicle v9 = new Vehicle();
        Vehicle v10 = new Vehicle();
        /**
         * Representa la instancia la cual ejecuta un metodo de su clase.
         */
        v1.createvehicle();
        v2.createvehicle();
        v3.createvehicle();
        v4.createvehicle();
        v5.createvehicle();
        v6.createvehicle();
        v7.createvehicle();
        v8.createvehicle();
        v9.createvehicle();
        v10.createvehicle();
        /**
         * Representa el almacenamiento de vehiculos en una lista de coleccion
         * de vehiculos.
         */
        listvehicles.add(v1); //El metodo add almacena todo el objeto vehiculo en una posicion de la lista.
        listvehicles.add(v2);
        listvehicles.add(v3);
        listvehicles.add(v4);
        listvehicles.add(v5);
        listvehicles.add(v6);
        listvehicles.add(v7);
        listvehicles.add(v8);
        listvehicles.add(v9);
        listvehicles.add(v10);

        System.out.println("");

        /*
         *Representa un ciclo el cual muesta la coleccion de objetos
         * los cuales se imprimen validando si conlleva o no tripulacion.
         */
        for (Vehicle vehiculo : listvehicles) {
            if (vehiculo.isCrew()) {
                System.out.println("El vehiculo tiene " + vehiculo.getNumberpasseger() + " pasajeros  y cuenta con tripulacion"
                        + ", tiene " + vehiculo.getNumberofwheels() + " ruedas y su fecha de matriculacion fue el " + vehiculo.getDateofregistration()
                        + " y se desplaza por " + vehiculo.getGetaround());
            } else if (vehiculo.isCrew() == false) {
                System.out.println("El vehiculo tiene " + vehiculo.getNumberpasseger() + " pasajeros  y no tiene tripulacion"
                        + ", tiene " + vehiculo.getNumberofwheels() + " ruedas y su fecha de matriculacion fue el " + vehiculo.getDateofregistration()
                        + " y se desplaza por " + vehiculo.getGetaround());
            }
        }
    }
}

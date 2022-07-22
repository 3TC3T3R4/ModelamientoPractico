package vehicle;

/**
 * Esta clase representa una agencia autorizada de distribuir diferentes
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
         * Representa la instanciacion de una colecion de tipo vehiculos.
         */
        List<Vehicle> listvehicles = new ArrayList<>();
        /**
         * Representa a la instanciacion de 3 vehiculos de la clase carro.
         */
        Car v1 = new Car();
        Car v2 = new Car();
        Car v3 = new Car();
        /**
         * Representa a la instanciacion de dos vehiculos de la clase bote.
         */
        Boat v4 = new Boat();
        Boat v9 = new Boat();
        /**
         * Representa a la instanciacion de dos motocicletas.
         */
        Motocycle v5 = new Motocycle();
        Motocycle v6 = new Motocycle();
        /**
         * Representa la instanciacion de nos bicicletas.
         */
        Bike v7 = new Bike();
        Bike v8 = new Bike();
        /**
         * Representa a la instanciacion de un camion.
         */
        Truck v10 = new Truck();

        /**
         * Representa a la creacion de diferentes tipos de vehiculos.
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
         * Representa el almacenamiento de vehiculos en una colecion de objetos.
         */
        listvehicles.add(v1);// el metodo add ingrese en la posicion todo el objeto de tipo vehiculo.
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

package vehicle;

/**
 * Esta clase la creacion de un vehiculo con sus caracteristicas.
 *
 * @version 18.0.0 2022-07-20
 *
 * @author Estevan Tangarife Correa teban_1928@hotmail.com
 *
 * @since 18
 *
 */
import java.util.Scanner;

public class Vehicle {

    private int numberpasseger;
    private boolean crew;
    private int numberofwheels;
    private String dateofregistration;
    private String getaround;
    private int option;
    /**
     * Creacion de instancia de la clase Scanner.
     */
    Scanner keyboard = new Scanner(System.in);

    /**
     * Representa la contrucion de un objeto de la clase.
     */
    public Vehicle() {

    }

    /**
     * Representa el encendido del vehiculo.
     */
    public void poweron() {
        System.out.println("Encendido.");
    }

    /**
     * Representa apagar el vehiculo.
     */
    public void poweroff() {
        System.out.println("Stopp good bye");
    }

    /**
     * Representa como suena el clazon de un vehiculo.
     */
    public void honk() {
        System.out.println("PEEE PEEE");
    }

    /**
     * Representa el retorno del numero de pasajeros.
     *
     * @return numero de pasajeros que contiene el vehiculo.
     */
    public int getNumberpasseger() {
        return numberpasseger;
    }

    /**
     * Representa la modificacion de la cantidad de numeros de pasajeros.
     *
     * @param numberpasseger
     */
    public void setNumberpasseger(int numberpasseger) {
        this.numberpasseger = numberpasseger;
    }

    /**
     * Representa el retorno de la tripulacion de un vehiculo en caso que
     * aplique.
     *
     * @return Si contiene o no tripulacion.
     */
    public boolean isCrew() {
        return crew;
    }

    /**
     * Representa la modificacion de la tripulacion de un vehiculo.
     *
     * @param crew si existe o no tripulacion.
     */
    public void setCrew(boolean crew) {
        this.crew = crew;
    }

    /**
     * Representa el retorno del numero de ruedas que tiene un vehiculo.
     *
     * @return numero de ruedas.
     */
    public int getNumberofwheels() {
        return numberofwheels;
    }

    /**
     * Represemta la modificacion del numero de ruedas de un vehiculo.
     *
     * @param numberofwheels numero de ruedas que conlleva un vehiculo.
     */
    public void setNumberofwheels(int numberofwheels) {
        this.numberofwheels = numberofwheels;
    }

    /**
     * Representa el retorno de la fecha de matriculacion del vehiculo.
     *
     * @return fecha de matriculacion.
     */
    public String getDateofregistration() {
        return dateofregistration;
    }

    /**
     * Representa la modificacion del día de matriculacion.
     *
     * @param dateofregistration fecha matriculacion.
     */
    public void setDateofregistration(String dateofregistration) {
        this.dateofregistration = dateofregistration;
    }

    /**
     * Representa el retorno de como se desplaza un vehiculo.
     *
     * @return como se desplaza un vehiculo.
     */
    public String getGetaround() {
        return getaround;
    }

    /**
     * Representa la modificacion de como se desplaza un vehiculo.
     *
     * @param getaround medio de desplazamiento.
     */
    public void setGetaround(String getaround) {
        this.getaround = getaround;
    }

    /**
     * Representa el modelamiento y creacion de un vehiculo con sus
     * caracteriscas
     */
    public void createvehicle() {
        System.out.println("Ingrese el numero de pasageros");
        numberpasseger = keyboard.nextInt();
        System.out.println("Tiene tripulacion el vehiculo?\n 1. SI \n 2. NO");
        option = keyboard.nextInt();
        switch (option) {// Swicth encargado de asignar o no, tripulacion a un vehiculo.
            case 1:
                crew = true;
                break;
            case 2:
                crew = false;
                break;
            default:
                System.out.println("ingrese una opcion valida");
        }

        /*
         *Ensamble de caracteristicas distintivas de un vehiculo
         * moldeadas por el usuario.
         */
        System.out.println("Ingrese numero de ruedas");
        numberofwheels = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("ingrese la fecha de su matriculacion \n 'dd/MM/yyyy' ");
        dateofregistration = keyboard.nextLine();
        System.out.println("ingrese medio por el que se desplaza");
        getaround = keyboard.nextLine();
    }
}

package vehicle;

/**
 * Esta clase representa un camion con sus respectivos elementos.
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

public abstract class Vehicle {

    /**
     * Representa la desicion escojida por el usuario si contiene un vehiculo
     * tripulacion.
     */
    public int option;

    /**
     * Representa el numero de pasajeros del vehiculo.
     */
    protected int numberpasseger;
    /**
     * Representa la tripulacion del vehiculo.
     */
    protected boolean crew;
    /**
     * Representa el numero de ruedas de un vehiculo.
     */
    protected int numberofwheels;
    /**
     * Representa la fecha de matriculacion del vehiculo.
     */
    protected String dateofregistration;
    /**
     * Representa como se desplaza un vehiculo.
     */
    protected String getaround;

    /**
     * Creacion de instancia de la clase Scanner.
     */
    Scanner keyboard = new Scanner(System.in);

    /**
     * Representa la construccion de un vehiculo al instanciarse.
     */
    public Vehicle() {

    }

    /**
     * Representa la construccion de un vehiculo al instanciarse con sus
     * elementos.
     *
     * @param numberpasseger numero de pasajeros que contiene un vehiculo.
     * @param crew si contiene o no tripulacion.
     * @param numberofwheels numero de ruedas del vehiculo.
     * @param dateofregistration fecha de matriculacion del vehiculo.
     * @param getaround modo en el que desplaza el vehiculo.
     */
    public Vehicle(int numberpasseger, boolean crew, int numberofwheels, String dateofregistration, String getaround) {
        this.numberpasseger = numberpasseger;
        this.crew = crew;
        this.numberofwheels = numberofwheels;
        this.dateofregistration = dateofregistration;
        this.getaround = getaround;
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
     * Representa como enciende un vehiculo.
     */
    protected abstract void poweron();

    /**
     * Representa como se apaga un vehiculo.
     */
    protected abstract void poweroff();
    /**
     * Representa como sonar el clazon de un vehiculo o pitar(Coloquialmente)
     */
    protected abstract void honk();

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

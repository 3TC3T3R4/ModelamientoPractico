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
public class Truck extends Vehicle {

    private float capacity;

    /**
     * Representa la construccion de un camion al intanciarse.
     */
    public Truck() {
    }

    /**
     * Representa la construccion de un camion al instanciarse con su capacidad
     * de carga.
     *
     * @param capacity carga en kg.
     */
    public Truck(float capacity) {
        this.capacity = capacity;
    }

    /**
     * Representa el retorno de la capacidad de carga.
     *
     * @return carga en kg.
     */
    public float getCapacity() {
        return capacity;
    }

    /**
     * Representa la modificacion de la capacidad de carga.
     *
     * @param capacity carga en kg.
     */
    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    /**
     * Representa como enciende un camion.
     */
    @Override
    protected void poweron() {
        System.out.println("Encender motor.");
    }

    /**
     * Representa como apagar un camion.
     */
    @Override
    protected void poweroff() {
        System.out.println("Apagando motor.");
    }

    /**
     * Representa como sonar el clazon de un camion.
     */
    @Override
    protected void honk() {
        System.out.println("trucc trucc");
    }
}

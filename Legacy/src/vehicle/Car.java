package vehicle;

/**
 * Esta clase representa carro con sus respectivos elementos.
 *
 *
 * @version 18.0.0 2022-07-20
 *
 * @author Estevan Tangarife Correa teban_1928@hotmail.com
 *
 * @since 18
 *
 */
public class Car extends Vehicle {

    private boolean electric;

    /**
     * Representa la construccion de un carro con su motor electrico.
     *
     * @param electric carro electrico .
     */
    public Car(boolean electric) {
        this.electric = electric;
    }

    /**
     * Representa la construccion de un carro al instanciarlo.
     */
    public Car() {
    }

    /**
     * Representa el retorno si es electrico el carro.
     *
     * @return verificador motor electrico.
     */
    public boolean Electric() {
        return electric;
    }

    /**
     * Representa la modificacion de un vehiculo si es electrico o no.
     *
     * @param electric validador de motor electrico.
     */
    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    /**
     * Representa como enciende un carro.
     */
    @Override
    protected void poweron() {
        System.out.println("soy el carro, encender");
    }

    /**
     * Representa como apagar un carro.
     */
    @Override
    protected void poweroff() {
        System.out.println("soy el carro, apagando motor.");
    }

    /**
     * Representa como hacer sonar el clazon de un carro.
     */
    @Override
    protected void honk() {
        System.out.println(" peee peee");
    }
}

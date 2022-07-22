package vehicle;

/**
 * Esta clase representa una motocicleta con sus respectivos elementos.
 *
 *
 * @version 18.0.0 2022-07-20
 *
 * @author Estevan Tangarife Correa teban_1928@hotmail.com
 *
 * @since 18
 *
 */
public class Motocycle extends Vehicle {

    private boolean automatic;

    /**
     * Representa la construcion al instanciar con su motor automatico.
     *
     * @param automatic
     */
    public Motocycle(boolean automatic) {
        this.automatic = automatic;
    }

    /**
     * Representa la construccion al instanciarla.
     */
    public Motocycle() {
    }

    /**
     * Representa el retorno si es automatico el vehiculo.
     *
     * @return es automatico o no.
     */
    public boolean isAutomatic() {
        return automatic;
    }

    /**
     * Representa la modificacion si es automatico el vehiculo.
     *
     * @param automatic es o no automatico.
     */
    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    /**
     * Representa como se enciende una motocicleta.
     */
    @Override
    protected void poweron() {
        System.out.println("Soy la moto, encender motor.");
    }

    /**
     * Representa como se apaga el motor de una motocicleta.
     */
    @Override
    protected void poweroff() {
        System.out.println("Apagar motor.");
    }

    /**
     * Representa como suena el clazon de una moto.
     */
    @Override
    protected void honk() {
        System.out.println("pet pet");
    }
}

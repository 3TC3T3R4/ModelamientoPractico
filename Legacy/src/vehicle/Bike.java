package vehicle;

/**
 * Esta clase representa una bicicleta con sus respectivos elementos.
 *
 *
 * @version 18.0.0 2022-07-20
 *
 * @author Estevan Tangarife Correa teban_1928@hotmail.com
 *
 * @since 18
 *
 */
public class Bike extends Vehicle {

    private String type;

    /**
     * Representa la construccion de un bicicleta al instanciarla.
     */
    public Bike() {
    }

    /**
     * Representa la construccion de un bicicleta al instanciarla espicificando
     * su tipo.
     *
     * @param type tipo de bicicleta (bmx,pista,cross).
     */
    public Bike(String type) {
        this.type = type;
    }

    /**
     * Representa el retorno del tipo de bicicleta
     *
     * @return tipo de bicicleta (bmx,pista,cross).
     */
    public String Type() {
        return type;
    }

    /**
     * Representa la modificacion del tipo de bicicleta
     *
     * @param type tipo de bicicleta (bmx,pista,cross).
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Representa como enciende una bicicleta.
     */
    @Override
    protected void poweron() {
        System.out.println("Soy electrico, encendiendo motor");
    }

    /**
     * Representa como apagar una bicicleta.
     */
    @Override
    protected void poweroff() {
        System.out.println("Soy electrica, cortando corriente.");
    }

    /**
     * Representa como suena el clazon de una bicicleta.
     */
    @Override
    protected void honk() {
        System.out.println("PEEE PEEE");

    }

}

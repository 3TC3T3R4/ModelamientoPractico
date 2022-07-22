package vehicle;

/**
 * Esta clase representa un bote con sus respectivos elementos.
 *
 *
 * @version 18.0.0 2022-07-20
 *
 * @author Estevan Tangarife Correa teban_1928@hotmail.com
 *
 * @since 18
 *
 */
public class Boat extends Vehicle {

    private float weight;

    /**
     * Representa la construccion de un bote al instanciarse.
     */
    public Boat() {
    }

    /**
     * Representa la construccion de un bote al instanciarse con su peso.
     *
     * @param weight peso en kg del bote.
     */
    public Boat(float weight) {
        this.weight = weight;
    }

    /**
     * Representa el retorno del peso de un bote.
     *
     * @return peso en kg de un bote.
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Representa la modificacion del peso de un bote.
     *
     * @param weight peso en kg de un bote.
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Representa la manera de encender de un bote.
     */
    @Override
    protected void poweron() {
        System.out.println("Soy el bote, encender");
    }

    /**
     * Representa la manera en que se apaga el bote.
     */
    @Override
    protected void poweroff() {
        System.out.println("Apagando motor del bote");
    }

    /**
     * Representa como suena el clazon de un bote.
     */
    @Override
    protected void honk() {
        System.out.println("puf puf");
    }
}

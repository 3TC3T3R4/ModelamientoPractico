package solarsystem;

/**
 * Esta clase tiene como objetivo crear el planeta Venus y como se comporta este
 * cuerpo celeste.
 *
 *
 * @version 18.0.0 2022-07-20
 *
 * @author Estevan Tangarife Correa teban_1928@hotmail.com
 *
 * @since 18
 *
 */
public class Venus extends Planet {

    /**
     * Representa la creacion de Venus.
     */
    public Venus() {
    }

    /**
     * Representa la creacion de Venus recibiendo dos datos especificos.
     *
     * @param mass
     * @param name
     */
    public Venus(double mass, String name) {
        this.mass = mass;
        this.name = name;

    }

    /**
     * Representa el retorno de la masa de Venus
     *
     * @return masa del cuerpo.
     */
    public double Mass() {
        return mass;
    }

    /**
     * Representa el retorno del nombre del planeta.
     *
     * @return nombre del cuerpo.
     */
    public String Name() {
        return name;
    }

    /**
     * Representa la modificacion del nombre del planeta.
     *
     * @param name nombre del cuerpo.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Representa la modificacion de la masa de Venus.
     *
     * @param mass masa del cuerpo.
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * Representa la traslacion de Venus.
     */
    @Override
    protected void traslation() {
        System.out.println("Hola soy Venus y mi traslacion es cada 8 anios");
    }

}

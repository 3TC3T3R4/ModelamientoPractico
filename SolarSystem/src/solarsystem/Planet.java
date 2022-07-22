package solarsystem;

/**
 * Esta clase contiene como objetivo crear cuerpos celestes que orbitan en el
 * sistema solar.
 *
 * @version 18.0.0 2022-07-20
 *
 * @author Estevan Tangarife Correa teban_1928@hotmail.com
 *
 * @since 18
 *
 */
public abstract class Planet {

    /**
     * Representa la masa en Kg del planeta.
     */
    protected double mass;

    /**
     * Representa la densidad del planeta.
     */
    protected long density;

    /**
     * Representa el diametro del planeta.
     */
    protected long diameter;

    /**
     * Representa la distancia en KM del planeta al sol.
     */
    protected long distance;

    /**
     * Representa el identidicador unico del planeta.
     */
    protected int identifying;

    /**
     * Representa el nombre distintivo del planeta.
     */
    protected String name;

    /**
     * Representa la creacion de instancia de la clase sin argumentos.
     */
    public Planet() {
    }

    /**
     * Representa la creacion de instancia de la clase.
     *
     * @param mass masa del cuerpo celeste.
     * @param density densidad del cuerpo celeste.
     * @param diameter diametro del cuerpo celeste.
     * @param distance distancia del cuerpo celeste.
     * @param identifying identificador del cuerpo celeste.
     * @param name nombre del cuerpo celeste.
     */
    public Planet(long mass, long density, long diameter, long distance, int identifying, String name) {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distance = distance;
        this.identifying = identifying;
        this.name = name;
    }

    /**
     * Representa la traslacion de un cuerpo celeste.
     */
    protected abstract void traslation();

}

package solarsystem;

/**
 * Esta clase tiene como objetivo crear el planeta Marte y como se comporta este
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
import java.util.Objects;

public class Mars extends Planet {

    /**
     * Representa la creacion de la instancia del planeta Marte.
     *
     * @param mass masa del cuerpo.
     * @param density densidad del cuerpo.
     * @param diameter diametro del cuerpo.
     * @param distance distancia del cuerpo.
     * @param identifying identificador del cuerpo.
     * @param name nombre del cuerpo.
     */
    public Mars(long mass, long density, long diameter, long distance, int identifying, String name) {

        this.mass = Objects.requireNonNull(mass);
        this.density = Objects.requireNonNull(density);
        this.diameter = Objects.requireNonNull(diameter);
        this.distance = Objects.requireNonNull(distance);
        this.identifying = Objects.requireNonNull(identifying);
        this.name = Objects.requireNonNull(name);

    }

    /**
     * Representa creacion del planeta Marte recibiendo la masa.
     *
     * @param mass masa de marte.
     */
    public Mars(double mass) {
        this.mass = mass;
    }

    /**
     * Representa la creacion del planeta Marte.
     */
    public Mars() {
    }

    /**
     * Representa el retorno de la masa de Marte.
     *
     * @return masa en Kg de Marte.
     */
    public double Mass() {
        return mass;
    }

    /**
     * Representa la modificacion de la masa de Marte.
     *
     * @param mass Masa de Marte.
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * Representa el retorno de la densidad de Marte.
     *
     * @return densidad del cuerpo.
     */
    public double Density() {
        return density;
    }

    /**
     * Representa la modificacion de la densidad de Marte.
     *
     * @param density densidad del cuerpo.
     */
    public void setDensity(long density) {
        this.density = density;
    }

    /**
     * Representa el retorno de el diametro de Marte.
     *
     * @return diametro del cuerpo.
     */
    public double Diameter() {
        return diameter;
    }

    /**
     * Representa la modificacion del diametro de Marte.
     *
     * @param diameter diametro del cuerpo.
     */
    public void setDiameter(long diameter) {
        this.diameter = diameter;
    }

    /**
     * Representa el retorno del nombre del planeta.
     *
     * @return el nombre Marte.
     */
    public String Name() {
        return name;
    }

    /**
     * Representa el modificador del Nombre del planeta.
     *
     * @param name nombre del planeta.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Representa la traslacion de Marte
     */
    @Override
    protected void traslation() {
        System.out.println("Hola soy Marte y mi traslacion es cada 3 anios");
    }

}

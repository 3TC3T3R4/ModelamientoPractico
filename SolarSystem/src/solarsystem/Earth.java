package solarsystem;

/**
 * Esta clase tiene como objetivo crear el planeta tierra y como se comporta
 * este cuerpo celeste.
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

public class Earth extends Planet {

    private double squareddistance;
    private double atractiongravitation;

    /**
     * Representa la creacion del planeta tierra sin recibir datos.
     */
    public Earth() {
    }

    /**
     * Representa la creacion del planeta tierra recibiendo la masa.
     *
     * @param mass masa del cuerpo celeste.
     */
    public Earth(double mass) {
        this.mass = mass;
    }

    /**
     * Representa la creacion de la instancia del planeta tierra recibiendo
     * datos.
     *
     * @param mass masa del cuerpo celeste.
     * @param density densidad del cuerpo.
     * @param diameter diametro del cuerpo.
     * @param distance distancia del cuerpo.
     * @param identifying identificador del cuerpo.
     * @param name nombre del cuerpo.
     */
    public Earth(long mass, long density, long diameter, long distance, int identifying, String name) {

        this.mass = Objects.requireNonNull(mass);
        this.density = Objects.requireNonNull(density);
        this.diameter = Objects.requireNonNull(diameter);
        this.distance = Objects.requireNonNull(distance);
        this.identifying = Objects.requireNonNull(identifying);
        this.name = Objects.requireNonNull(name);
        

    }

    /**
     * Representa el retorno de la masa de la tierra.
     *
     * @return masa del cuerpo.
     */
    public double Mass() {
        return mass;
    }

    /**
     * Representa la modificacion de la masa del planeta tierra.
     *
     * @param mass masa de la tierra.
     */
    public void setMass(long mass) {
        this.mass = mass;
    }

    /**
     * Representa la traslacion del planeta tierra.
     */
    @Override
    protected void traslation() {
        System.out.println("Hola, soy la tierra y mi traslacion es cada año");
    }

    /**
     * Representa la atraccion de la tierra y el planeta marte.
     *
     * @param mass1Mars masa en Kg de marte.
     * @param mass2Earth masa en Kg de la tierra.
     * @param g constante gravitacional.
     */
    public void attraction(double mass1Mars, double mass2Earth, double g) {

        squareddistance = 6.13089E21;//Distancia al cuadrado de  marte a la tierra.
        atractiongravitation = g * ((mass1Mars * mass2Earth) / (squareddistance));//Formula de atraccion gravitacional de dos cuerpos.
        System.out.println("La atraccion gravitacional de marte y la tierra es de: " + atractiongravitation);

    }

    /**
     * Representa la atraccion entre el planeta tierra y marte.
     *
     * @param mass1Ven masa en Kg del planeta Venus.
     * @param mass2Earth masa en Kg de la tierra.
     * @param g constante grativacional.
     * @param n nombre del planeta el cual se atrae con la tierra.
     */
    public void attraction(double mass1Ven, double mass2Earth, double g, String n) {
        squareddistance = 1.6E21;
        double atractiongravitation = g * ((mass1Ven * mass2Earth) / (squareddistance));
        System.out.println("La atraccion gravitacional de " + n + " y la tierra es de: " + atractiongravitation);
    }
}

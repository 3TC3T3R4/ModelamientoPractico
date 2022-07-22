package solarsystem;

/**
 * Esta clase tiene como objetivo crear planetas y poder obtener su atraccion
 * entre estos.
 *
 *
 * @version 18.0.0 2022-07-20
 *
 * @author Estevan Tangarife Correa teban_1928@hotmail.com
 *
 * @since 18
 *
 */
public class SolarSystem {

    public static void main(String[] args) {

        /**
         * Representa la masa de marte en numero un numero decimal.
         */
        double Marsmass = 6.40 * (Math.pow(10, 23));

        /**
         * Representa la masa del Planeta Tierra en decimal.
         */
        double Earthmass = 5.98 * (Math.pow(10, 24));

        /**
         * Representa la masa de Venus en un numero decimal.
         */
        double Venusmass = 4.83 * (Math.pow(10, 24));

        /**
         * Representa la constante gravitacional en un numero decimal.
         */
        double constantgravitational = 6.67 * (Math.pow(10, -11));

        /**
         * Representa la instanciacion de la clase Marte.
         */
        Mars m = new Mars(Marsmass);

        /**
         * Representa la instanciacion de la clase Tierra.
         */
        Earth e = new Earth(Earthmass);

        /**
         * Representa la instanciacion de la clase Venus.
         */
        Venus v = new Venus(Venusmass, "Venus");

        e.attraction(m.Mass(), e.Mass(), constantgravitational);

        e.attraction(v.Mass(), e.Mass(), constantgravitational, v.Name());

    }

}

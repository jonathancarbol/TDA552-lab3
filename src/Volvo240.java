import java.awt.*;

/** The Volvo240 is a subclass to Car and excluding the methods from car implements another method
 * for speedFactor which takes into account some Volvo240 specific characteristics.
 */

public class Volvo240 extends Car{

    private final static double trimFactor = 1.25;

    //public Volvo240() {super(4, 100, Color.black, "Volvo240");}


    public Volvo240() {
        super(100, Color.black, "Volvo240", 4,2500);
    }

    /**
     * Calculates the Volvo240 specific speedFactor.
     * @return speedFactor
     */
    @Override
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

}

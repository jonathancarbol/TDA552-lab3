import java.awt.*;

/** The Saab95 class is a subclass to Car which excluding the methods implemented by car, includes a separate
 *  method for speedFactor which takes into account an specific Saab95, characteristics, as well as methods
 *  for turning the turbo on and off.
 */

public class Saab95 extends Car{

    private static boolean turboOn;

    public Saab95() {
        super(125, Color.red, "Saab95", 2, 2000);
        this.turboOn = false;
    }

    /**
     * Method which sets the turboOn to true.
     */

    public void setTurboOn(){
        turboOn = true;
    }

    /**
     * Method which sets the turboOn to false.
     */
    public void setTurboOff(){
        turboOn = false;
    }

    /**
     * Checks the value of turboOn.
     * @return turboOn
     */
    public static boolean isTurboOn() {
        return turboOn;
    }


    /**
     * Calculates the Saab95 specific speedFactor.
     * @return speedFactor
     */
    @Override
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

}
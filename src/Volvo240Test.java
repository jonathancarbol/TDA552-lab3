import org.junit.Test;

import static org.junit.Assert.*;

/** Different test methods with 100% coverage for Volvo240 specific methods.
 * All other methods are tested in Car.
 */

public class Volvo240Test {

    Volvo240 v = new Volvo240();

    @Test
    public void speedFactor() {
        assertEquals(1.25, v.speedFactor(), 0.01);
    }
}
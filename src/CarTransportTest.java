import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Test methods for the CarTransport class.
 */
public class CarTransportTest {

    CarTransport c = new Ferry(200, Color.BLACK, "TestCarTransport",6,3000);

    @Test
    public void loadCar() {
        Saab95 s = new Saab95();
        c.getRamp().setRampUp(false);
        c.loadCar(s);
        assertEquals(s,c.getCarsLoaded().get(0));
    }

    @Test
    public void move() {
        Saab95 s = new Saab95();
        c.getRamp().setRampUp(false);
        c.loadCar(s);

        c.getRamp().setRampUp(true);
        c.startEngine();
        c.gas(0.9);
        c.move();
        assertEquals(0,c.getPosition().x);
        assertEquals(1,c.getPosition().y);

        assertEquals(0,s.getPosition().x);
        assertEquals(1,s.getPosition().y);
    }

}
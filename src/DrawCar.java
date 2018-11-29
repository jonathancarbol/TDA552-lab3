import java.awt.*;
import java.awt.image.BufferedImage;

public class DrawCar {

    private BufferedImage b;
    private Point p;
    private String name;

    public DrawCar(BufferedImage b, Point p, String name) {
        this.b = b;
        this.p = p;
        this.name = name;
    }

    public BufferedImage getB() {
        return b;
    }

    public void setB(BufferedImage b) {
        this.b = b;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

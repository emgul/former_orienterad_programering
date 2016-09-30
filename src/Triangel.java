import java.awt.*;
/**
 * Created by heem14 on 2016-09-30.
 */
public class Triangel {
    private Color col;
    private double height;
    private double width;

    public Triangel (Color col , double width, double height){
    this.col = col;
    this.width = width;
    this.height = height;
    }

    public double getArea() {
        return (width*height)/2;
    }
    public double getomkrets() {
        return (height*2)+width;
    }

    public Color getCol() {
        return col;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}

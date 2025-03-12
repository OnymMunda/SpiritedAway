/**
This is a template for a Java file.
@author Jose Ramon William T. Munda III (224401)
@version March 9, 2023
**/
/*
 * This class creates the roof shape as seen on top of the train.
 * It is composed of rectangles, round rectangles, lines, and bezier curves
 * in order to create the whole shape.
 */
/*
I have not discussed the Java language code in my program 
with anyone other than my instructor or the teaching assistants 
assigned to this course.
I have not used Java language code obtained from another student, 
or any other unauthorized source, either modified or unmodified.
If any Java language code or documentation used in my program 
was obtained from another source, such as a textbook or website, 
that has been clearly noted with a proper citation in the comments 
of my program.
*/
import java.awt.*;
import java.awt.geom.*;

public class Roof implements DrawingObject {
    private double x;
    private double y;
    private double width;
    private double height;
    private Color color;
    private Rectangle roof;
    private RoundRectangle roofTop;
    private RoundRectangle roofTop2;
    private RoundRectangle roofTop3;
    private RoundRectangle roofFrontUpper;

    /**
     * @param x
     * @param y
     * @param width
     * @param height
     * @param color
     */
    public Roof(double x, double y, double width, double height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    /*
     * this method draws the roof which is a composite
     * shape made from rectangles, round rectangles, lines, and
     * bezier curves
     */
    @Override
    public void draw(Graphics2D g2d){
        roof = new Rectangle(x, y, width, height, color);
        roof.draw(g2d);

        roofTop = new RoundRectangle(381.86, 297.95, 62.15, 30, 20, 50, SceneCanvas.Maroon);
        roofTop.draw(g2d);

        roofTop2 = new RoundRectangle(524.82, 290.95, 227.39, 30, 40, 50, SceneCanvas.Maroon);
        roofTop2.draw(g2d);

        roofTop3 = new RoundRectangle(874.53, 300.8, 65.47, 30, 40, 10, SceneCanvas.Maroon);
        roofTop3.draw(g2d);

        Path2D roofFrontLower = new Path2D.Double();
        roofFrontLower.moveTo(232, 341.99);
        roofFrontLower.curveTo(192.9, 345.9, 242.9, 298.3, 279.1, 331.9);
        g2d.setColor(SceneCanvas.Maroon);
        g2d.fill(roofFrontLower);

        roofFrontUpper = new RoundRectangle(221.11, 303.45, 47.84, 20, 20, 20, SceneCanvas.Maroon);
        roofFrontUpper.draw(g2d);

    }
}

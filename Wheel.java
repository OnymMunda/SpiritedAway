/**
This is a template for a Java file.
@author Jose Ramon William T. Munda III (224401)
@version March 9, 2023
**/
/*
 * This class creates a wheel. It is made from 2 different
 * round rectangles to achieve the whole shape.
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

public class Wheel implements DrawingObject {
    private double x;
    private double y;
    private RoundRectangle wheel;

    /**
     * @param x refers to the x starting point of the wheel
     * @param y refers to the y starting point of the wheel
     */
    public Wheel(double x, double y){
        this.x = x;
        this.y = y;
    }

    /*
     * this method draws the wheel with the
     * different shape components
     */
    @Override
    public void draw(Graphics2D g2d){
        wheel = new RoundRectangle(x, y, 82.01, 45.96, 30, 30, Color.GRAY);
        wheel.draw(g2d);

        RoundRectangle2D wheelOutline = new RoundRectangle2D.Double(x+5.73, y+5.68, 70.37, 33.78, 30, 30);
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.setStroke(new BasicStroke(4)); // Class BasicStroke. BasicStroke (Java Platform SE 7 ). (2020, June 24). Retrieved March 6, 2023, from https://docs.oracle.com/javase/7/docs/api/java/awt/BasicStroke.html
        g2d.draw(wheelOutline);
    }
}

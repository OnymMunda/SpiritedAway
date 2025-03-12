/**
This is a template for a Java file.
@author Jose Ramon William T. Munda III (224401)
@version March 9, 2023
**/
/*
 * This class creates a circle shape using the given parameters.
 * The circle is a basic shape used in the different classes.
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

public class Circle implements DrawingObject {

    private double x;
    private double y;
    private double size;
    private Color color;
    
    /**
     * @param x refers to the x starting point of the circle
     * @param y refers to the y starting point of the circle
     * @param size refers to the diameter of the circle
     * @param color refers to the color of the circle
     */
    public Circle(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    /*
     * this method draws the circle
     */
    @Override
    public void draw(Graphics2D g2d){
        Ellipse2D c = new Ellipse2D.Double(x,y,size,size);
        g2d.setColor(color);
        g2d.fill(c);
    }
}

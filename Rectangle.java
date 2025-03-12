/**
This is a template for a Java file.
@author Jose Ramon William T. Munda III (224401)
@version March 9, 2023
**/
/*
 * This class creates a rectangle shape using the given parameters.
 * The rectangle is a basic shape used in the different classes.
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

public class Rectangle implements DrawingObject {
    private double x;
    private double y;
    private double width;
    private double height;
    private Color color;

    /**
     * @param x refers to the x starting point of the rectangle
     * @param y refers to the y starting point of the rectangle 
     * @param width refers to how long the rectangle is
     * @param height refers to how tall the rectangle is
     * @param color refers to the color of the rectangle
     */
    public Rectangle(double x, double y, double width, double height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    /*
     * this method draws the rectangle
     */
    @Override
    public void draw(Graphics2D g2d){
        Rectangle2D r = new Rectangle2D.Double(x,y,width,height);
        g2d.setColor(color);
        g2d.fill(r);
    }
}

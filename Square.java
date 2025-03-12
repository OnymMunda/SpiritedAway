/**
This is a template for a Java file.
@author Jose Ramon William T. Munda III (224401)
@version March 9, 2023
**/
/*
 * This class creates a square shape based on the given parameters.
 * The square is a basic shape used in the different classes.
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

public class Square implements DrawingObject{
    private double x;
    private double y;
    private double size;
    private Color color;

    /**
     * @param x refers to the x starting point of the square
     * @param y refers to the y starting point of the square
     * @param size refers to how long a side of the square is (
     * @param color refers to the color of the square
     */
    public Square(double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    /*
     * this method draws the square
     */
    @Override
    public void draw(Graphics2D g2d){
        Rectangle2D s = new Rectangle2D.Double(x,y,size,size);
        g2d.setColor(color);
        g2d.fill(s);
    }
}

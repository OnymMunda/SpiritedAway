/**
This is a template for a Java file.
@author Jose Ramon William T. Munda III (224401)
@version March 9, 2023
**/
/*
 * This class creates a round rectangle shape based on the given parameters.
 * The round rectangle is a basic shape used in the different classes.
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

public class RoundRectangle implements DrawingObject{
    private double x;
    private double y;
    private double width;
    private double height;
    private double arcWidth; 
    private double arcHeight;
    private Color color;

    /**
     * @param x refers to the x starting point of the round rectangle
     * @param y refers to the y starting point of the round rectangle
     * @param width refers to how long the round rectangle is
     * @param height refers to how tall the round rectangle is
     * @param arcWidth refers to how curved the width of the rectangle is
     * @param arcHeight refers to how curved the height of the rectangle is
     * @param color refers to the color of the round rectangle
     */
    public RoundRectangle(double x, double y, double width, double height, double arcWidth, double arcHeight, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
        this.color = color;
    }

    /*
     * this method draws the round rectangle
     */
    public void draw(Graphics2D g2d){
        RoundRectangle2D r = new RoundRectangle2D.Double(x, y, width, height, arcWidth, arcHeight);
        g2d.setColor(color);
        g2d.fill(r);
    }
}

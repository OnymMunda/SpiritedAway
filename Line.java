/**
This is a template for a Java file.
@author Jose Ramon William T. Munda III (224401)
@version March 9, 2023
**/
/*
 * This class creates a line from the given startpoints and endpoints.
 * This line is a basic shape used in the different classes.
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

public class Line implements DrawingObject {

    private double startX;
    private double startY;
    private double endX;
    private double endY;
    private int thickness;
    private Color color;

    /**
     * @param startX refers to the starting x of the line
     * @param startY refers to the starting y of the line
     * @param endX refers to the ending x of the line
     * @param endY refers to the ending y of the line
     * @param thickness refers to how thick the line would be
     * @param color refers to the color of the line
     */
    public Line(double startX, double startY, double endX, double endY, int thickness, Color color){
    this.startX = startX;
    this.startY = startY;
    this.endX = endX;
    this.endY = endY;
    this.thickness = thickness;
    this.color = color;
    }

    /*
     * this method draws the line
     */
    @Override
    public void draw(Graphics2D g2d){
        Line2D l = new Line2D.Double(startX,startY,endX,endY);
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.draw(l);
    }
}

/**
This is a template for a Java file.
@author Jose Ramon William T. Munda III (224401)
@version March 9, 2023
**/
/*
 * This class creates a door in a location with respect to the x and y values inputted. 
 * It consists of different round rectangles that represent the parts of the door such as: 
 * the door frame, window frame, and window pane.
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

public class Door implements DrawingObject {

    private double x;
    private double y;
    private RoundRectangle doorFrame;
    private RoundRectangle doorBody;
    private RoundRectangle doorWindowFrame;
    private RoundRectangle doorWindowPane;
    private Path2D doorStreak1;
    private Path2D doorStreak2;

    /**
     * @param x refers to the x starting point of the door
     * @param y refers to the y starting point of the door
     */
    public Door(double x, double y){
        this.x = x;
        this.y = y;
    }

    /*
     * this method draws the door
     */
    @Override
    public void draw(Graphics2D g2d){

        doorFrame = new RoundRectangle(x, y, 76.06, 160.42, 20, 20, SceneCanvas.Maroon);
        doorFrame.draw(g2d);
        
        doorBody = new RoundRectangle(x+5.88, y+4.45, 64.78, 151.89, 20, 20, SceneCanvas.Beige);
        doorBody.draw(g2d);

        doorWindowFrame = new RoundRectangle(x+8.44, y+7.38, 59.42, 65.82, 20, 20, SceneCanvas.Maroon);
        doorWindowFrame.draw(g2d);

        doorWindowPane = new RoundRectangle(x+11.04 ,y+10.73, 54.2, 58.64, 20, 20, SceneCanvas.LightBlue);
        doorWindowPane.draw(g2d);

        //Extra Details (for aesthetic purposes)
        doorStreak1 = new Path2D.Double();
        doorStreak1.moveTo(x-531.07, y+148.5);
        doorStreak1.lineTo(x-514.37, y+139.72);
        g2d.setColor(SceneCanvas.Khaki);
        g2d.setStroke(new BasicStroke(4));
        g2d.draw(doorStreak1);

        doorStreak2 = new Path2D.Double();
        doorStreak2.moveTo(x-515.27, y+149.87);
        doorStreak2.curveTo(x-495.37, y+139.27, x-507.67, y+131.77, x-504.67, y+106.07);
        g2d.setColor(SceneCanvas.Khaki);
        g2d.setStroke(new BasicStroke(4));
        g2d.draw(doorStreak2);

    }


}

/**
This is a template for a Java file.
@author Jose Ramon William T. Munda III (224401)
@version March 9, 2023
**/
/*
 * This class creates a window object.
 * It is created by combining 2 Round Rectangles for its frame and the pane.
 * Lines were also used to add a reflection effect.
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

public class Window implements DrawingObject {

    private double x;
    private double y;
    private Line reflection1;
    private Line reflection2;
    private RoundRectangle windowFrame;
    private RoundRectangle windowPane;

    /**
     * @param x refers to the x starting point of the window
     * @param y refers to the y starting point of the window
     */
    public Window(double x, double y){
        this.x = x;
        this.y = y;
    }

    /*
     * this method draws the window with the
     * different shape components
     */
    @Override
    public void draw(Graphics2D g2d){
        for(int i=0; i < 479.44/80.76; i++)
        {
            windowFrame = new RoundRectangle(x+80.76*i,y,55.79,50.13,20, 20, SceneCanvas.Maroon);
            windowFrame.draw(g2d);

            windowPane = new RoundRectangle((x+3.95)+80.76*i,y+3.6,48.55,42.73,20,20, SceneCanvas.LightBlue);
            windowPane.draw(g2d);

            reflection1 = new Line(448.67+80.76*i,392.08,457.71+80.76*i,386.59,2,Color.WHITE);
            reflection1.draw(g2d);

            reflection2 = new Line(459.32+80.76*i,405.96,477.72+80.76*i,393.05,2,Color.WHITE);
            reflection2.draw(g2d);
        }
    }
}

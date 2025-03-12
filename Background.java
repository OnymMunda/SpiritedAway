/**
This is a template for a Java file.
@author Jose Ramon William T. Munda III (224401)
@version March 9, 2023
**/
/*
 * This class creates the background of the frame. This includes the ocean, streaks of light,
 * the sky, and the sun.
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

public class Background implements DrawingObject {

    private Line horizon1;
    private Line horizon2;
    private Rectangle sky1;
    private Path2D sky2;
    private Path2D sky3;
    private Path2D sky4;
    private Circle sun;
    protected Ocean ocean;

    /**
     * instantiates ocean which is used for the animation,
     * also constructs the entire background
     */
    public Background(){
        ocean = new Ocean();
    }

    /*
     * this method draws the entire background which comprises of
     * different basic and composite shapes.
     */
    @Override
    public void draw(Graphics2D g2d){

        ocean.draw(g2d);

        sky1 = new Rectangle(0, 0, 1024, 179, SceneCanvas.Rouge);
        sky1.draw(g2d);
        
        sky2 = new Path2D.Double();
        sky2.moveTo(12.2, 0);
        sky2.curveTo(155, 83, 58.8, 162.3, 510.4, 177.6);
        sky2.lineTo(1024, 175.78);
        sky2.lineTo(1028,0);
        g2d.setColor(SceneCanvas.DarkOrange);
        g2d.fill(sky2);

        sky3 = new Path2D.Double();
        sky3.moveTo(258,0);
        sky3.curveTo(361, 163.3, 511.5, 176, 1028.5, 175.4);
        sky3.lineTo(1024,175.78);
        sky3.lineTo(1028,0);
        g2d.setColor(SceneCanvas.Orange);
        g2d.fill(sky3);

        sky4 = new Path2D.Double();
        sky4.moveTo(529, 0);
        sky4.curveTo(476.5, 133, 655, 152, 1026.4, 180.4);
        sky4.lineTo(1024, 175.78);
        sky4.lineTo(1028, 0);
        g2d.setColor(SceneCanvas.LightOrange);
        g2d.fill(sky4);

        sun = new Circle(813.89, 18.32, 80.86, Color.YELLOW);
        sun.draw(g2d);

        horizon1 = new Line(0, 180.23, 1024, 180.23, 5, SceneCanvas.SkyBlue);
        horizon1.draw(g2d);
        horizon2 = new Line(0, 186.23, 1024, 186.23, 5, SceneCanvas.Azure);
        horizon2.draw(g2d);
    }

}

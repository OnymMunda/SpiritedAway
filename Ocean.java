/**
This is a template for a Java file.
@author Jose Ramon William T. Munda III (224401)
@version March 9, 2023
**/
/*
 * This class creates the ocean part of the background.
 * This is also where the streaks are animated.
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

public class Ocean implements DrawingObject{

    private Square water1;
    private Path2D water2;
    private Path2D water3;
    private Path2D water4;
    private Path2D water5;
    private Streak streak;
    private Streak streak2;
    private Streak streak3;
    private AffineTransform transform;
    private double transformX;

    /**
     * initializes transform for the animations,
     * also constructs the whole ocean to be used
     * in different classes
     */
    public Ocean(){
        transform = new AffineTransform();
    }

    /*
     * draws the corresponding parts of the ocean
     * and then combines it into one whole composite shape.
     */
    @Override
    public void draw(Graphics2D g2d){

        AffineTransform reset = g2d.getTransform();

        water1 = new Square(0, 0, 1250, SceneCanvas.NavyBlue);
        water1.draw(g2d);

        water2 = new Path2D.Double();
        water2.moveTo(0, 490);
        water2.curveTo(122, 426, 12.6, 184, 335.6, 171.4);
        water2.lineTo(1024, 191.23);
        water2.lineTo(1024, 768);
        water2.lineTo(0, 768);
        g2d.setColor(SceneCanvas.Cerulean);
        g2d.fill(water2);

        water3 = new Path2D.Double();
        water3.moveTo(-15, 774);
        water3.curveTo(227, 565, -23, 221, 570, 139);
        water3.lineTo(1024, 191.23);
        water3.lineTo(1024, 768);
        water3.lineTo(0, 768);
        g2d.setColor(SceneCanvas.SteelBlue);
        g2d.fill(water2);

        water4 = new Path2D.Double();
        water4.moveTo(1024, 196);
        water4.curveTo(615, 300.5, 937, 711, 492, 794);
        water4.lineTo(1024, 768);
        g2d.setColor(SceneCanvas.Cerulean);
        g2d.fill(water4);

        water5 = new Path2D.Double();
        water5.moveTo(1071, 240);
        water5.curveTo(797, 492, 1152, 505, 701, 804);
        water5.lineTo(1024, 768);
        g2d.setColor(SceneCanvas.NavyBlue);
        g2d.fill(water5);

        g2d.setTransform(transform);

        streak = new Streak(0, 0);
        streak.draw(g2d);
        streak2 = new Streak(-1024, 0);
        streak2.draw(g2d);
        streak3 = new Streak(1024,0);
        streak3.draw(g2d);

        g2d.setTransform(reset);
    }

    public void moveLeft(double xMovement){
        if(transformX < 1024){
           transformX += xMovement;
           transform.setToTranslation(transformX, 0);
        }

        else{
            transformX = -1024;
        }
    }
}

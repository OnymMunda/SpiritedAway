/**
This is a template for a Java file.
@author Jose Ramon William T. Munda III (224401)
@version March 9, 2023
**/
/*
 * This class creates the character "No Face" from the anime "Spirited Away."
 * It is a composite shape consisting of circles, lines, and bezier curves
 * in order to create the character.
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

public class NoFace implements DrawingObject {
    private double x;
    private double y;
    private Circle face;
 
    /**
     * @param x refers to the x starting point of NoFace
     * @param y refers to the y starting point of NoFace
     */
    public NoFace(double x, double y){
        this.x = x;
        this.y = y;
    }

    /*
     * this method draws NoFace with the 
     * combination of the different shapes
     */
    @Override
    public void draw(Graphics2D g2d){

        Path2D body = new Path2D.Double();
        body.moveTo(x, y);
        body.curveTo(337, 346, 428, 346, 405.4, 426.79);
        g2d.setColor(Color.BLACK);
        g2d.fill(body);

        face = new Circle(x+4.27, y-54.01, 46.76, Color.WHITE);
        face.draw(g2d);

        Path2D leftUpper = new Path2D.Double();
        leftUpper.moveTo(370.76,  377.78);
        leftUpper.lineTo(370.76, 385.44);
        leftUpper.lineTo(365.38, 385.44);
        g2d.setColor(SceneCanvas.Lavender);
        g2d.fill(leftUpper);

        Ellipse leftEye = new Ellipse(x+10.68, y-39.57, 8.53, 4.84, Color.BLACK);
        leftEye.draw(g2d);

        Path2D leftLower = new Path2D.Double();
        leftLower.moveTo(364, 394.62);
        leftLower.curveTo(363.2, 401.8, 367.3, 407.4, 370.76, 409.94);
        leftLower.lineTo(370.76, 394.62);
        g2d.setColor(SceneCanvas.Lavender);
        g2d.fill(leftLower);

        Path2D rightUpper = new Path2D.Double();
        rightUpper.moveTo(391.15, 377.78);
        rightUpper.lineTo(391.15, 385.44);
        rightUpper.lineTo(396.28, 385.44);
        g2d.setColor(SceneCanvas.Lavender);
        g2d.fill(rightUpper);

        Ellipse rightEye = new Ellipse(x+36.85, y-39.57, 8.53, 4.84, Color.BLACK);
        rightEye.draw(g2d);

        Path2D rightLower = new Path2D.Double();
        rightLower.moveTo(391.15, 410);
        rightLower.curveTo(394.8, 407, 397.68, 401.34, 397.46, 394.62);
        rightLower.lineTo(391.15, 394.62);
        g2d.setColor(SceneCanvas.Lavender);
        g2d.fill(rightLower);

        Ellipse mouth = new Ellipse(x+20.15, y-14.58, 16.88, 4.89, Color.BLACK);
        mouth.draw(g2d);

    }
}

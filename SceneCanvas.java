/**
This is a template for a Java file.
@author Jose Ramon William T. Munda III (224401)
@version March 9, 2023
**/
/*
 * This is the canvas of the program. It is where everything is drawn.
 * Additionally, all colors that would be used in the different classes are instantiated here.
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

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class SceneCanvas extends JComponent {

    private int width;
    private int height;
    ArrayList<DrawingObject> shapes;

    //Custom colors used in all classes
    public static final Color SkyBlue = new Color(0, 162, 232); 
    public static final Color NavyBlue = new Color(61, 92, 135);
    public static final Color Cerulean = new Color(75, 115, 167);
    public static final Color SteelBlue = new Color(95, 132, 182);
    public static final Color DarkOrange = new Color(240, 96, 0);
    public static final Color Orange = new Color(255, 127, 39);
    public static final Color LightOrange = new Color (255, 162, 100);
    public static final Color Azure = new Color(63, 72, 204);
    public static final Color Beige = new Color(206, 166, 107);
    public static final Color Khaki = new Color(218, 182, 126);
    public static final Color Rouge = new Color(255, 119, 139); 
    public static final Color Maroon = new Color(93, 41, 44 );
    public static final Color LightBlue = new Color(148, 239, 239);
    public static final Color Brown = new Color(108, 59, 50);
    public static final Color Bronze = new Color(140, 65, 55);
    public static final Color DarkBrown = new Color (69, 35, 27);
    public static final Color Fuchsia = new Color(255, 91, 116);
    public static final Color Lavender = new Color(146, 110, 128);

    protected Background background;
    private Train train;
    
    /**
     * @param w refers to how wide the canvas would be
     * @param h refers to how tall the canvas would be
     */
    public SceneCanvas(int w, int h){
        width = w;
        height = h;
        shapes = new ArrayList<DrawingObject>();
        background = new Background();
        train = new Train();

        shapes.add(background);
        shapes.add(train);
    }

    /*
     * this method paints the canvas
     */
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        
        for(DrawingObject element : shapes) {
            element.draw(g2d);
        }
    }
}

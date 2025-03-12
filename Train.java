/**
This is a template for a Java file.
@author Jose Ramon William T. Munda III (224401)
@version March 9, 2023
**/
/*
 * This class creates the train as seen in the canvas.
 * It is composed of many different basic and composite shapes.
 * This was all done to achieve a recreation of the train as seen in
 * the anime film, "Spirited Away."
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

public class Train implements DrawingObject {

    //Instantiate Objects
    private Rectangle base1;
    private Rectangle base2;
    private Rectangle base3;
    private Path2D base1Front;
    private Path2D trainFrontWindowFrame;
    private Path2D trainFrontWindowPane;
    private Path2D base2Front;
    private Path2D base3Front;
    private Window window;
    private Door door;
    private Door door2;
    private Wheel wheel;
    private Wheel wheel2;
    private Roof roof;
    private Line trainFrontWindowReflection1;
    private Line trainFrontWindowReflection2;
    private Line trainLongWindowReflection1;
    private Line trainLongWindowReflection2;
    private Line bottomDividerUpper;
    private Line bottomDividerLower;
    private Line topOutline;
    private Line frontOutline;
    private Line base2Outline;
    private Line backOutline;
    private Line backDoorReflection1;
    private Line backDoorReflection2;
    private RoundRectangle trainLongWindowFrame;
    private RoundRectangle trainLongWindowPane;
    private NoFace noFace;

    /*
     *  allows the train to be used in different classes
     */
    public Train(){}

    /*
     * this method draws the corresponding parts of the train
     * then combines it into one whole composite shape
     */
    @Override
    public void draw(Graphics2D g2d){

        // Base 1
        base1 = new Rectangle(232, 341.99, 765.52, 191.31, SceneCanvas.Beige);
        base1.draw(g2d);

        base1Front = new Path2D.Double();
        base1Front.moveTo(232, 341.99);
        base1Front.lineTo(232, 533.33);
        base1Front.lineTo(140.29, 533.33); 
        g2d.setColor(SceneCanvas.Beige);
        g2d.fill(base1Front);

        topOutline = new Line(233, 342.99, 996.52, 342.99, 3, SceneCanvas.DarkBrown);
        topOutline.draw(g2d);

        trainFrontWindowFrame = new Path2D.Double();
        trainFrontWindowFrame.moveTo(232.86,366.9);
        trainFrontWindowFrame.lineTo(210.78,415.55);
        trainFrontWindowFrame.lineTo(255.75,415.55);
        trainFrontWindowFrame.lineTo(255.75,366.9);
        g2d.setColor(SceneCanvas.Maroon);
        g2d.fill(trainFrontWindowFrame);

        trainFrontWindowPane = new Path2D.Double();
        trainFrontWindowPane.moveTo(234.89,370.01);
        trainFrontWindowPane.lineTo(215.61,412.24);
        trainFrontWindowPane.lineTo(251.98,412.24);
        trainFrontWindowPane.lineTo(251.98,370.01);
        g2d.setColor(SceneCanvas.LightBlue);
        g2d.fill(trainFrontWindowPane);

        trainFrontWindowReflection1 = new Line(230.68, 400.48, 245.51, 382.07, 2, Color.WHITE);
        trainFrontWindowReflection1.draw(g2d);
        trainFrontWindowReflection2 = new Line(241.55, 407.82, 246.79, 399.37, 2, Color.WHITE);
        trainFrontWindowReflection2.draw(g2d);

        trainLongWindowFrame = new RoundRectangle(268.99, 366.9, 59.21, 49.53, 20, 20, SceneCanvas.Maroon);
        trainLongWindowFrame.draw(g2d);
        trainLongWindowPane = new RoundRectangle(272.86, 370.92, 52.09, 42.4, 20, 20, SceneCanvas.LightBlue);
        trainLongWindowPane.draw(g2d);

        trainLongWindowReflection1 = new Line(286.64, 382.98, 303.72, 378.66, 2, Color.WHITE);
        trainLongWindowReflection1.draw(g2d);
        trainLongWindowReflection2 = new Line(294.79, 402.16, 317.33, 389.21, 2, Color.WHITE);
        trainLongWindowReflection2.draw(g2d);

        roof = new Roof(232, 310.23, 766.52, 31.76, SceneCanvas.Maroon);
        roof.draw(g2d);

        //Base 2
        base2 = new Rectangle(185.85,437.8,812.37,95.65, SceneCanvas.Bronze);
        base2.draw(g2d);
        base2Outline = new Line(187.85, 437.8, 996.27, 437.8, 2, SceneCanvas.DarkBrown);
        base2Outline.draw(g2d);

        base2Front = new Path2D.Double();
        base2Front.moveTo(186.15, 437.8);
        base2Front.lineTo(186.15, 533.3);
        base2Front.lineTo(140.29,533.3);
        g2d.setColor(SceneCanvas.Bronze);
        g2d.fill(base2Front);
        
        for(int i =0; i < 807.71 / 16.54 ; i++){
            Line base2Outline = new Line(189.81+16.54*i, 439.43, 189.81+16.54*i, 510.3, 3, SceneCanvas.DarkBrown);
            base2Outline.draw(g2d);
        }

        window = new Window(433.54, 367.78);
        window.draw(g2d);

        //Base 3
        base3 = new Rectangle(154.26, 505.62, 843.56, 28.71, SceneCanvas.Brown);
        base3.draw(g2d);

        bottomDividerUpper = new Line(156.26, 505.62, 996.27, 505.62, 2, SceneCanvas.DarkBrown);
        bottomDividerUpper.draw(g2d);

        base3Front = new Path2D.Double();
        base3Front.moveTo(140.29, 533.3);
        base3Front.lineTo(154.26, 505.62);
        base3Front.lineTo(154.26, 534.33);
        g2d.setColor(SceneCanvas.Brown);
        g2d.fill(base3Front);

        bottomDividerLower = new Line(140.29, 533.3, 997.52, 533.3, 2, SceneCanvas.DarkBrown);
        bottomDividerLower.draw(g2d);

        frontOutline = new Line(140.29, 533.3, 232, 341.99, 2, SceneCanvas.DarkBrown);
        frontOutline.draw(g2d);
        backOutline = new Line(997.52, 341.99, 997.52, 533.3, 2, SceneCanvas.DarkBrown);
        backOutline.draw(g2d);

        door = new Door(342.15, 355.93);
        door.draw(g2d);
        noFace = new NoFace(353, 426.79);
        noFace.draw(g2d);
        door2 = new Door(910.37, 355.93);
        door2.draw(g2d);

        backDoorReflection1 = new Line(935.73, 389.2, 959.57, 385.54, 2, Color.WHITE);
        backDoorReflection1.draw(g2d);
        backDoorReflection2 = new Line(946.72, 406.7, 968.52, 396.52, 2, Color.WHITE);
        backDoorReflection2.draw(g2d);
        
        wheel = new Wheel(230.15, 516.65);
        wheel.draw(g2d);
        wheel2 = new Wheel(806.64, 516.65);
        wheel2.draw(g2d);

    }
}

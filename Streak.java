/**
This is a template for a Java file.
@author Jose Ramon William T. Munda III (224401)
@version March 9, 2023
**/
/*
 * This class creates the streaks of light on the ocean.
 * This was entirely made for aesthetic purposes.
 * Consists of ellipses and lines of different sizes.
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

public class Streak implements DrawingObject {

    private Ellipse orangeStreak1;
    private Ellipse orangeStreak2;
    private Ellipse orangeStreak3;
    private Ellipse orangeStreak4;
    private Ellipse orangeStreak5;
    private Ellipse orangeStreak6;
    private Ellipse orangeStreak7;
    private Ellipse orangeStreak8;
    private Ellipse orangeStreak9;
    private Ellipse orangeStreak10;
    private Ellipse orangeStreak11;
    private Ellipse orangeStreak12;
    private Ellipse orangeStreak13;
    private Ellipse orangeStreak14;
    private Ellipse orangeStreak15;
    private Ellipse orangeStreak16;
    private Ellipse orangeStreak17;
    private Ellipse orangeStreak18;
    private Ellipse orangeStreak19;
    private Ellipse orangeStreak20;
    private Ellipse orangeStreak21;
    private Ellipse orangeStreak22;
    private Line orangeStreak23;
    private Line orangeStreak24;
    private Line orangeStreak25;
    private Line orangeStreak26;
    private Line orangeStreak27;
    private Line orangeStreak28;
    private Line orangeStreak29;
    private Line orangeStreak30;
    private Line orangeStreak31;
    private Line orangeStreak32;
    private Line orangeStreak33;
    private Line orangeStreak34;
    private Line orangeStreak35;
    private Line orangeStreak36;
    private Line orangeStreak37;
    private Line orangeStreak38;
    
    private Ellipse yellowStreak1;
    private Ellipse yellowStreak2;
    private Ellipse yellowStreak3;
    private Ellipse yellowStreak4;
    private Ellipse yellowStreak5;
    private Ellipse yellowStreak6;
    private Ellipse yellowStreak7;
    private Ellipse yellowStreak8;
    private Ellipse yellowStreak9;
    private Ellipse yellowStreak10;
    private Ellipse yellowStreak11;
    private Ellipse yellowStreak12;
    private Ellipse yellowStreak13;
    private Ellipse yellowStreak14;
    private Ellipse yellowStreak15;
    private Line yellowStreak16;
    private Line yellowStreak17;

    private Ellipse pinkStreak1;
    private Ellipse pinkStreak2;
    private Ellipse pinkStreak3;
    private Ellipse pinkStreak4;
    private Ellipse pinkStreak5;
    private Ellipse pinkStreak6;
    private Ellipse pinkStreak7;
    private Ellipse pinkStreak8;
    private Ellipse pinkStreak9;
    private Ellipse pinkStreak10;
    private Ellipse pinkStreak11;
    private Ellipse pinkStreak12;
    private Line pinkStreak13;
    private Line pinkStreak14;
    private Line pinkStreak15;

    private Ellipse whiteStreak1;
    private Ellipse whiteStreak2;
    private Ellipse whiteStreak3;
    private Ellipse whiteStreak4;
    private Ellipse whiteStreak5;
    private Ellipse whiteStreak6;
    private Ellipse whiteStreak7;
    private Ellipse whiteStreak8;
    private Ellipse whiteStreak9;
    private Ellipse whiteStreak10;
    private Ellipse whiteStreak11;
    private Ellipse whiteStreak12;

    private double x;
    private double y;

    /**
     * @param x refers to the x starting position of the streaks
     * @param y refers to the y starting position of the streaks
     */
    public Streak(double x, double y){
        this.x = x;
        this.y = y;
    }

    /*
     * this method draws the different streaks to be used
     * by the ocean class
     */
    @Override
    public void draw(Graphics2D g2d){

        orangeStreak1 = new Ellipse(x+362.69, y+743.94, 74.5, 11.66, SceneCanvas.Orange);
        orangeStreak1.draw(g2d);
        orangeStreak2 = new Ellipse(x+548.54, y+725.8, 80.71, 10.13, SceneCanvas.Orange);
        orangeStreak2.draw(g2d);
        orangeStreak3 = new Ellipse(x+634.22, y+748.99, 42.82, 13.83, SceneCanvas.Orange);
        orangeStreak3.draw(g2d);
        orangeStreak4 = new Ellipse(x+686.08, y+713.02, 373.94, 21.61, SceneCanvas.Orange);
        orangeStreak4.draw(g2d);
        orangeStreak5 = new Ellipse(x+42.94, y+677.67, 407.24, 23.23, SceneCanvas.DarkOrange);
        orangeStreak5.draw(g2d);
        orangeStreak6 = new Ellipse(x+322.15, y+671.34, 322.05, 18.42, SceneCanvas.DarkOrange);
        orangeStreak6.draw(g2d);
        orangeStreak7 = new Ellipse(x+197.37, y+616.92, 388.51, 14.42, SceneCanvas.Orange);
        orangeStreak7.draw(g2d);
        orangeStreak8 = new Ellipse(x+651.02, y+601.17, 40.42, 12.63, SceneCanvas.Orange);
        orangeStreak8.draw(g2d);
        orangeStreak9 = new Ellipse(x+257.6, y+569.31, 61.59, 9.89, SceneCanvas.Orange);
        orangeStreak9.draw(g2d);
        orangeStreak10 = new Ellipse(x+480.5, y+567.64, 210.73, 18.95, SceneCanvas.DarkOrange);
        orangeStreak10.draw(g2d);
        orangeStreak11 = new Ellipse(x+839.28, y+562.56, 239.2, 16.71, SceneCanvas.DarkOrange);
        orangeStreak11.draw(g2d);
        orangeStreak12 = new Ellipse(x+8.46, y+487.91, 223.98, 14.06, SceneCanvas.DarkOrange);
        orangeStreak12.draw(g2d);
        orangeStreak13 = new Ellipse(x+106.12, y+403.26, 58.21, 11.65, SceneCanvas.DarkOrange);
        orangeStreak13.draw(g2d);
        orangeStreak14 = new Ellipse(x+360.28, y+253.07, 52.95, 6.93, SceneCanvas.DarkOrange);
        orangeStreak14.draw(g2d);
        orangeStreak15 = new Ellipse(x+490.68, y+225.07, 45.57, 6.53, SceneCanvas.Orange);
        orangeStreak15.draw(g2d);
        orangeStreak16 = new Ellipse(x+790.15, y+232.59, 55.69, 5.18, SceneCanvas.DarkOrange);
        orangeStreak16.draw(g2d);
        orangeStreak17 = new Ellipse(x+371.34, y+524.29, 72.07, 20.72, SceneCanvas.DarkOrange);
        orangeStreak17.draw(g2d);
        orangeStreak18 = new Ellipse(x+649.03, y+524.01, 129.66, 18.53, SceneCanvas.Orange);
        orangeStreak18.draw(g2d);
        orangeStreak19 = new Ellipse(x+316.64, y+454.45, 55.2, 12.23, SceneCanvas.Orange);
        orangeStreak19.draw(g2d);
        orangeStreak20 = new Ellipse(x+117.64, y+325.1, 59.8, 19.9, SceneCanvas.Orange);
        orangeStreak20.draw(g2d);
        orangeStreak21 = new Ellipse(x+358.73, y+379.44, 72.15, 16.84, SceneCanvas.Orange);
        orangeStreak21.draw(g2d);
        orangeStreak22 = new Ellipse(x+898.21, y+468.88, 66.18, 16.52, SceneCanvas.DarkOrange);
        orangeStreak22.draw(g2d);
        orangeStreak23 = new Line(x+4.58, y+207.05, x+85.88, y+207.05, 5, SceneCanvas.DarkOrange);
        orangeStreak23.draw(g2d);
        orangeStreak24 = new Line(x+120.64, y+206.37, x+192.71, y+206.37, 4, SceneCanvas.Orange);
        orangeStreak24.draw(g2d);
        orangeStreak25 = new Line(x+105.97, y+214.34, x+256.81, y+214.34, 4, SceneCanvas.Orange);
        orangeStreak25.draw(g2d);
        orangeStreak26 = new Line(x+312.71, y+200.85, x+340, y+200.85, 5, SceneCanvas.Orange);
        orangeStreak26.draw(g2d);
        orangeStreak27 = new Line(x+251.71, y+263.94, x+331.91, y+263.94, 4, SceneCanvas.Orange);
        orangeStreak27.draw(g2d);
        orangeStreak28 = new Line(x+584.56, y+232.96, x+617.33, y+233.43, 4, SceneCanvas.Orange);
        orangeStreak28.draw(g2d);
        orangeStreak29 = new Line(x+697.4, y+215.7, x+804.77, y+216.11, 4, SceneCanvas.DarkOrange);
        orangeStreak29.draw(g2d);
        orangeStreak30 = new Line(x+618.72, y+207.51, x+660.52, y+207.51, 5, SceneCanvas.Orange);
        orangeStreak30.draw(g2d);
        orangeStreak31 = new Line(x+359.69, y+205.67, x+600.35, y+206.8, 5, SceneCanvas.DarkOrange);
        orangeStreak31.draw(g2d);
        orangeStreak32 = new Line(x+884.06, y+239.73, x+951.09, y+239.2, 5, SceneCanvas.Orange);
        orangeStreak32.draw(g2d);
        orangeStreak33 = new Line(x+985.14, y+253.56, x+1034.62, y+253.56, 4, SceneCanvas.DarkOrange);
        orangeStreak33.draw(g2d);
        orangeStreak34 = new Line(x+944.16, y+214.96, x+1033.7, y+214.96, 6, SceneCanvas.DarkOrange);
        orangeStreak34.draw(g2d);
        orangeStreak35 = new Line(x+851.79, y+201.93, x+944, y+201.93, 4, SceneCanvas.Orange);
        orangeStreak35.draw(g2d);
        orangeStreak36 = new Line(x+967.41, y+191.75, x+1028.77, y+191.75, 5, SceneCanvas.DarkOrange);
        orangeStreak36.draw(g2d);
        orangeStreak37 = new Line(x+1006.63, y+201.87, x+1031.66, y+201.87, 4, SceneCanvas.Orange);
        orangeStreak37.draw(g2d);
        orangeStreak38 = new Line(x+491.04, y+190.83, x+583.96, y+190.83, 4, SceneCanvas.Orange);
        orangeStreak38.draw(g2d);

        yellowStreak1 = new Ellipse(x+664.28, y+634.85, 400, 19.36, Color.YELLOW);
        yellowStreak1.draw(g2d);
        yellowStreak2 = new Ellipse(x+-19.31, y+585.42, 181.01, 11.79, Color.YELLOW);
        yellowStreak2.draw(g2d);
        yellowStreak3 = new Ellipse(x+129.15, y+440.15, 93.41, 13.13, Color.YELLOW);
        yellowStreak3.draw(g2d);
        yellowStreak4 = new Ellipse(x+15.8, y+417.48, 82.21, 15.22, Color.YELLOW);
        yellowStreak4.draw(g2d);
        yellowStreak5 = new Ellipse(x+145.99, y+380.16, 102.69, 11.78, Color.YELLOW);
        yellowStreak5.draw(g2d);
        yellowStreak6 = new Ellipse(x+51.85, y+278.31, 91.78, 11.11, Color.YELLOW);
        yellowStreak6.draw(g2d);
        yellowStreak7 = new Ellipse(x+155.2, y+241.14, 70.79, 6.51, Color.YELLOW);
        yellowStreak7.draw(g2d);
        yellowStreak8 = new Ellipse(x+455.75, y+251.62, 79.93, 6.34, Color.YELLOW);
        yellowStreak8.draw(g2d);
        yellowStreak9 = new Ellipse(x+680.68, y+228.55, 39.02, 7.4, Color.YELLOW);
        yellowStreak9.draw(g2d);
        yellowStreak10 = new Ellipse(x+659.27, y+254.87, 146.21, 10.46, Color.YELLOW);
        yellowStreak10.draw(g2d);
        yellowStreak11 = new Ellipse(x+488.85, y+304.44, 73.47, 14.67, Color.YELLOW);
        yellowStreak11.draw(g2d);
        yellowStreak12 = new Ellipse(x+488.48, y+398.87, 111.52, 17.89, Color.YELLOW);
        yellowStreak12.draw(g2d);
        yellowStreak13 = new Ellipse(x+760.45, y+431.01, 90.9, 18.18, Color.YELLOW);
        yellowStreak13.draw(g2d);
        yellowStreak14 = new Ellipse(x+635.83, y+327.06, 107.23, 18.61, Color.YELLOW);
        yellowStreak14.draw(g2d);
        yellowStreak15 = new Ellipse(x+873.58, y+292.67, 200.72, 21.76, Color.YELLOW);
        yellowStreak15.draw(g2d);
        yellowStreak16 = new Line(x+210.68, y+278.46, x+240, y+278.46, 4, Color.YELLOW);
        yellowStreak16.draw(g2d);
        yellowStreak17 = new Line(x+330.58, y+225.89, x+277.93, y+225.89, 4, Color.YELLOW);
        yellowStreak17.draw(g2d);

        pinkStreak1 = new Ellipse(x+8.72, y+746.93, 265.69, 15.62, SceneCanvas.Rouge);
        pinkStreak1.draw(g2d);
        pinkStreak2 = new Ellipse(x+492.45, y+741.17, 30.4, 10.2, SceneCanvas.Rouge);
        pinkStreak2.draw(g2d);
        pinkStreak3 = new Ellipse(x+718.36, y+606.82, 31.30, 11.86, SceneCanvas.Rouge);
        pinkStreak3.draw(g2d);
        pinkStreak4 = new Ellipse(x+32.01, y+368.03, 62.61, 9.41, SceneCanvas.Rouge);
        pinkStreak4.draw(g2d);
        pinkStreak5 = new Ellipse(x+25.28, y+547.76, 55, 9.16, SceneCanvas.Rouge);
        pinkStreak5.draw(g2d);
        pinkStreak6 = new Ellipse(x+36.63, y+231.74, 52.06, 8.02, SceneCanvas.Rouge);
        pinkStreak6.draw(g2d);
        pinkStreak7 = new Ellipse(x+571.96, y+267.47, 63.96, 7, SceneCanvas.Rouge);
        pinkStreak7.draw(g2d);
        pinkStreak8 = new Ellipse(x+597.15, y+469.78, 125.58, 20.76, SceneCanvas.Rouge);
        pinkStreak8.draw(g2d);
        pinkStreak9 = new Ellipse(x+266.89, y+328.93, 101.76, 18.29, SceneCanvas.Rouge);
        pinkStreak9.draw(g2d);
        pinkStreak10 = new Ellipse(x+478.5, y+464.38, 35.12,11.5, SceneCanvas.Rouge);
        pinkStreak10.draw(g2d);
        pinkStreak11 = new Ellipse(x+919.45, y+414.06, 93.44, 17.31, SceneCanvas.Rouge);
        pinkStreak11.draw(g2d);
        pinkStreak12 = new Ellipse(x+734.12, y+359.54, 146.7, 20.64, SceneCanvas.Rouge);
        pinkStreak12.draw(g2d);
        pinkStreak13 = new Line(x+221.89, y+203.8, x+286.74, y+203.8, 4, SceneCanvas.Rouge);
        pinkStreak13.draw(g2d);
        pinkStreak14 = new Line(x+403.41, y+232.24, x+446.26, y+232.24, 6, SceneCanvas.Rouge);
        pinkStreak14.draw(g2d);
        pinkStreak15 = new Line(x+813.34, y+275.83, x+965.26, y+275.83, 5, SceneCanvas.Rouge);
        pinkStreak15.draw(g2d);

        
        whiteStreak1 = new Ellipse(x+655.29, y+734.56, 18.86, 6, Color.WHITE);
        whiteStreak1.draw(g2d);
        whiteStreak2 = new Ellipse(x+70.02, y+729.8, 157.31, 4.61, Color.WHITE);
        whiteStreak2.draw(g2d);
        whiteStreak3 = new Ellipse(x+494.49, y+705.83, 169.82, 7.24, Color.WHITE);
        whiteStreak3.draw(g2d);
        whiteStreak4 = new Ellipse(x+854.75, y+698.29, 195.33, 10, Color.WHITE);
        whiteStreak4.draw(g2d);
        whiteStreak5 = new Ellipse(x+111.18, y+632.86, 97.59, 9.57, Color.WHITE);
        whiteStreak5.draw(g2d);
        whiteStreak6 = new Ellipse(x+358.76, y+636.84, 190.25, 8.81, Color.WHITE);
        whiteStreak6.draw(g2d);
        whiteStreak7 = new Ellipse(x+689.7, y+651.17, 236.63, 8, Color.WHITE);
        whiteStreak7.draw(g2d);
        whiteStreak8 = new Ellipse(x+678.99, y+601.88, 30.34, 5.6, Color.WHITE);
        whiteStreak8.draw(g2d);
        whiteStreak9 = new Ellipse(x+740.76, y+607.52, 48.25, 6.41, Color.WHITE);
        whiteStreak9.draw(g2d);
        whiteStreak10 = new Ellipse(x+-8.29, y+593.1, 84.28, 9.51, Color.WHITE);
        whiteStreak10.draw(g2d);
        whiteStreak11 = new Ellipse(x+416.68, y+578.44, 92.94, 11.23, Color.WHITE);
        whiteStreak11.draw(g2d);
        whiteStreak12 = new Ellipse(x+54.32, y+534.98, 32.14, 8.37, Color.WHITE);
        whiteStreak12.draw(g2d);
    }
}

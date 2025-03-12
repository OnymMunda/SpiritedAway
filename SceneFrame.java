/**
This is a template for a Java file.
@author Jose Ramon William T. Munda III (224401)
@version March 9, 2023
**/
/*
 * This class is the general frame of the program.
 * It is where the GUI is, and where the animation code is found.
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
import java.awt.event.*;

public class SceneFrame {
  private JFrame f;
  private int width;
  private int height;
  protected SceneCanvas sceneCanvas;

  /**
   * @param w
   * @param h
   */
  public SceneFrame(int w, int h) {
    f = new JFrame();
    width = w;
    height = h;
    sceneCanvas = new SceneCanvas(width, height);
  }

  /**
   * this method sets up the GUI and implements the required parameters
   */
  public void setUpGUI() {
    Container cp = f.getContentPane();
    cp.add(sceneCanvas, BorderLayout.CENTER);
     
    f.setTitle("Midterm Project - Munda, Jose Ramon William III - 224401");
    f.getContentPane().setPreferredSize(new Dimension(width, height));
    f.pack();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    f.setResizable(false);
    timer.start();
  }

  ActionListener a = new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
      sceneCanvas.background.ocean.moveLeft(1.25);
      sceneCanvas.repaint();   
    }
  };
  Timer timer = new Timer(10, a);
}

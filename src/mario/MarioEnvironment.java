/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mario;

import environment.Environment;
import image.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Victor
 */
class MarioEnvironment extends Environment {

    private Image horde;
    private Image castle;
    private Image field;
    private Image hell;
    boolean drawCastle;
    boolean drawField;
    boolean drawHell;

    @Override
    public void initializeEnvironment() {
      // Loading images in initialization increases efficiency and prevents image from loading 100,000 times a second
        horde = ResourceTools.loadImageFromResource("resources/horde.jpg");
        castle = ResourceTools.loadImageFromResource("resources/Castle.jpg");
        field = ResourceTools.loadImageFromResource("resources/Field.jpg");
        hell = ResourceTools.loadImageFromResource("resources/Hell.jpg");
    }

    @Override
    public void timerTaskHandler() {
        //create the length of a level
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
       //create a way to switch back to previous images and create a method to allow title screen to be returned to using the escape key
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            castle = ResourceTools.loadImageFromResource("resources/Castle.jpg");
            drawCastle = true;
             drawField = false;
            drawHell = false;
            System.out.println("castle");
        }
        if (e.getKeyCode() == KeyEvent.VK_Q) {
            field = ResourceTools.loadImageFromResource("resources/Field.jpg");
             drawField = true;
             drawCastle = false;
            drawHell = false;
             System.out.println("field");
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hell = ResourceTools.loadImageFromResource("resources/Hell.jpg"); 
            drawHell = true;
             drawCastle = false;
             drawField = false;
            System.out.println("hell");
        }
           if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            hell = ResourceTools.loadImageFromResource("resources/Hell.jpg"); 
//            drawHell = true;
            drawHell = false;
             drawCastle = false;
             drawField = false;
            System.out.println("hell");
        }
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
// implement animations including character and map and shop, after break here
        if (horde != null) {
            graphics.drawImage(horde.getScaledInstance(1950, 1100, Image.SCALE_FAST), 0, 0, null);


            graphics.setColor(Color.YELLOW);
            graphics.drawRect(800, 700, 350, 65);
            graphics.drawRect(800, 400, 350, 65);

            graphics.setFont(new Font("Calabri", Font.BOLD, 45));
            graphics.drawString("New Game", 860, 450);
            graphics.drawString("Instructions", 850, 750);

            graphics.setColor(Color.YELLOW);
            graphics.setFont(new Font("Comic Sans", Font.ITALIC, 65));
            graphics.drawString("Mapleland", 818, 200);
        }
       
        if (drawCastle) {
            graphics.drawImage(castle.getScaledInstance(1950, 1100, Image.SCALE_FAST), 0, 0, null);
            System.out.println("drawing castle");
        }
        if (drawField) {    
            graphics.drawImage(field.getScaledInstance(1950, 1100, Image.SCALE_FAST), 0, 0, null);
            System.out.println("drawing field");
        }
        if (drawHell) {
            graphics.drawImage(hell.getScaledInstance(1950, 1100, Image.SCALE_FAST), 0, 0, null);
            System.out.println("drawing hell");
        }
    }
}

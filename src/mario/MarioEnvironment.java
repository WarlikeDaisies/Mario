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
 * @author VictorR
 */
class MarioEnvironment extends Environment {

    private Level level = Level.TitleScreen;
    private Image horde;
    private Image castle;
    private Image field;
    private Image hell;

    @Override
    public void initializeEnvironment() {
        horde = ResourceTools.loadImageFromResource("resources/horde.jpg");
        castle = ResourceTools.loadImageFromResource("resources/Castle.jpg");
        field = ResourceTools.loadImageFromResource("resources/FieldStandardFinal1.jpg");
        hell = ResourceTools.loadImageFromResource("resources/Hell.jpg");

    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        
        if (e.getKeyCode() == KeyEvent.VK_Q) {
            this.level = Level.Level1;

        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            this.level = Level.Level2;
        }
        if (e.getKeyCode() == KeyEvent.VK_E) {
            this.level = Level.Level3;
        }
        if (e.getKeyCode() == KeyEvent.VK_R) {
            this.level = Level.TitleScreen;
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

        if (this.level == Level.TitleScreen) {

            graphics.drawImage(horde.getScaledInstance(885,500, Image.SCALE_FAST), 0, 0, null);


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
        if (this.level == Level.Level1) {
            graphics.drawImage(castle.getScaledInstance(885,500, Image.SCALE_FAST), 0, 0, null);

        }
        if (this.level == Level.Level2) {
            graphics.drawImage(hell.getScaledInstance(885,500, Image.SCALE_FAST), 0, 0, null);
        }
         if (this.level == Level.Level3) {
            graphics.drawImage(field.getScaledInstance(885,500, Image.SCALE_FAST), 0, 0, null);
        }
    }
}


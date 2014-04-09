/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mario;

import environment.Environment;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Victor
 */
class MarioEnvironment extends Environment {

    @Override
    public void initializeEnvironment() {
        
    }

    @Override
    public void timerTaskHandler() {
        
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        graphics.setColor(Color.red);
        graphics.drawRect(800, 700, 350, 65);
        graphics.drawRect(800, 400, 350, 65);
        
        graphics.setFont(new Font("Calabri", Font.BOLD, 45));
        graphics.drawString("New Game", 860, 450);
        graphics.drawString("Instructions", 850, 750);
        
        graphics.setColor(Color.BLUE);
        graphics.setFont(new Font("Comic Sans", Font.ITALIC, 65));
        graphics.drawString("Mapleland", 818, 200);
    }
}

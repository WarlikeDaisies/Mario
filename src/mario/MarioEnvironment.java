   /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mario;

import enemy.Troll;
import enemy.TrollActionState;
import environment.Environment;
import environment.Velocity;
import image.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

/**
 *
 * @author VictorR
 */
class MarioEnvironment extends Environment implements MouseMotionListener {

    private Level level = Level.TitleScreen;
    private Image horde;
    private Image castle;
    private Image field;
    private Image hell;
    private BufferedImage trollSpriteMap;
    private BufferedImage trollSpriteMap2;
    Troll troll2;
    Troll troll;
    Troll troll3;
    Troll troll4;
    Troll troll5;
    Troll troll6;

    @Override
    public void initializeEnvironment() {
        horde = ResourceTools.loadImageFromResource("resources/horde.jpg");
        castle = ResourceTools.loadImageFromResource("resources/Castle.jpg");
        field = ResourceTools.loadImageFromResource("resources/FieldStandardFinal1.jpg");
        hell = ResourceTools.loadImageFromResource("resources/Hell.jpg");
        trollSpriteMap = (BufferedImage) ResourceTools.loadImageFromResource("resources/troll_sprite_map.jpeg");
        trollSpriteMap2 =  (BufferedImage) ResourceTools.loadImageFromResource("resources/troll_sprites_right.png");
        
        addMouseMotionListener(this);
        troll = new Troll(new Point(700, 50), new Velocity(0, 0));
        troll2 = new Troll(new Point(800, 70), new Velocity(0, 0));
<<<<<<< HEAD
       troll3 = new Troll(new Point(600, 90), new Velocity(0, 0));
=======
        troll3 = new Troll(new Point(600, 90), new Velocity(0, 0));
>>>>>>> FETCH_HEAD
        troll4 = new Troll(new Point(500, 50), new Velocity(0, 0));
        troll5 = new Troll(new Point(400, 70), new Velocity(0, 0));
        troll6 = new Troll(new Point(300, 90), new Velocity(0, 0));
        getActors().add(troll);
        getActors().add(troll2);
        getActors().add(troll3);
        getActors().add(troll4);
        getActors().add(troll5);
        getActors().add(troll6);
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        
        if (e.getKeyCode() == KeyEvent.VK_Q) {
            this.level = Level.Level1;
        } else if (e.getKeyCode() == KeyEvent.VK_W) {
            this.level = Level.Level2;
        } else if (e.getKeyCode() == KeyEvent.VK_E) {
            this.level = Level.Level3;
        } else if (e.getKeyCode() == KeyEvent.VK_R) {
            this.level = Level.TitleScreen;
            
        } else if (e.getKeyCode() == KeyEvent.VK_C) {
            troll.setActionState(TrollActionState.AXE_CHOP_LEFT);
            troll.stop();
            troll2.setActionState(TrollActionState.AXE_CHOP_LEFT);
            troll2.stop();
            troll3.setActionState(TrollActionState.AXE_CHOP_LEFT);
            troll3.stop();
            troll4.setActionState(TrollActionState.AXE_CHOP_LEFT);
            troll4.stop();
            troll5.setActionState(TrollActionState.AXE_CHOP_LEFT);
            troll5.stop();
            troll6.setActionState(TrollActionState.AXE_CHOP_LEFT);
            troll6.stop();
            } else if (e.getKeyCode() == KeyEvent.VK_Z) {
            troll.setActionState(TrollActionState.AXE_CHOP_RIGHT);
            troll.stop();
            troll2.setActionState(TrollActionState.AXE_CHOP_RIGHT);
            troll2.stop();
            troll3.setActionState(TrollActionState.AXE_CHOP_RIGHT);
            troll3.stop();
            troll4.setActionState(TrollActionState.AXE_CHOP_RIGHT);
            troll4.stop();
            troll5.setActionState(TrollActionState.AXE_CHOP_RIGHT);
            troll5.stop();
            troll6.setActionState(TrollActionState.AXE_CHOP_RIGHT);
            troll6.stop();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            troll.setActionState(TrollActionState.WALK_RIGHT);
            troll.getVelocity().x = +2;
            troll2.setActionState(TrollActionState.WALK_RIGHT);
            troll2.getVelocity().x = +2;
            troll3.setActionState(TrollActionState.WALK_RIGHT);
            troll3.getVelocity().x = +2;
            troll4.setActionState(TrollActionState.WALK_RIGHT);
            troll4.getVelocity().x = +2;
            troll5.setActionState(TrollActionState.WALK_RIGHT);
            troll5.getVelocity().x = +2;
            troll6.setActionState(TrollActionState.WALK_RIGHT);
            troll6.getVelocity().x = +2;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            troll.getVelocity().x = -2;
            troll.setActionState(TrollActionState.WALK_LEFT);
            troll2.getVelocity().x = -2;
            troll2.setActionState(TrollActionState.WALK_LEFT);
            troll3.getVelocity().x = -2;
            troll3.setActionState(TrollActionState.WALK_LEFT);
            troll4.getVelocity().x = -2;
            troll4.setActionState(TrollActionState.WALK_LEFT);
            troll5.getVelocity().x = -2;
            troll5.setActionState(TrollActionState.WALK_LEFT);
            troll6.getVelocity().x = -2;
            troll6.setActionState(TrollActionState.WALK_LEFT);
         
            
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            troll.stop();
            troll.setActionState(TrollActionState.STAND_LEFT);
            troll2.stop();
            troll2.setActionState(TrollActionState.STAND_LEFT);
            troll3.stop();
            troll3.setActionState(TrollActionState.STAND_LEFT);
            troll4.stop();
            troll4.setActionState(TrollActionState.STAND_LEFT);
            troll5.stop();
            troll5.setActionState(TrollActionState.STAND_LEFT);
            troll6.stop();
            troll6.setActionState(TrollActionState.STAND_LEFT);
        } else if (e.getKeyCode() == KeyEvent.VK_X) {
            troll.stop();
            troll.setActionState(TrollActionState.ROAR_LEFT);
            troll2.stop();
            troll2.setActionState(TrollActionState.ROAR_LEFT);
            troll3.stop();
            troll3.setActionState(TrollActionState.ROAR_LEFT);
            troll4.stop();
            troll4.setActionState(TrollActionState.ROAR_LEFT);
            troll5.stop();
            troll5.setActionState(TrollActionState.ROAR_LEFT);
            troll6.stop();
            troll6.setActionState(TrollActionState.ROAR_LEFT);
         } else if (e.getKeyCode() == KeyEvent.VK_B) {
            troll.stop();
            troll.setActionState(TrollActionState.ROAR_RIGHT);
            troll2.stop();
            troll2.setActionState(TrollActionState.ROAR_RIGHT);
            troll3.stop();
            troll3.setActionState(TrollActionState.ROAR_RIGHT);
            troll4.stop();
            troll4.setActionState(TrollActionState.ROAR_RIGHT);
            troll5.stop();
            troll5.setActionState(TrollActionState.ROAR_RIGHT);
            troll6.stop();
            troll6.setActionState(TrollActionState.ROAR_RIGHT);
            
        }else if (e.getKeyCode() == KeyEvent.VK_V) {
            troll.stop();
            troll.setActionState(TrollActionState.STAND_RIGHT);
            troll2.stop();
            troll2.setActionState(TrollActionState.STAND_RIGHT);
         troll3.stop();
            troll3.setActionState(TrollActionState.STAND_RIGHT);
            troll4.stop();
            troll4.setActionState(TrollActionState.STAND_RIGHT);
            troll5.stop();
            troll5.setActionState(TrollActionState.STAND_RIGHT);
            troll6.stop();
            troll6.setActionState(TrollActionState.STAND_RIGHT);
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

//        if (this.level == Level.TitleScreen) {
//            graphics.drawImage(horde.getScaledInstance(885,500, Image.SCALE_FAST), 0, 0, null);
//
//            graphics.setColor(Color.YELLOW);
//            graphics.drawRect(800, 700, 350, 65);
//            graphics.drawRect(800, 400, 350, 65);
//
//            graphics.setFont(new Font("Calabri", Font.BOLD, 45));
//            graphics.drawString("New Game", 860, 450);
//            graphics.drawString("Instructions", 850, 750);
//
//            graphics.setColor(Color.YELLOW);
//            graphics.setFont(new Font("Comic Sans", Font.ITALIC, 65));
//            graphics.drawString("Mapleland", 818, 200);
//        }

        if (this.level == Level.Level1) {
            graphics.drawImage(castle.getScaledInstance(885,500, Image.SCALE_FAST), 0, 0, null);
        }
        if (this.level == Level.Level2) {
            graphics.drawImage(hell.getScaledInstance(885,500, Image.SCALE_FAST), 0, 0, null);
        }
         if (this.level == Level.Level3) {
            graphics.drawImage(field.getScaledInstance(885,500, Image.SCALE_FAST), 0, 0, null);
        }
         
        if (trollSpriteMap2 != null) {
           graphics.drawImage(trollSpriteMap2, 0, 0, this);
        }
    }

//<editor-fold defaultstate="collapsed" desc="MouseMotionListener">
    @Override
    public void mouseDragged(MouseEvent e) {

    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.printf(" [%d, %d]\n", e.getPoint().x, e.getPoint().y);
    }
//</editor-fold>
}


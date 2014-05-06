/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enemy;

import environment.Actor;
import environment.Velocity;
import image.Animator;
import image.ImageManager;
import image.ResourceTools;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Dr. Stacey McDonald
 */
public class Troll extends Actor {

//<editor-fold defaultstate="collapsed" desc="Methods">
    @Override
    public Image getImage() {
        if (animator != null) {
            return animator.getCurrentImage();
        } else {
            return super.getImage();
        }
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Properties">
    private final Animator animator;
    private final ImageManager imageManager;
    private final ArrayList<String> standLeft, walkLeft, axeChopLeft, roarLeft, walkRight, standRight,axeChopRight, roarRight;
    
    private TrollActionState actionState = TrollActionState.STAND_LEFT;
    
    /**
     * @return the actionState
     */
    public TrollActionState getActionState() {
        return actionState;
    }
    
    /**
     * @param actionState the actionState to set
     */
    public void setActionState(TrollActionState actionState) {
        this.actionState = actionState;
        if (actionState == TrollActionState.STAND_LEFT) {
            animator.setImageNames(standLeft);
        } else if (actionState == TrollActionState.AXE_CHOP_LEFT) {
            animator.setImageNames(axeChopLeft);
        } else if (actionState == TrollActionState.WALK_LEFT) {
            animator.setImageNames(walkLeft);
        } else if (actionState == TrollActionState.ROAR_LEFT) {
            animator.setImageNames(roarLeft);
         } else if (actionState == TrollActionState.WALK_RIGHT) {
            animator.setImageNames(walkRight);
         } else if (actionState == TrollActionState.STAND_RIGHT) {
            animator.setImageNames(standRight);
        } else if (actionState == TrollActionState.AXE_CHOP_RIGHT) {
            animator.setImageNames(axeChopRight);
         } else if (actionState == TrollActionState.ROAR_RIGHT) {
            animator.setImageNames(roarRight);
        }
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructors">
    {
        BufferedImage spritemap = (BufferedImage) ResourceTools.loadImageFromResource("resources/troll_sprite_map.jpeg");
        BufferedImage spritemap2 = (BufferedImage) ResourceTools.loadImageFromResource("resources/troll_sprites_right.png");
        imageManager = new ImageManager();
        int trollWidth = 66;
        int trollHeight = 90;
        
        standLeft = new ArrayList<>();
        String stand01 = "stand01";
        standLeft.add(stand01);
        imageManager.addImage(stand01, spritemap.getSubimage(0, 5, trollWidth-2, trollHeight));
        
        standRight = new ArrayList<>();
        String standRight01 = "standRight01";
        standRight.add(standRight01);
        imageManager.addImage(standRight01, spritemap2.getSubimage(438, 5, trollWidth-8, trollHeight));
        
        walkLeft = new ArrayList<>();
        
        String walkLeft01 = "walkLeft01";
        String walkLeft02 = "walkLeft02";
        //String walkLeft03 = "walkLeft03";
        //String walkLeft04 = "walkLeft04";
        //String walkLeft05 = "walkLeft05";
        
        walkLeft.add("walkLeft01");
        walkLeft.add("walkLeft02");

        
        
      imageManager.addImage(walkLeft01, spritemap.getSubimage(0, 286, trollWidth-2, trollHeight));
      
      imageManager.addImage(walkLeft02, spritemap.getSubimage(60,286, trollWidth-1, trollHeight));
      
      walkRight = new ArrayList<>();
        
        String walkRight01 = "walkRight01";
        String walkRight02 = "walkRight02";
        //String walkLeft03 = "walkLeft03";
        //String walkLeft04 = "walkLeft04";
        //String walkLeft05 = "walkLeft05";
        
        walkRight.add("walkRight01");
        walkRight.add("walkRight02");

        
        
      imageManager.addImage(walkRight01, spritemap2.getSubimage(374,290, trollWidth-5, trollHeight));
      
      imageManager.addImage(walkRight02, spritemap2.getSubimage(436,290, trollWidth-10, trollHeight));

        
        
        
        axeChopLeft = new ArrayList<>();
        String axeChop01 = "axeChop01";
        String axeChop02 = "axeChop02";
        String axeChop03 = "axeChop03";
        String axeChop04 = "axeChop04";
        String axeChop05 = "axeChop05";
        String axeChop06 = "axeChop06";
        String axeChop07 = "axeChop07";
        String axeChop08 = "axeChop08";

        

       axeChopLeft.add(axeChop01);
       axeChopLeft.add(axeChop02);
       axeChopLeft.add(axeChop03);
       axeChopLeft.add(axeChop04);
       axeChopLeft.add(axeChop05);
       axeChopLeft.add(axeChop06);
       axeChopLeft.add(axeChop07);
       axeChopLeft.add(axeChop08);

      
      imageManager.addImage(axeChop01, spritemap.getSubimage(261, 5, trollWidth-3, trollHeight));
      
      imageManager.addImage(axeChop02, spritemap.getSubimage(319,5, trollWidth-2, trollHeight));
      
      imageManager.addImage(axeChop03, spritemap.getSubimage(386, 5, trollWidth, trollHeight));
      
      imageManager.addImage(axeChop04, spritemap.getSubimage(6,100, trollWidth-20, trollHeight));
      
      imageManager.addImage(axeChop05, spritemap.getSubimage(6,100, trollWidth-20, trollHeight));
      
      imageManager.addImage(axeChop06, spritemap.getSubimage(170, 95, trollWidth+30, trollHeight+10));
      
      imageManager.addImage(axeChop07, spritemap.getSubimage(277, 100, trollWidth+22, trollHeight));
      
      imageManager.addImage(axeChop08, spritemap.getSubimage(277, 100, trollWidth+22, trollHeight));
      
      axeChopRight = new ArrayList<>();

        String axeChopRight01 = "axeChopRight01";
        String axeChopRight02 = "axeChopRight02";
        String axeChopRight03 = "axeChopRight03";
        String axeChopRight04 = "axeChopRight04";
        String axeChopRight05 = "axeChopRight05";
        String axeChopRight06 = "axeChopRight06";
        String axeChopRight07 = "axeChopRight07";
        String axeChopRight08 = "axeChopRight08";

        

       axeChopRight.add(axeChopRight01);
       axeChopRight.add(axeChopRight02);
       axeChopRight.add(axeChopRight03);
       axeChopRight.add(axeChopRight04);
       axeChopRight.add(axeChopRight05);
       axeChopRight.add(axeChopRight06);
       axeChopRight.add(axeChopRight07);
       axeChopRight.add(axeChopRight08);

      
      imageManager.addImage(axeChopRight01, spritemap2.getSubimage(184,5, trollWidth-15, trollHeight));
      
      imageManager.addImage(axeChopRight02, spritemap2.getSubimage(118,5, trollWidth, trollHeight));
      
      imageManager.addImage(axeChopRight03, spritemap2.getSubimage(39, 5, trollWidth, trollHeight));
      
      imageManager.addImage(axeChopRight04, spritemap2.getSubimage(445,100, trollWidth-15, trollHeight));
      
      imageManager.addImage(axeChopRight05, spritemap2.getSubimage(445,100, trollWidth-15, trollHeight));
      
      imageManager.addImage(axeChopRight06, spritemap2.getSubimage(228, 95, trollWidth+35, trollHeight+10));
      
      imageManager.addImage(axeChopRight07, spritemap2.getSubimage(126, 100, trollWidth+35, trollHeight));
      
      imageManager.addImage(axeChopRight08, spritemap2.getSubimage(126, 100, trollWidth+35, trollHeight));

        roarLeft = new ArrayList<>();
        
        String roarLeft01 = "roarLeft01";
        String roarLeft02 = "roarLeft02";
        String roarLeft03 = "roarLeft03";
        String roarLeft04 = "roarLeft04";
        

       roarLeft.add(roarLeft01);
       roarLeft.add(roarLeft02);
       roarLeft.add(roarLeft03);
       roarLeft.add(roarLeft04);
       
      imageManager.addImage(roarLeft01, spritemap.getSubimage(362, 282, trollWidth+2, trollHeight+10));
      
      imageManager.addImage(roarLeft02, spritemap.getSubimage(432,282, trollWidth+2, trollHeight+10));
      
      imageManager.addImage(roarLeft03, spritemap.getSubimage(362, 282, trollWidth+2, trollHeight+10));
      
      imageManager.addImage(roarLeft04, spritemap.getSubimage(432,282, trollWidth+2, trollHeight+10));
      
      roarRight = new ArrayList<>();
      
        String roarRight01 = "roarRight01";
        String roarRight02 = "roarRight02";
        String roarRight03 = "roarRight03";
        String roarRight04 = "roarRight04";
        

       roarRight.add(roarRight01);
       roarRight.add(roarRight02);
       roarRight.add(roarRight03);
       roarRight.add(roarRight04);
       
      imageManager.addImage(roarRight01, spritemap2.getSubimage(65, 282, trollWidth-1, trollHeight+10));
      
      imageManager.addImage(roarRight02, spritemap2.getSubimage(3,282, trollWidth-1, trollHeight+10));
      
      imageManager.addImage(roarRight03, spritemap2.getSubimage(65, 282, trollWidth-1, trollHeight+10));
      
      imageManager.addImage(roarRight04, spritemap2.getSubimage(3,282, trollWidth-1, trollHeight+10));
      

        animator = new Animator(imageManager, axeChopLeft, 85);
        
        
        
        
    }

    public Troll(Point position, Velocity velocity) {
        super(position, velocity);
    }
//</editor-fold>

}

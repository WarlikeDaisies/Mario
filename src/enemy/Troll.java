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
    private final ArrayList<String> standLeft, walkLeft, axeChopLeft, roarLeft;
    
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
        }
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructors">
    {
        BufferedImage spritemap = (BufferedImage) ResourceTools.loadImageFromResource("resources/troll_sprite_map.jpeg");
        imageManager = new ImageManager();
        int trollWidth = 66;
        int trollHeight = 90;
        
        standLeft = new ArrayList<>();
        String stand01 = "stand01";
        standLeft.add(stand01);
        imageManager.addImage(stand01, spritemap.getSubimage(0, 5, trollWidth-2, trollHeight));
        
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


        roarLeft = new ArrayList<>();

        animator = new Animator(imageManager, axeChopLeft, 75);
       
        
    }

    public Troll(Point position, Velocity velocity) {
        super(position, velocity);
    }
//</editor-fold>

}

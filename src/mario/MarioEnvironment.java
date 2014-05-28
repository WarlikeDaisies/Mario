/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mario;

import environment.Environment;
import image.Animator;
import image.AnimatorEventListenerIntf;
import image.ImageManager;
import image.ResourceTools;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Victor
 */
class MarioEnvironment extends Environment implements MouseMotionListener, AnimatorEventListenerIntf {

    private BufferedImage heroSheet, heroRun01, heroRun02, heroRun03, heroRun04, heroRun05, heroRun06;
    private static final int HERO_HEIGHT = 66;
    private static final int HERO_WIDTH = 50;
    private static final int HERO_WIDTH2 = 60;
    private Animator animator;
    private ImageManager imageManager;
    private ArrayList<String> leftRunImages;
    private BufferedImage heroSheet2, heroRun11, heroRun12, heroRun13, heroRun14, heroRun15, heroRun16;
    private ArrayList<String> rightRunImages;
    private ImageManager imageManager2;
    private Animator animator2;
        
    @Override
    public void initializeEnvironment() {

        heroSheet = (BufferedImage) ResourceTools.loadImageFromResource("resources/hero_sprite_sheet_left_alpha.png");
        heroRun01 = heroSheet.getSubimage(10, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun02 = heroSheet.getSubimage(110, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun03 = heroSheet.getSubimage(210, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun04 = heroSheet.getSubimage(310, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun05 = heroSheet.getSubimage(410, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun06 = heroSheet.getSubimage(510, 118, HERO_WIDTH, HERO_HEIGHT);  
        
        heroSheet = (BufferedImage) ResourceTools.loadImageFromResource("resources/hero_sprite_sheet_left_alpha.png");
        heroRun01 = heroSheet.getSubimage(10, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun02 = heroSheet.getSubimage(110, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun03 = heroSheet.getSubimage(210, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun04 = heroSheet.getSubimage(310, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun05 = heroSheet.getSubimage(410, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun06 = heroSheet.getSubimage(510, 118, HERO_WIDTH, HERO_HEIGHT); 
        
        heroSheet = (BufferedImage) ResourceTools.loadImageFromResource("resources/hero_sprite_sheet_right_alpha.png");
        heroRun11 = heroSheet.getSubimage(34, 119, HERO_WIDTH2, HERO_HEIGHT);
        heroRun12 = heroSheet.getSubimage(136, 119, HERO_WIDTH2, HERO_HEIGHT);
        heroRun13 = heroSheet.getSubimage(236, 119, HERO_WIDTH2, HERO_HEIGHT);
        heroRun14 = heroSheet.getSubimage(333, 119, HERO_WIDTH2, HERO_HEIGHT);
        heroRun15 = heroSheet.getSubimage(430, 119, HERO_WIDTH2, HERO_HEIGHT);
        heroRun16 = heroSheet.getSubimage(525, 119, HERO_WIDTH2, HERO_HEIGHT); 
        
        heroSheet = (BufferedImage) ResourceTools.loadImageFromResource("resources/hero_sprite_sheet_right_alpha.png");
        heroRun11 = heroSheet.getSubimage(34, 119, HERO_WIDTH2, HERO_HEIGHT);
        heroRun12 = heroSheet.getSubimage(136, 119, HERO_WIDTH2, HERO_HEIGHT);
        heroRun13 = heroSheet.getSubimage(236, 119, HERO_WIDTH2, HERO_HEIGHT);
        heroRun14 = heroSheet.getSubimage(333, 119, HERO_WIDTH2, HERO_HEIGHT);
        heroRun15 = heroSheet.getSubimage(430, 119, HERO_WIDTH2, HERO_HEIGHT);
        heroRun16 = heroSheet.getSubimage(525, 119, HERO_WIDTH2, HERO_HEIGHT);
        
//        heroRun06.
        String leftRun01 = "LeftRun01";
        String leftRun02 = "LeftRun02";
        String leftRun03 = "LeftRun03";
        String leftRun04 = "LeftRun04";
        String leftRun05 = "LeftRun05";
        String leftRun06 = "LeftRun06";
        
        String rightRun11 = "RightRun11";
        String rightRun12 = "RightRun12";
        String rightRun13 = "RightRun13";
        String rightRun14 = "RightRun14";
        String rightRun15 = "RightRun15";
        String rightRun16 = "RightRun16";


        leftRunImages = new ArrayList<>();
        leftRunImages.add(leftRun01);
        leftRunImages.add(leftRun02);
        leftRunImages.add(leftRun03);
        leftRunImages.add(leftRun04);
        leftRunImages.add(leftRun05);
        leftRunImages.add(leftRun06);
        
        rightRunImages = new ArrayList<>();
        rightRunImages.add(rightRun11);
        rightRunImages.add(rightRun12);
        rightRunImages.add(rightRun13);
        rightRunImages.add(rightRun14);
        rightRunImages.add(rightRun15);
        rightRunImages.add(rightRun16);   
        
        imageManager = new ImageManager();
        imageManager.addImage(leftRun01, heroRun01);
        imageManager.addImage(leftRun02, heroRun02);
        imageManager.addImage(leftRun03, heroRun03);
        imageManager.addImage(leftRun04, heroRun04);
        imageManager.addImage(leftRun05, heroRun05);
        imageManager.addImage(leftRun06, heroRun06);
        
//        imageManager2 = new ImageManager();
        imageManager.addImage(rightRun11, heroRun11);
        imageManager.addImage(rightRun12, heroRun12);
        imageManager.addImage(rightRun13, heroRun13);
        imageManager.addImage(rightRun14, heroRun14);
        imageManager.addImage(rightRun15, heroRun15);
        imageManager.addImage(rightRun16, heroRun16);
                
        animator = new Animator(imageManager, leftRunImages, 125, this);

//        animator2 = new Animator(imageManager2, rightRunImages, 125, this);
       heroSheet2 = (BufferedImage) ResourceTools.loadImageFromResource("resources/hero_sprite_sheet_right_alpha.jpg");

        this.addMouseMotionListener(this);
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            animator.setImageNames(rightRunImages);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            animator.setImageNames(leftRunImages);
        }
    }

    public void keyReleasedHmoyammmmandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        graphics.drawImage(heroSheet, 0, 0, this);

   //     graphics.drawImage(heroRun01, 620, 30, this);
   //     graphics.drawImage(heroRun02, 620, 100, this);
   //     graphics.drawImage(heroRun03, 620, 170, this);
   //     graphics.drawImage(heroRun04, 620, 240, this);
   //     graphics.drawImage(heroRun05, 620, 310, this);
   //     graphics.drawImage(heroRun06, 620, 380, this);
   //     graphics.drawImage(heroSheet2, 0, 0, this);
   //     graphics.drawImage(heroRun11, 620, 30, this);
   //     graphics.drawImage(heroRun12, 620, 100, this);
   //     graphics.drawImage(heroRun13, 620, 170, this);
   //     graphics.drawImage(heroRun14, 620, 240, this);
   //     graphics.drawImage(heroRun15, 620, 310, this);
   //     graphics.drawImage(heroRun16, 620, 380, this);
        
        if (animator != null) {
            graphics.drawImage(animator.getCurrentImage(), 620, 420, this);
//        if (animator2 != null) {
//            graphics.drawImage(animator2.getCurrentImage(), 620, 500, this);
//        }    
        }
    }

//<editor-fold defaultstate="collapsed" desc="MouseMotionListener Interface">
    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("mouse position = " + e.getPoint().toString());
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="AnimatorEventListenerIntf">
    @Override
    public void imageChange(Animator animator) {
        
    }
//</editor-fold>

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }
}

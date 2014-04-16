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
    private Animator animator;
    private ImageManager imageManager;
    private ArrayList<String> leftRunImages;
        
    @Override
    public void initializeEnvironment() {

        heroSheet = (BufferedImage) ResourceTools.loadImageFromResource("resources/hero_sprite_sheet_left_alpha.jpg");
        heroRun01 = heroSheet.getSubimage(10, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun02 = heroSheet.getSubimage(110, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun03 = heroSheet.getSubimage(210, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun04 = heroSheet.getSubimage(310, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun05 = heroSheet.getSubimage(410, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun06 = heroSheet.getSubimage(510, 118, HERO_WIDTH, HERO_HEIGHT);
        
//        heroRun06.
        String leftRun01 = "LeftRun01";
        String leftRun02 = "LeftRun02";
        String leftRun03 = "LeftRun03";
        String leftRun04 = "LeftRun04";
        String leftRun05 = "LeftRun05";
        String leftRun06 = "LeftRun06";

        leftRunImages = new ArrayList<>();
        leftRunImages.add(leftRun01);
        leftRunImages.add(leftRun02);
        leftRunImages.add(leftRun03);
        leftRunImages.add(leftRun04);
        leftRunImages.add(leftRun05);
        leftRunImages.add(leftRun06);
        
        imageManager = new ImageManager();
        imageManager.addImage(leftRun01, heroRun01);
        imageManager.addImage(leftRun02, heroRun02);
        imageManager.addImage(leftRun03, heroRun03);
        imageManager.addImage(leftRun04, heroRun04);
        imageManager.addImage(leftRun05, heroRun05);
        imageManager.addImage(leftRun06, heroRun06);

        animator = new Animator(imageManager, leftRunImages, 125, this);

        this.addMouseMotionListener(this);
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
        graphics.drawImage(heroSheet, 0, 0, this);

        graphics.drawImage(heroRun01, 620, 30, this);
        graphics.drawImage(heroRun02, 620, 100, this);
        graphics.drawImage(heroRun03, 620, 170, this);
        graphics.drawImage(heroRun04, 620, 240, this);
        graphics.drawImage(heroRun05, 620, 310, this);
        graphics.drawImage(heroRun06, 620, 380, this);

        if (animator != null) {
            graphics.drawImage(animator.getCurrentImage(), 620, 440, this);
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
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mario;

import environment.Velocity;
import image.Animator;
import image.ImageManager;
import image.ResourceTools;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Adriaan D
 */
public class Hero extends AnimatedActor {

    public Hero(Point position, Velocity velocity) {
        super(position, velocity);
    }

    @Override
    public void initializeImages() {
        heroSheet = (BufferedImage) ResourceTools.loadImageFromResource("resources/hero_sprite_sheet_left_alpha.png");
        heroRun01 = heroSheet.getSubimage(10, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun02 = heroSheet.getSubimage(110, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun03 = heroSheet.getSubimage(210, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun04 = heroSheet.getSubimage(310, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun05 = heroSheet.getSubimage(410, 118, HERO_WIDTH, HERO_HEIGHT);
        heroRun06 = heroSheet.getSubimage(510, 118, HERO_WIDTH, HERO_HEIGHT);  
        
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


//        leftRunImages = new ArrayList<>();
        
        
        getLeftWalkImages().add(leftRun01);
        getLeftWalkImages().add(leftRun02);
        getLeftWalkImages().add(leftRun03);
        getLeftWalkImages().add(leftRun04);
        getLeftWalkImages().add(leftRun05);
        getLeftWalkImages().add(leftRun06);
        

        getRightWalkImages().add(rightRun11);
        getRightWalkImages().add(rightRun12);
        getRightWalkImages().add(rightRun13);
        getRightWalkImages().add(rightRun14);
        getRightWalkImages().add(rightRun15);
        getRightWalkImages().add(rightRun16);   

        getImageManager().addImage(leftRun01, heroRun01);
        getImageManager().addImage(leftRun02, heroRun02);
        getImageManager().addImage(leftRun03, heroRun03);
        getImageManager().addImage(leftRun04, heroRun04);
        getImageManager().addImage(leftRun05, heroRun05);
        getImageManager().addImage(leftRun06, heroRun06);
        
//        getImageManager()2 = new ImageManager();
        getImageManager().addImage(rightRun11, heroRun11);
        getImageManager().addImage(rightRun12, heroRun12);
        getImageManager().addImage(rightRun13, heroRun13);
        getImageManager().addImage(rightRun14, heroRun14);
        getImageManager().addImage(rightRun15, heroRun15);
        getImageManager().addImage(rightRun16, heroRun16);
                
//        animator = new Animator(getImageManager(), leftRunImages, 125, this);
        getAnimator().setImageNames(getLeftWalkImages());

//        animator2 = new Animator(getImageManager()2, getRightWalkImages(), 125, this);
//       heroSheet2 = (BufferedImage) ResourceTools.loadImageFromResource("resources/hero_sprite_sheet_right_alpha.jpg");

    }
    
    private BufferedImage heroSheet, heroRun01, heroRun02, heroRun03, heroRun04, heroRun05, heroRun06;
    private BufferedImage heroSheet2, heroRun11, heroRun12, heroRun13, heroRun14, heroRun15, heroRun16;
    private static final int HERO_HEIGHT = 66;
    private static final int HERO_WIDTH = 50;
    private static final int HERO_WIDTH2 = 60;
}
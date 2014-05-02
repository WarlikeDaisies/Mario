/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mario;

/**
 *
 * @author Dr. Stacey McDonald
 */
import EnemyPackage.EnemyImageMap;
import environment.Environment;
import static environment.Environment.DEFAULT_TIMER_PERIOD_MS;
import static environment.Environment.MINIMUM_TIMER_PERIOD_MS;
import image.Animator;
import image.AnimatorEventListenerIntf;
import image.ImageManager;
import image.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author kevin.lawrence
 */
class AnimationEnvironment extends Environment 
        implements AnimatorEventListenerIntf, MouseMotionListener {

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.printf("Mouse Position [%d, %d]\n", e.getLocationOnScreen().x, e.getLocationOnScreen().y);
    }

    public static enum State {

        RIGHT_STAND,LEFT_STAND, LEFT_WALK, RIGHT_WALK
    };

    ImageManager imageManager;
    Animator animator;
    ArrayList<String> frontWalkImages, backWalkImages, leftWalkImages, rightWalkImages, standImages;
    BufferedImage image, walk1, walk2, walk3, stand;
    private State state = State.RIGHT_STAND;

    @Override
    public void initializeEnvironment() {
        this.setBackground(Color.BLACK);

        EnemyImageMap mim = new EnemyImageMap();

        image = (BufferedImage) ResourceTools.loadImageFromResource("resources/mario8d.png");

        walk1 = image.getSubimage(0, 0, 28, 40);
        walk2 = image.getSubimage(29, 0, 28, 40);
        walk3 = image.getSubimage(57, 0, 28, 40);

        String leftWalk01 = "LeftWalk01";
        String leftWalk02 = "LeftWalk02";
        String leftWalk03 = "LeftWalk03";

        String rightWalk01 = "RightWalk01";
        String rightWalk02 = "RightWalk02";
        String rightWalk03 = "RightWalk03";

        String rightStand = "RightStand";
        String leftStand = "LeftStand";

        imageManager = new ImageManager();

        imageManager.addImage(leftWalk01, image.getSubimage(0, 41, 28, 40));
        imageManager.addImage(leftWalk02, image.getSubimage(29, 41, 28, 40));
        imageManager.addImage(leftWalk03, image.getSubimage(57, 41, 28, 40));

        imageManager.addImage(rightWalk01, image.getSubimage(0, 81, 28, 40));
        imageManager.addImage(rightWalk02, image.getSubimage(29, 81, 28, 40));
        imageManager.addImage(rightWalk03, image.getSubimage(57, 81, 28, 40));


//        imageManager.addImage(leftWalk01, image.getSubimage(85, 0, 28, 40));
//        imageManager.addImage(leftWalk02, image.getSubimage(113, 0, 28, 40));
//        imageManager.addImage(leftWalk03, image.getSubimage(141, 0, 28, 40));
//
//        imageManager.addImage(rightWalk01, image.getSubimage(253, 0, 28, 40));
//        imageManager.addImage(rightWalk02, image.getSubimage(281, 0, 28, 40));
//        imageManager.addImage(rightWalk03, image.getSubimage(309, 0, 20, 40));
        imageManager.addImage(leftStand, image.getSubimage(29, 0, 28, 40));
        imageManager.addImage(rightStand, image.getSubimage(29, 0, 28, 40));


        leftWalkImages = new ArrayList<>();
        leftWalkImages.add(leftWalk01);
        leftWalkImages.add(leftWalk02);
        leftWalkImages.add(leftWalk03);

        rightWalkImages = new ArrayList<>();
        rightWalkImages.add(rightWalk01);
        rightWalkImages.add(rightWalk02);
        rightWalkImages.add(rightWalk03);

        standImages = new ArrayList<>();
        standImages.add(rightStand);
        standImages.add(leftStand);

        walk1 = image.getSubimage(0, 0, 28, 40);
        walk2 = image.getSubimage(29, 0, 28, 40);
        walk3 = image.getSubimage(57, 0, 28, 40);

        animator = new Animator(imageManager, frontWalkImages, 250, this);

        this.state = State.RIGHT_STAND;
        setState(State.RIGHT_STAND);
        addMouseMotionListener(this);
    }

    @Override
    public void timerTaskHandler() {
//        System.out.println(this.getTimerPeriodMS());
//        Toolkit.getDefaultToolkit().beep(); 
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if  (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            setState(State.RIGHT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            setState(State.LEFT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            setState(State.LEFT_STAND);
             } else if (e.getKeyCode() == KeyEvent.VK_D) {
            setState(State.RIGHT_STAND);
        } else if (e.getKeyCode() == KeyEvent.VK_PLUS) {
            this.setTimerPeriodMS(MINIMUM_TIMER_PERIOD_MS);
        } else if (e.getKeyCode() == KeyEvent.VK_MINUS) {
            this.setTimerPeriodMS(DEFAULT_TIMER_PERIOD_MS);
        } else if (e.getKeyCode() == KeyEvent.VK_DELETE) {
            this.cancelTimerEvents();
            this.setBackground(Color.red);
        }
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
//        setState(State.STAND);
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, 0, 0, this);
            graphics.drawImage(walk1, 400, 0, this);
            graphics.drawImage(walk2, 400, 50, this);
            graphics.drawImage(walk3, 400, 100, this);
        }

        if (animator != null) {
            graphics.drawImage(animator.getCurrentImage(), 450, 50, this);
//            System.out.println("drawing");
        }
    }

    /**
     * @return the state
     */
    public State getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(State state) {
        this.state = state;

        switch (this.state) {
            case LEFT_STAND:
                animator.setImageNames(standImages);
                break;
            case RIGHT_STAND:
               animator.setImageNames(standImages);
               break;
           
            case RIGHT_WALK:
                animator.setImageNames(rightWalkImages);
                break;
            case LEFT_WALK:
                animator.setImageNames(leftWalkImages);
                break;
        }
    }

//<editor-fold defaultstate="collapsed" desc="AnimatorEventListenerIntf ">
    @Override
    public void imageChange(Animator animator) {
//        if (state == State.FRONT_WALK) {
//            Toolkit.getDefaultToolkit().beep();
//        }
    }
//</editor-fold>

}

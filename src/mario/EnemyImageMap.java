/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mario;

import image.ResourceTools;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import image.ImageManager;
import image.ResourceTools;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.HashMap;


/**
 *
 * @author Dr. Stacey McDonald
 */
public class EnemyImageMap {



    public static final String LEFT_STAND = "LeftStand";
    public static final String RIGHT_STAND = "RightStand";
    
    public static final String LEFT_WALK_01 = "LeftWalk01";
    public static final String LEFT_WALK_02 = "LeftWalk02";
    public static final String LEFT_WALK_03 = "LeftWalk03";

    public static final String RIGHT_WALK_01 = "RighttWalk01";
    public static final String RIGHT_WALK_02 = "RighttWalk02";
    public static final String RIGHT_WALK_03 = "RighttWalk03";


    private HashMap<String, Point> subImageMap;
    private BufferedImage EnemyImageMap;// = (BufferedImage) ResourceTools.loadImageFromResource("resources/mario8d.png");

    public static final int IMAGE_HEIGHT = 40;
    public static final int IMAGE_WIDTH = 28;
    
    {
        EnemyImageMap = (BufferedImage) ResourceTools.loadImageFromResource("resources/Enemy.jpeg");
    
        subImageMap = new HashMap<String, Point>();

        subImageMap.put(LEFT_WALK_01, new Point(0, 41));
        subImageMap.put(LEFT_WALK_02, new Point(29, 41));
        subImageMap.put(LEFT_WALK_03, new Point(57, 41));

        subImageMap.put(RIGHT_WALK_01, new Point(0, 81));
        subImageMap.put(RIGHT_WALK_02, new Point(29, 81));
        subImageMap.put(RIGHT_WALK_03, new Point(57, 81));

        subImageMap.put(LEFT_STAND, new Point(29, 81));
        subImageMap.put(RIGHT_STAND, new Point(29, 121));
    }
    
    public EnemyImageMap(){ }
    
    public Image getImage(String identifier){
        Point location = subImageMap.get(identifier);
        return EnemyImageMap.getSubimage(location.x, location.y, IMAGE_WIDTH, IMAGE_HEIGHT);
    }
    
}

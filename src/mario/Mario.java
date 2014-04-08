/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mario;

import audio.AudioPlayer;
import environment.ApplicationStarter;

/**
 *
 * @author Victor
 */
public class Mario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        AudioPlayer.play("/resources/theme.wav");
        ApplicationStarter.run("Mario", new MarioEnvironment() );
    }
}

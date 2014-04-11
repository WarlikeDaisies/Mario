/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mario;

import environment.ApplicationStarter;

/**
 *
 * @author Da Beer bomb _l_ you
 */
public class Mario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        ApplicationStarter.run("Mario", new MarioEnvironment() );
    }
}

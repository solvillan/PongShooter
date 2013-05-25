package se.doverfelt.pongShooter;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 * Created with IntelliJ IDEA.
 * User: Rickard
 * Date: 2013-05-24
 * Time: 22:52
 * To change this template use File | Settings | File Templates.
 */
public class Util {

    private static Image projectileImage;
    private static Image playerImage;

    public static void createProjectileImage() {
        try {
            Image opt = new Image(20, 20);

            Graphics g2 = opt.getGraphics();

            g2.setColor(Color.red);
            g2.fillRect(0, 0, 20, 20);
            g2.flush();

            projectileImage = opt;

        } catch (SlickException e) {
            e.printStackTrace();
        }

    }

    public static Image getProjectileImage() {
        return projectileImage;
    }

    public static void createPlayerImage() {
        try {
            Image opt = new Image(40, 60);

            Graphics g2 = opt.getGraphics();

            g2.fillRect(0, 0, 20, 60);
            g2.fillRect(20, 20, 20, 20);

            g2.flush();

            playerImage = opt;

        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    public static Image getPlayerImage() {
        return playerImage;
    }

}

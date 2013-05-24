package se.doverfelt.pongShooter.entities;

import it.randomtower.engine.entity.Entity;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 * Created with IntelliJ IDEA.
 * User: Rickard
 * Date: 2013-05-24
 * Time: 21:16
 * To change this template use File | Settings | File Templates.
 */
public class Projectile extends Entity {

    private float speed = 0.75f;

    public Projectile(float x, float y) {

        super(x, y);

        this.setGraphic(createImage());


    }

    private Image createImage(){

        try {
            Image opt = new Image(20, 20);

            Graphics g2 = opt.getGraphics();

            g2.setColor(Color.red);
            g2.fillRect(0, 0, 20, 20);
            g2.flush();

            return opt;

        } catch (SlickException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void move(int delta) {
        this.x = this.x + (speed * delta);
    }

}

package se.doverfelt.pongShooter.entities;

import it.randomtower.engine.entity.Entity;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import se.doverfelt.pongShooter.Util;

/**
 * Created with IntelliJ IDEA.
 * User: Rickard
 * Date: 2013-05-24
 * Time: 21:16
 * To change this template use File | Settings | File Templates.
 */
public class Projectile extends Entity {

    private float speed = 0.5f;
    private boolean player1;


    public Projectile(float x, float y, boolean player1) {

        super(x, y);

        this.player1 = player1;

        this.setGraphic(Util.getProjectileImage());


    }

    public void move(int delta) {
        if (player1) {
            this.x = this.x + (speed * delta);
        } else {
            this.x = this.x - (speed * delta);
        }

    }

}

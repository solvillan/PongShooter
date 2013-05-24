package se.doverfelt.pongShooter.entities;

import it.randomtower.engine.entity.Entity;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;

/**
 * Created with IntelliJ IDEA.
 * User: Rickard
 * Date: 2013-05-24
 * Time: 20:58
 * To change this template use File | Settings | File Templates.
 */
public class Player extends Entity {

    private boolean playerOne;

    public Player(float x, float y, Image img, boolean playerOne) {
        super(x, y, img);
        this.playerOne = playerOne;
    }

    public void move(float dx, float dy, int delta) {

        this.x = this.x + (dx * delta);
        this.y = this.y + (dy * delta);

    }

    public void updatePlayer(GameContainer gc, int delta) {
        Input input = gc.getInput();

        if (playerOne) {
            if (input.isKeyDown(Input.KEY_W)) {
                move(0, -1, delta);
            } else if (input.isKeyDown(Input.KEY_S)) {
                move(0, 1, delta);
            }

            if (input.isKeyPressed(Input.KEY_SPACE)) {
                fire();
            }
        } else {
            if (input.isKeyDown(Input.KEY_UP)) {
                move(0, -1, delta);
            } else if (input.isKeyDown(Input.KEY_DOWN)) {
                move(0, 1, delta);
            }

            if (input.isKeyPressed(Input.KEY_RCONTROL)) {
                fire();
            }
        }
    }

    private void fire() {
        this.world.add(new Projectile(this.x, this.y));
    }

}

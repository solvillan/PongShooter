package se.doverfelt.pongShooter;

import it.randomtower.engine.World;
import it.randomtower.engine.entity.Entity;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import se.doverfelt.pongShooter.entities.Player;
import se.doverfelt.pongShooter.entities.Projectile;

/**
 * Created with IntelliJ IDEA.
 * User: Joel
 * Date: 2013-05-24
 * Time: 20:00
 * To change this template use File | Settings | File Templates.
 */
public class WorldGame extends World {

    private Player player1;
    private Player player2;

    public WorldGame(int id, GameContainer gc) {
        super(id, gc);

        Util.createProjectileImage();
        Util.createPlayerImage();


        player1 = new Player(10, 10, Util.getPlayerImage(), true);
        player2 = new Player(gc.getWidth() - 50, 10, Util.getPlayerImage().getFlippedCopy(true, false), false);

        add(player1);
        add(player2);

    }

    @Override
    public void render(GameContainer gc, StateBasedGame stateBasedGame, Graphics g) throws SlickException{
        super.render(gc, stateBasedGame, g);
        g.drawString("FPS: " + gc.getFPS(), 10, 10);
        g.drawString("Entities: " + this.getEntities().size(), 10, 20);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        super.update(gc, sbg, delta);

        player1.updatePlayer(gc, delta);
        player2.updatePlayer(gc, delta);

        for (Entity e : this.getEntities()) {
            if (e instanceof Projectile) {
                Projectile p = (Projectile) e;
                p.move(delta);

                if (p.x > gc.getWidth()) {
                    remove(p);
                }
                if (p.x < -21) {
                    remove(p);
                }
            }
        }
    }

}

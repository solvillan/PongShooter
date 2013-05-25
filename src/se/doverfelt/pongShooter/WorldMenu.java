package se.doverfelt.pongShooter;

import it.randomtower.engine.World;
import it.randomtower.engine.entity.Entity;
import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.util.Log;
import se.doverfelt.pongShooter.entities.Player;
import se.doverfelt.pongShooter.entities.Projectile;

/**
 * Created with IntelliJ IDEA.
 * User: Rickard
 * Date: 2013-05-24
 * Time: 19:36
 * To change this template use File | Settings | File Templates.
 */
public class WorldMenu extends World {

    public WorldMenu(int id, GameContainer gc) {
        super(id, gc);
        Log.debug("Initialized WorldMenu!");

    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
        super.update(gc, sbg, delta);

        Input input = gc.getInput();

        if (input.isKeyPressed(Input.KEY_SPACE)) {
            sbg.enterState(Start.GAMEID);
        }

    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
        super.render(gc, sbg, g);
        g.setColor(Color.green);
        g.drawString("Menu!", gc.getWidth() / 2, gc.getHeight() / 2);
        g.drawString("FPS: " + gc.getFPS(), 10, 10);
        g.drawString("Entities: " + this.getEntities().size(), 10, 20);

    }

}

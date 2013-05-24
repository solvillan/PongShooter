package se.doverfelt.pongShooter;

import it.randomtower.engine.World;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.util.Log;

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



    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
        super.render(gc, sbg, g);
        g.drawString("Hello, world!", gc.getWidth() / 2, gc.getHeight() / 2);

    }

}

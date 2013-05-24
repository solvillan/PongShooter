package se.doverfelt.pongShooter;

import it.randomtower.engine.World;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created with IntelliJ IDEA.
 * User: Joel
 * Date: 2013-05-24
 * Time: 20:00
 * To change this template use File | Settings | File Templates.
 */
public class WorldGame extends World {
    public WorldGame(int id, GameContainer gc) {
        super(id, gc);
    }

    @Override
    public void render(GameContainer gc, StateBasedGame stateBasedGame, Graphics g) throws SlickException{
        super.render(gc, stateBasedGame, g);
        g.drawString("Hello World!", 300, 200);
    }
}

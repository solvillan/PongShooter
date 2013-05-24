package se.doverfelt.pongShooter;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created with IntelliJ IDEA.
 * User: Rickard
 * Date: 2013-05-24
 * Time: 19:15
 * To change this template use File | Settings | File Templates.
 */
public class Start extends StateBasedGame {

    public static int MENUID = 1;
    public static int GAMEID = 2;

    public Start(String name) {
        super(name);
    }

    public static void main(String[] args) {
        try {
            AppGameContainer appgc = new AppGameContainer(new Start("Pong 'em up!"));
            appgc.setDisplayMode(appgc.getScreenWidth() -100, appgc.getScreenHeight() -100, false);
            appgc.setTargetFrameRate(60);
            appgc.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initStatesList(GameContainer gameContainer) throws SlickException {
        addState(new WorldMenu(MENUID, gameContainer));
        addState(new WorldGame(GAMEID, gameContainer));
    }
}

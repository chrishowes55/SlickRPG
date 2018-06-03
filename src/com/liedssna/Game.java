package com.liedssna;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class Game extends BasicGameState {
	
	private SpriteSheet ss;
	
	public static final int ID = 2;
	
	private StateBasedGame game;

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		this.game = sbg;
		this.ss = new SpriteSheet(new Image("assets/oldman/stand.png"), 30, 45, 4, 5);
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString("GAME", 100, 100);
		g.drawImage(ss.getSubImage(0, 0), 200, 200);
		g.drawImage(ss.getSubImage(1, 0), 250, 250);
		g.drawImage(ss.getSubImage(2, 0), 300, 300);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int arg2) throws SlickException {
		if(gc.getInput().isMouseButtonDown(0)) {
			game.enterState(Splash.ID, new FadeOutTransition(), new FadeInTransition());
		}
	}

	@Override
	public int getID() {
		return Game.ID;
	}

}

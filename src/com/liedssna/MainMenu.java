package com.liedssna;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class MainMenu extends BasicGameState {
	
	//ID we return to class 'Application'
	public static final int ID = 1;
	
	private StateBasedGame game;

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		this.game = sbg;
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString("MENU", 100, 100);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int arg2) throws SlickException {
		if(gc.getInput().isMouseButtonDown(0)) {
			game.enterState(Game.ID, new FadeOutTransition(), new FadeInTransition());
		}
	}

	@Override
	public int getID() {
		return MainMenu.ID;
	}

}

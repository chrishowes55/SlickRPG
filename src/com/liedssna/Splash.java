package com.liedssna;

import java.awt.Color;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class Splash extends BasicGameState {
	
	public static final int ID = 0;
	
	private StateBasedGame game;

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		this.game = sbg;
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString("SPLASH", 100, 100);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int arg2) throws SlickException {
		if(gc.getInput().isMouseButtonDown(0)) {
			game.enterState(MainMenu.ID, new FadeOutTransition(), new FadeInTransition());
		}
	}

	@Override
	public int getID() {
		return Splash.ID;
	}

}

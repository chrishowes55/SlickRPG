package com.liedssna;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Application extends StateBasedGame {
	
	//Game state identifiers
	public static final int SPLASHSCREEN = 0, MAINMENU = 1, GAME = 2;
	
	//Appplication Properties
	public static final int WIDTH = 640, HEIGHT = 480, FPS = 60;
	public static final double VERSION = 1.0;
	
	public Application(String appName) {
		super(appName);
	}

	@Override
	public void initStatesList(GameContainer arg0) throws SlickException {
		this.addState(new Splash());
		this.addState(new MainMenu());
		this.addState(new Game());
	}

	public static void main(String[] args) {
		try {
			AppGameContainer app = new AppGameContainer(new Application("My Game v" + VERSION));
			app.setDisplayMode(WIDTH, HEIGHT, false);
			app.setTargetFrameRate(FPS);
			app.setShowFPS(true);
			app.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}

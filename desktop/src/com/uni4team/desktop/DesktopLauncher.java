package com.uni4team.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.uni4team.PlantsVSZombiesGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="ZombiesVSPlants";
		new LwjglApplication(new PlantsVSZombiesGame(), config);
	}
}

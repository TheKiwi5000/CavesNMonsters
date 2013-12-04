package pl.website.bcsn.cnm;

import pl.website.bcsn.cnm.gui.GameWindow;

public class Main {
	
	public static String version = "0.0.1";
	private static GameWindow gameWindow = new GameWindow("CavesNMonsters v"+version);
	
	public static void main(String[] args){
		Logger.fine("Starting");
		
		
		Logger.fine("Displaying window");
		gameWindow.setVisible(true);
		Logger.fine("Done");
	}
	
}

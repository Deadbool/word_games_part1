package core.consoleGames;

import core.common.Game;
import core.common.Player;
import core.topword.TopwordGame;

public class TopWord {
	
	public static void main(String[] args) {
		Player p1 = new ConsolePlayer("Player 1");
		Player p2 = new ConsolePlayer("Player 2");
		
		System.out.println("***** TopWord *****");
		
		Game topword = TopwordGame.newGame(p1, p2);
		
		topword.launch();
	}
}
package spring_boot;

public class app_gaming {
	
	
	public static void main(String[] args) {
		
		MarioGame marioGame = new MarioGame();
		GameRunner gameRunner = new GameRunner(marioGame);
		gameRunner.run();
		
		
	}

}

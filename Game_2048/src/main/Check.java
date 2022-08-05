package main;

public class Check {
	public static boolean game(int[][]game) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(game[i][j] ==0) {
					return true;
				}

			}
			
		}
		System.out.println("***************GAME OVER******************");
		return false;
		
	}
}

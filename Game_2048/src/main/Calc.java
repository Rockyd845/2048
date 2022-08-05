package main;

public class Calc {
	
	//INCREMENT
	static int[][] increment(int[][] game) {
		while (true) {
			int i = (int) (Math.random() * 100 % 4);
			int j = (int) (Math.random() * 100 % 4);
			if (game[i][j] == 0) {
				game[i][j] = 2;
				return game;
			}
		}
	}

	

}

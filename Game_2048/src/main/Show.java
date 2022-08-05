package main;

public class Show {
	public static void game(int[][] game) {
		System.out.println("---------------------");
		for (int i = 0; i < 4; i++) {
			System.out.print("| ");
			for (int j = 0; j < 4; j++) {
				if(game[i][j]==0)
					System.out.print( " "+" " + " | ");
				else
					System.out.print( " "+game[i][j] + " | ");


			}System.out.println();
			System.out.println("---------------------");
			
		}
	}
}

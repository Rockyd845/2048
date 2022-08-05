package main;
import java.util.Scanner;
public class Start {

	public static void game(int [][]game) {
		Scanner sc = new Scanner(System.in);
		game=Calc.increment(game);
		game=Calc.increment(game);
		Show.game(game);
		int score=0;
		boolean flag=true;
		while(flag) {
		System.out.println("Input Up(8) Down(2) Right(6) Left(4)");
		int ch=sc.nextInt();
		switch(ch) {
		case 2:
			game=Shift.down(game);
			game=Sum.down(game);
			game=Calc.increment(game);
			Show.game(game);
			score++;
			flag=Check.game(game);
			
			break;
		case 4:
			game=Shift.left(game);
			game=Sum.left(game);
			game=Calc.increment(game);
			Show.game(game);
			score++;
			flag=Check.game(game);
			break;
			
		case 6:
			game=Shift.right(game);
			game=Sum.right(game);
			game=Calc.increment(game);
			Show.game(game);
			score++;
			flag=Check.game(game);
			break;
			
		case 8:
			game=Shift.up(game);
			game=Sum.up(game);
			game=Calc.increment(game);
			Show.game(game);
			score++;
			flag=Check.game(game);
			break;
		
		default:
		}
		
		}
		System.out.println("Your Score: "+score);
		System.out.println("******************************************");
		sc.close();
		
	}
}

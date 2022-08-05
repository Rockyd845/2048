package main;

public class Shift {
	//RIGHT SHIFT
	static int[][] right(int[][] game) {
		int [][]temp =  { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };;
		for (int j=0;j<4;j++) {
			int n=0;
			for(int k=0;k<4;k++) {
					if(game[j][k]==0) {
						temp[j][n]=0;
						n++;
					}}
					for(int l=0;l<4;l++) {
						if(game[j][l]!=0) {
							temp[j][n]=game[j][l];
							n++;
					}
			}
		}
		return temp;
	}
	
	
	
	//LEFT SHIFT
	static int[][] left(int[][] game) {
		int [][]temp =  { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };;
		for (int j=0;j<4;j++) {
			int n=3;
			for(int k=3;k>=0;k--) {
					if(game[j][k]==0) {
						temp[j][n]=0;
						n--;
					}}
					for(int l=3;l>=0;l--) {
						if(game[j][l]!=0) {
							temp[j][n]=game[j][l];
							n--;
					}
			}
		}
		return temp;
	}
	
	
	
	//TOP SHIFT
	static int[][] up(int[][] game) {
		int [][]temp =  { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };;
		for (int j=0;j<4;j++) {
			int n=3;
			for(int k=3;k>=0;k--) {
					if(game[k][j]==0) {
						temp[n][j]=0;
						n--;
					}}
					for(int l=3;l>=0;l--) {
						if(game[l][j]!=0) {
							temp[n][j]=game[l][j];
							n--;
					}
			}
		}
		return temp;
	}
	
	//BOTTOM SHIFT
	
	static int[][] down(int[][] game) {
		int [][]temp =  { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };;
		for (int j=0;j<4;j++) {
			int n=0;
			for(int k=0;k<4;k++) {
					if(game[k][j]==0) {
						temp[n][j]=0;
						n++;
					}}
					for(int l=0;l<4;l++) {
						if(game[l][j]!=0) {
							temp[n][j]=game[l][j];
							n++;
					}
			}
		}
		return temp;
	}
	
}

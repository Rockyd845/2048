package main;

public class Sum {
	//SUM RIGHT
	static int[][] right(int[][] game) {
		int [][]temp =  { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		for(int i=0;i<4;i++) {
			if(game[i][0]==game[i][1]&&game[i][2]==game[i][3]) {
				temp[i][0]=0;
				temp[i][1]=0;
				temp[i][2]=game[i][0]+game[i][1];
				temp[i][3]=game[i][2]+game[i][3];	
			}
			else if(game[i][2]==game[i][3]) {
				temp[i][0]=0;
				temp[i][1]=game[i][0];
				temp[i][2]=game[i][1];
				temp[i][3]=game[i][2]+game[i][3];
			}else if(game[i][1]==game[i][2]) {
				temp[i][0]=0;
				temp[i][1]=game[i][0];
				temp[i][2]=game[i][1]+game[i][2];
				temp[i][3]=game[i][3];
			}else if(game[i][0]==game[i][1]) {
				temp[i][0]=0;
				temp[i][1]=game[i][0]+game[i][1];
				temp[i][2]=game[i][2];
				temp[i][3]=game[i][3];
			}else {
				temp[i][0]=game[i][0];
				temp[i][1]=game[i][1];
				temp[i][2]=game[i][2];
				temp[i][3]=game[i][3];
			}
		}
		
		return temp;
		
	}
	
	//SUM LEFT
		static int[][] left(int[][] game) {
			int [][]temp =  { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
			for(int i=0;i<4;i++) {
				if(game[i][0]==game[i][1]&&game[i][2]==game[i][3]) {
					temp[i][0]=game[i][0]+game[i][1];
					temp[i][1]=game[i][2]+game[i][3];
					temp[i][2]=0;
					temp[i][3]=0;	
				}else if(game[i][0]==game[i][1]) {
					temp[i][0]=game[i][0]+game[i][1];
					temp[i][1]=game[i][2];
					temp[i][2]=game[i][3];
					temp[i][3]=0;
				}else if(game[i][1]==game[i][2]) {
					temp[i][0]=game[i][0];
					temp[i][1]=game[i][1]+game[i][2];
					temp[i][2]=game[i][3];
					temp[i][3]=0;
				}
				else if(game[i][2]==game[i][3]) {
					temp[i][0]=game[i][0];
					temp[i][1]=game[i][1];
					temp[i][2]=game[i][2]+game[i][3];
					temp[i][3]=0;
				}else {
					temp[i][0]=game[i][0];
					temp[i][1]=game[i][1];
					temp[i][2]=game[i][2];
					temp[i][3]=game[i][3];
				}
			}
			
			return temp;
			
		}
		
		// sum down
		static int[][] down(int[][] game) {
			int [][]temp =  { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
			for(int i=0;i<4;i++) {
				if(game[0][i]==game[1][i]&&game[2][i]==game[3][i]) {
					temp[0][i]=0;
					temp[1][i]=0;
					temp[2][i]=game[0][i]+game[1][i];
					temp[3][i]=game[2][i]+game[3][i];	
				}
				else if(game[2][i]==game[3][i]) {
					temp[0][i]=0;
					temp[1][i]=game[0][i];
					temp[2][i]=game[1][i];
					temp[3][i]=game[2][i]+game[3][i];
				}else if(game[1][i]==game[2][i]) {
					temp[0][i]=0;
					temp[1][i]=game[0][i];
					temp[2][i]=game[1][i]+game[2][i];
					temp[3][i]=game[3][i];
				}else if(game[0][i]==game[1][i]) {
					temp[0][i]=0;
					temp[1][i]=game[0][i]+game[1][i];
					temp[2][i]=game[2][i];
					temp[3][i]=game[3][i];
				}else {
					temp[0][i]=game[0][i];
					temp[1][i]=game[1][i];
					temp[2][i]=game[2][i];
					temp[3][i]=game[3][i];
				}
			}
			
			return temp;
			
		}
		//sum up
		static int[][] up(int[][] game) {
			int [][]temp =  { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
			for(int i=0;i<4;i++) {
				if(game[0][i]==game[1][i]&&game[2][i]==game[3][i]) {
					temp[0][i]=game[0][i]+game[1][i];
					temp[1][i]=game[2][i]+game[3][i];
					temp[2][i]=0;
					temp[3][i]=0;	
				}else if(game[0][i]==game[1][i]) {
					temp[0][i]=game[0][i]+game[1][i];
					temp[1][i]=game[2][i];
					temp[2][i]=game[3][i];
					temp[3][i]=0;
				}else if(game[1][i]==game[2][i]) {
					temp[0][i]=game[0][i];
					temp[1][i]=game[1][i]+game[2][i];
					temp[2][i]=game[3][i];
					temp[3][i]=0;
				}
				else if(game[2][i]==game[3][i]) {
					temp[0][i]=game[0][i];
					temp[1][i]=game[1][i];
					temp[2][i]=game[2][i]+game[3][i];
					temp[3][i]=0;
				}else {
					temp[0][i]=game[0][i];
					temp[1][i]=game[1][i];
					temp[2][i]=game[2][i];
					temp[3][i]=game[3][i];
				}
			}
			
			return temp;
			
		}
		
		
		
		
}

package puzzleGame;

public class GameSystem {
	private static int [] board = new int[16];
	private static int n;
	
	public static void init() {
		boolean chk;
		int count = 0;
		do {
			int i,j;
			count = 0;
			for(i=0;i<15;i++) {
				while(true) {
					board[i] = (int)(Math.random()*15);
					chk = false;
					for(j=0;j<i;j++) {
						if(board[j]==board[i]) {
							chk = true;
							break;
						}
						if(board[j]!=board[i]) {
							chk = false;
						}
					}
					if(!chk) {
						break;
					}
				}
			}
			for(i=0;i<15;i++) {
				for(j=i+1;j<15;j++) {
					if(board[i]>board[j]) {
						count++;
					}
				}
			}
		}while(count%2!=0);
		board[15] = 15;
		n=15;
	}
	
	public static int getValue(int x) {
		return board[x];
	}
	
	public static int getblank() {
		return n;
	}
	
	public static void movePiece(int x) {
		board[n] = board[x];
		board[x] = 15;
		n=x;
		if(board[0]==0&&board[1]==1&&board[2]==2&&board[3]==3&&board[4]==4&&board[5]==5
				&&board[6]==6&&board[7]==7&&board[8]==8&&board[9]==9&&board[10]==10&&board[11]==11
				&&board[12]==12&&board[13]==13&&board[14]==14&&board[15]==15) {
			n=-1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

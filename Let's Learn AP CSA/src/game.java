
public class game {
	cell gameBoard[][] = new cell[8][8];
	public game(){
		System.out.println("Hi. New game lol");
		initializeGameBoard();
	}
	
	public void initializeGameBoard() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				gameBoard[i][j] = new cell(i,j,0);
			}
		}
		printBoard(gameBoard);
	}// initializeGameBoard bracket close
	
	public void printBoard(cell[][] ourGameBoard) {
		System.out.println("This is the current board state, *Nya* >-<");
		 for(int i = 0; i < 8; i++) {
			 for(int j = 0; j < 8; j++) {
				 System.out.print(ourGameBoard[i][j].type + " ");
			 }
			 System.out.println(" UwU");
		 }
	}
}

package de.demmer.dennis;

public class Chess {
	
	private int[][] board;
	
	private int time;

	
	public Chess(int höhe, int länge, int time) {
		board = getBoard(höhe,länge);
		this.time = time;
	}
	
	
	public Chess(int höhe, int länge) {
		board = getBoard(höhe,länge);
		this.time = 50;
	}
	
	
	public Chess() {
		board = getBoard(10,10);
		this.time = 50;
	}
	
	

	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	public int[][] getBoard() {
		return board;
	}
	
	

	private int[][] getBoard(int höhe, int länge){
		
		int[][] board = new int[höhe][länge];
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				
				if(i % 2 == 0 && j % 2 == 0) {
					board[i][j] = 1;
				}
				
				if(i % 2 != 0 && j % 2 != 0) {
					board[i][j] = 1;
				}

			}
			
		}

		return board;
	}
	
	
	
	public void printBoard(boolean debug) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
				
				if(debug == true) {
					System.out.print("(" + i + "|"+ j + ") \t");
				}
				
			}
			System.out.println();
			
		}
		
		
	}
	
	

}

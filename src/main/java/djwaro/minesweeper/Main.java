/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djwaro.minesweeper;

/**
 *
 * @author jacob
 */
public class Main {

	public static void main(String[] args) {
		// Please write functions to construct the playing field
		// given the size and number of mines.
		int size = 10;
		int mines = 20;
		Matrix board = new Matrix(size, mines);
		for (int i = 0; i<size; i++) {
			for (int j=0; j<size; j++) {
				System.out.print(board.matrix[i][j]);
			}
			System.out.println();
		}

	}

}

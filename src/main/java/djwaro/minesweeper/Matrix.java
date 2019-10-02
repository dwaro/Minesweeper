package djwaro.minesweeper;
import java.util.*;

/*
 * @author David J. Waro
 */

public class Matrix {
    int[][] matrix;
	
    Matrix(int size, int mineCount) {
	resize(size, mineCount);
    }
	
    public void resize(int size, int mineCount) {
        int[][] temp = new int[size][size];
	this.matrix = temp;
	setMines(size, mineCount);
    }
	
    private void setMines(int size, int mineCount) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<(size*size+1); i++) {
            list.add(i); // linear time: size * size
        }
        Collections.shuffle(list);
        for (int i=0; i<mineCount; i++) {
            int[] mine = genUnique(list.get(i), size);
            this.matrix[mine[0]][mine[1]] = 9; // constant time: 1
            adjustNeighbors(mine[0], mine[1]); // linear time: 8 * mineCount
        }
    }
	
    protected void adjustNeighbors(int row, int col) {
        int count = 0;
        int r = 0;
        int c = 0;
        while (count < 8) {
            switch (count) {
                case 0: 
                    r = row - 1;
                    c = col - 1;
                    setNeighbor(r, c);
                    break;
                case 1: 
                    r = row - 1;
                    c = col;
                    setNeighbor(r, c);
                    break;
                case 2:
                        r = row - 1;
                        c = col + 1;
                        setNeighbor(r, c);
                        break;
                case 3:
                        r = row;
                        c = col-1;
                        setNeighbor(r, c);
                        break;
                case 4:
                        r = row;
                        c = col + 1;
                        setNeighbor(r, c);
                        break;
                case 5:
                        r = row + 1;
                        c = col - 1;
                        setNeighbor(r, c);
                        break;
                case 6:
                        r = row + 1;
                        c = col;
                        setNeighbor(r, c);
                        break;
                case 7:
                        r = row + 1;
                        c = col + 1;
                        setNeighbor(r, c);
                        break;
            }
            count ++;
        }
    }
	
    private void setNeighbor(int row, int col) {
        try {
            if (matrix[row][col] != 9) {
                matrix[row][col] = matrix[row][col] + 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }
	
    protected int[] genUnique(int mineSpot, int size) {
        int[] unique = new int[2];
        int row;
        int col;
        if (mineSpot >= size) {
            if (mineSpot % size == 0) {
                row = mineSpot / size - 1;
            } else {
                row = mineSpot / size;
            }
        } else {
            row = 0;
        }
        if (mineSpot % size == 0 & mineSpot >= size) {
            col = size - 1;
        } else {
            col = mineSpot % size - 1;
        }
        unique[0] = row;
        unique[1] = col;
        return unique;
    }
	
    public int[][] getMatrix() {
        return this.matrix;
    }
}


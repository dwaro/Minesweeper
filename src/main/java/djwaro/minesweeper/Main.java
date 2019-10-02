package djwaro.minesweeper;

/*
 * @author David J. Waro
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

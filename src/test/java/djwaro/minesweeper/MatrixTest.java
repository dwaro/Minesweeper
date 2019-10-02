package djwaro.minesweeper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * @author David J. Waro
 */
public class MatrixTest {
    
    public MatrixTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    //
    @Test
    public void testGenUnique() {
        Matrix matrix = new Matrix(5,4);
        int[] test = matrix.genUnique(21, 5);
        int[] correct = {4, 0};
        assertArrayEquals(correct, test);
        
        test = matrix.genUnique(34, 17);
        int[] correct2 = {1, 16};
        assertArrayEquals(correct2, test);
    }
}

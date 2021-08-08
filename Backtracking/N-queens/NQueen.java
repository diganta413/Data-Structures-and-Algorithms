import java.util.*;

class NQueen {
    public int solution;

    boolean isSafe(int mat[][], int row, int col) {
        int i, j;
        // column check
        for (i = 0; i < 8; i++) {
            if (mat[i][col] == 1)
                return false;
        }
        // right upper
        for (i = row, j = col; i >= 0 && j < 8; i--, j++) {
            if (mat[i][j] == 1)
                return false;
        }
        // left upper diagonal
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (mat[i][j] == 1)
                return false;
        }
        return true;
    }

    public void solve(int mat[][], int row) {
        if (row == 8) {
            printsol(mat);
            return;
        }
        int col;
        for (col = 0; col < 8; col++) {
            if (isSafe(mat, row, col)) {
                mat[row][col] = 1;
                solve(mat, (row + 1));
                mat[row][col] = 0;// backtracking
            }
        }
    }

    public void printsol(int mat[][]) {
        int i, j;
        solution = solution + 1;
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
        System.out.println("Solution no:-" + solution);
    }

    public static void main(String[] args) {
        System.out.println("N-queens");
        int i, j;
        int mat[][] = new int[8][8];
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                mat[i][j] = 0;
            }
        }
        NQueen queen = new NQueen();
        queen.solve(mat, 0);
        // if (queen.solve(mat, 0) == false) {
        // System.out.println("No solution");
        // } else {
        // queen.printsol(mat);
        // }

        // queen.solve(mat, 0);
    }
}
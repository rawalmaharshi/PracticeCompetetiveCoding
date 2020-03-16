import java.util.Scanner;

public class OddCells {
    public static int oddCells(int n, int m, int[][] indices) {
        int [][] initMatrix = new int[n][m];
        for (int i = 0; i < indices.length; i++) {
            int [] index = indices[i];
            int rowI = index[0];
            int colI = index[1];
            matrixIncrementer(initMatrix, rowI, colI);
        }

        int numOddCells = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(initMatrix[i][j] + " ");
                if (initMatrix[i][j] % 2 == 1)
                    numOddCells++;
            }
            System.out.println();
        }
        return numOddCells;
    }

    public static void matrixIncrementer(int[][] matrix, int rowIndex, int colIndex) {
        //Row fixed
        int n = matrix.length;
        int m = matrix[0].length;
        for (int j = 0; j < m; j++) {
            matrix[rowIndex][j] += 1;
        }

        //Column fixed
        for (int i = 0; i < n; i++) {
            matrix[i][colIndex] += 1;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int [][] indices = {{0, 1}, {1, 1}};

        System.out.println("No. of odd cells: " + oddCells(n,m,indices));
    }
}

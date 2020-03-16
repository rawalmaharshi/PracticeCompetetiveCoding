public class uniquePath2 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][] dp = new int[m][n];
        boolean blockAhead = false;

        //set last row
        for (int j = n - 1; j >= 0; j--) {
            //check if way blocked
            if (obstacleGrid[m-1][j] == 1) {
                blockAhead = true;
            }

            if (!blockAhead) {
                dp[m-1][j] = 1;
            } else {
                dp[m-1][j] = 0;
            }
        }

        blockAhead = false;
        //set last column
        for (int i = m - 1; i >= 0; i--) {
            //check if way blocked
            if (obstacleGrid[i][n-1] == 1) {
                blockAhead = true;
            }

            if (!blockAhead) {
                dp[i][n-1] = 1;
            } else {
                dp[i][n-1] = 0;
            }
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                //blocked
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i+1][j] + dp[i][j+1];
                }
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int [][] input = {
            {0,0,0},
            {0,0,0},
            {0,1,0}
        };
        System.out.println(uniquePathsWithObstacles(input));
    }
}

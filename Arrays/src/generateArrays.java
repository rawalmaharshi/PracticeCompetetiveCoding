public class generateArrays {

    public static int[][] generArray(int N) {
        //edge case
        if (N == 0) {
            return new int[][] {{}};
        }

        int [][] ans = new int[N][];
        int numberElements = 1;

        while (numberElements <= N) {
            int newArr[] = new int[numberElements];
            for (int i = 1; i <= numberElements; i++) {
                newArr[i-1] = i;
            }

            ans[numberElements - 1] = new int[newArr.length];
            for (int i = 0; i < newArr.length; i++) {
                ans[numberElements - 1][i] = newArr[i];
            }
            numberElements++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int N = 4;
        int [][] ans = generArray(N);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

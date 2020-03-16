public class MaxSumSubarray {
    public static int findMaxSumSubarray (int [] arr, int k) {
        int maxValue = Integer.MIN_VALUE;
        int currentRunningSum = 0;
        int previousElement = 0;

        for (int i = 0; i < arr.length; i++) {
            currentRunningSum += arr[i] - previousElement;

            if (i >= k - 1) {
                maxValue = Math.max(maxValue, currentRunningSum);
                previousElement = arr[i - (k - 1)];
            }
        }
        return maxValue;
    }

    public static void main (String[] args) {
        System.out.println("Max sum is: " + findMaxSumSubarray(new int[] {4,2,3,7,8,2,2,8,1,0}, 3));
    }
}

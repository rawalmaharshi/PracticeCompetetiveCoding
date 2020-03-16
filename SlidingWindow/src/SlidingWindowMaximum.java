public class SlidingWindowMaximum {
    public static int [] SlidingWindowMaximum (int [] nums, int k) {
        //edge case
        if (nums.length == 0) {
            return new int[]{};
        }

        //edge case
        if (k == 1) {
            return nums;
        }

        int [] maxArray = new int[nums.length - k + 1];
        int windowStart = 0, windowEnd = windowStart + k - 1, maxArrIndex = 0;

        while(windowEnd < nums.length) {
            int wS = windowStart, WE = windowEnd;

            int windowMax = Integer.MIN_VALUE;
            while (wS <= WE) {
                if (nums[wS] > windowMax) {
                    windowMax = nums[wS];
                }
                wS++;
            }
            maxArray[maxArrIndex] = windowMax;
            maxArrIndex++;
            windowStart++;
            windowEnd++;
        }

        return maxArray;
    }

    public static void main(String[] args) {
//        [-7,-8,7,5,7,1,6,0]
//        4
        int [] arr = new int[] {-7,-8,7,5,7,1,6,0};
        int k = 4;
        int [] answer = SlidingWindowMaximum(arr, k);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
package Arrays.ArrayAssignment;

public class MaximumSubArray02 {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = maxSubArr(arr);
        System.out.println("Maximum SUb Array is : " + maxSum);
    }

    static int maxSubArr(int[] arr){
        int currentSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) maxSum = currentSum ;
            if (currentSum < 0) currentSum = 0 ;
        }
        return maxSum;
    }
}

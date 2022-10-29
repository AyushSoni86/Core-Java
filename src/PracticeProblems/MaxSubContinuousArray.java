public class MaxSubContinuousArray{
	public static void main(String args[]){
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		int maxSum = maxSubArray(arr);
		System.out.println(maxSum);
	}

	static int maxSubArray(int [] arr){
		int currentSum = 0;
		int maxSum = 0;
		for(int i = 0; i < arr.length ; i++){
			currentSum += arr[i];
			if(currentSum > maxSum ){ maxSum = currentSum ; }
			if(currentSum < 0){ currentSum = 0 ;}
		}
		return maxSum ;
	}

}
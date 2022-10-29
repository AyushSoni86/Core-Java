class findUniqueInTrice{
	public static void main(String[] args){
		
		int arr[] = {1,1,1,2,2,2,34};
		System.out.println(findUnique(arr,3));

	}

	static int findUnique( int [] arr , int k ){
		byte size_of_int = 4 ;
		int totalSize = 8 * size_of_int ;

		int[] count  = new int[totalSize];


		for(int i = 0 ; i < totalSize ; i++){
			int mask = 1 << i;
			for(int j = 0 ; j < arr.length ; j++){
				if((arr[j] & mask) != 0){
					count[i] += 1 ;				
				}																		
			}   		
		}
		int result = 0 ;
		for(int i = 0 ; i < arr.length ; i++){
			int mask = 1 << i ;
			int remainder = count[i] % k ;
			result += remainder * mask ;
 		}		
		return result ;
	}


}
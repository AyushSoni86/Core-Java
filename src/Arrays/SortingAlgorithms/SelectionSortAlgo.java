package Arrays.SortingAlgorithms;

public class SelectionSortAlgo{
	public static void main(String[] args){
		int[] arr = {8,0,7,3,1};
		printArray(arr);
		selectionSort(arr);
		printArray(arr);


	}
	static void selectionSort(int[] arr){
		int indexOfMin, temp ;
		for(int i = 0; i < arr.length; i++){
			indexOfMin = i ; 
			for(int j = i+1; j < arr.length ; j++){
				if(arr[j] < arr[indexOfMin])
					indexOfMin = j;
			}
			temp = arr[i];
			arr[i] = arr[indexOfMin];
			arr[indexOfMin] = temp;
		
		}
	}

	static void printArray(int[] arr){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
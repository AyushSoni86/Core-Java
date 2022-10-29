package Arrays.SortingAlgorithms;

public class InsertionSortAlgo{
	public static void main(String[] args){
		int[] arr = {8,0,7,3,1};
		printArray(arr);
		insertionSort(arr);
		printArray(arr);


	}
	static void insertionSort(int[] arr){
		int key , j ;
		for(int i = 1 ; i < arr.length ; i++){
			key = arr[i];
			j = i - 1;
			while(j >= 0 && arr[j] > key){
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j] = key ;	
		}
	}

	static void printArray(int[] arr){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
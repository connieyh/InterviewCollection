/**
 @see http://www.algolist.net/Algorithms/Sorting/Quicksort
 @see http://algorithmsandme.com/2013/08/quicksort-algorithm-in-c/
*/
public class QuickSort {
	public static int partition(int[] num, int left, int right) {
		int part = left;
		int j = left;
		for(int i = left+1; i<=right; i++) {
			if(num[i] < num[part]) {
				swap(num, i, ++j); 
			}
		}
		//If using ++j, we don't have to minus 1. 
		if(j <= right) {
			swap(num, j, part);	
		}
		return j; 
	}

	public static void quickSort(int[] num, int left, int right) {
		if(left < right) {
			int part = partition(num, left, right);
			quickSort(num, left, part);	
			quickSort(num, part+1, right);	
		}
		return;
	}

	public static void swap(int[] num, int left, int right) {
		int tmp = num[left];
		num[left] = num[right];
		num[right] = tmp;
	}

	public static void main(String[] args) {
		// int[] num = { 1, 12, 5, 26, 7, 14, 3, 7, 2};
		// int[] num = { 16,3,5,4,12,7};
		int[] num = { 100,3,2, 47, 39, 101};
		quickSort(num, 0, num.length-1);
		System.out.println("num in Main");
		for(int n : num) {
			System.out.printf("%d ", n);
		}
		System.out.printf("\n");
	}
}

/*
	Random Notes --
	# bucket sort/counting sort -> sort color
	# three color house
	  - R(n) = min(G(n-1), B(n-1)) + Rprice[n]
*/
/**
 @see http://www.algolist.net/Algorithms/Sorting/Quicksort
 @see http://algorithmsandme.com/2013/08/quicksort-algorithm-in-c/
*/
public class QuickSort {
	//In fact, when doing swap. use ++j will be betther. 
	//But j should be initilized as left
	public static int partition(int[] num, int left, int right) {
		int part = left;
		int j = left+1;
		for(int i = left+1; i<=right; i++) {
			if(num[i] < num[part]) {
				swap(num, i, j); 
				j++;
			}
		}
		//If using ++j, we don't have to minus 1. 
		if(j-1 < right) {
			swap(num, j-1, part);	
		}
		return j-1; 
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
		int[] num = { 1, 12, 5, 26, 7, 14, 3, 7, 2};
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
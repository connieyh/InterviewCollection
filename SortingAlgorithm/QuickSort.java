/**
 @see http://www.algolist.net/Algorithms/Sorting/Quicksort
*/
public class QuickSort {
	public static int partition(int[] num, int left, int right) {
		int pivot = num[(left+right)/2];
		// System.out.println("pivot= " + pivot + " left= " + left + " right= " + right);
		while(left < right) {
			// System.out.println("left= "+left+" right= "+right);
			while(num[left] < pivot) {
				left++;
			}
			while(num[right] > pivot) {
				right--;
			}
			if(left <= right) {
				swap(num, left, right);
				left++;
				right--;
				// System.out.println("---- During partition ---- ");
				// for(int n : num) {
				// 	System.out.printf("%d ", n);
				// }
				// System.out.printf("\n");
			}
		}

		// System.out.println("**** After partition ****");
		// for(int n : num) {
		// 	System.out.printf("%d ", n);
		// }
		// System.out.printf("\n");

		return left;
	}

	public static void swap(int[] num, int left, int right) {
		int tmp = num[left];
		num[left] = num[right];
		num[right] = tmp;
	}

	public static void quickSort(int[] num, int left, int right) {
		int cur = partition(num, left, right);
		// System.out.printf("cur=%d\n",cur);
		if(left < cur-1) {
			quickSort(num, left, cur-1);
		}
		if(right > cur) {
			quickSort(num, cur, right);
		}
	}

	public static void main(String[] args) {
		int[] num = {1, 12, 5, 26, 7, 14, 3, 7, 2};
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
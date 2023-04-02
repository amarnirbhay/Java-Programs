package array;

public class NegativePositive {
	public static void main(String[] args) {
		int arr[] = { 10, -3, 4, 2, -3, 4, -7, -9 };
		int arr_size = arr.length;
		
		shiftAll(arr, 0, arr_size-1);
		display(arr, arr_size-1);
	}
	public static void display(int arr[], int right) {
			for(int i=0; i<=right ;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
	}
	public static void shiftAll(int[] arr, int left, int right) {

		while (left <= right) {
			// to check both side is negative
			if (arr[left] <= 0 && arr[right] <= 0) {

				left++;
			}
			// to check left is negative and right is positive
			// if Condition is satisfied : Swaped
			else if (arr[left] >= 0 && arr[right] <= 0) {

				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			// To check both Side is positive
			else if (arr[left] >= 0 && arr[right] >= 0) {

				right--;
			} else {
				left++;
				right--;
			}
		}
	}
}

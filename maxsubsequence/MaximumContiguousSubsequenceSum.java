

public class MaximumContiguousSubsequenceSum {
	static int[] input = {1, -2, 3, 10, -4, 7, 2, -5};
	//static int[] input = {2, -1, 3, 8, -5, 6, -8};
	static int fromIndex = 0;
	static int toIndex = 0;
	public static void main(String[] a) {
		int maxSum = findMaxSum();
		System.out.println("Max Sum = " + maxSum);
		
	}
	static int findMaxSum() {
		/*
		 * M(i) = M(i-1) + input[i] or input[i] if M(i-1) < 0
		 */
		int sum = input[0];
		int maxSum = 0;
		for (int i=1;i<input.length;i++) {
			if (sum < 0) {
				sum = input[i];
				fromIndex = i;
			}
			else {
				sum = sum + input[i];
			}
			if (sum > maxSum) {
				maxSum = sum;
				toIndex = i;
			}
		}
		System.out.println("from " + fromIndex + " to " + toIndex);
		return maxSum;
	}
}


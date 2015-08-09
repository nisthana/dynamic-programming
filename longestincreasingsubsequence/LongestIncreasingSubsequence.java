
public class LongestIncreasingSubsequence {
		//static int[] input = {3,4,-1,0,6,2,3};
		static int[] input = {7, 2, 3, 1, 5, 8, 9, 6};
		static int[] longest = new int[input.length];
		
		public static void main(String[] a) {
			findLongestIncreasingSub();
		}
		static void findLongestIncreasingSub() {
			/*
			 * Longest(i) = Max{Longest(j)+1,Longest(i)}
			 *              where J<i and a[j] < a[i]
			 */
			//initialize all longest to 1
			for (int i=0;i<longest.length;i++) {
				longest[i] = 1;
			}
			/*
			 * Now for every i, check a[0] to a[j]. If a[j] > a[i] ignore, else if
			 * a[j] < a[i] then check the value of longest[j]+1 and compare it to longest[i] a
			 * take the bigger one
			 */
			int maximum  = -1;
			for (int i=1;i<input.length;i++) {
				for (int j=0;j<i;j++) {
					if (input[j] < input[i]) {
						longest[i] = Math.max(longest[j]+1,longest[i]);
						if (maximum < longest[i]) 
							maximum = longest[i];
					}
				}
				
			}
			System.out.println("maximum="+maximum);
			
			
		}
		
}

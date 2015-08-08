public class EditDistance {
	static String s1 = "saturday";
	static String s2 = "sunday";
	static int len1 = s1.length();
	static int len2 = s2.length();
	static int[][] distances = new int[len1+1][len2+1];
	
	public static void main(String[] a) {
		int minEdits = findEditDistance();
		System.out.println("min edits required to transform " + s1 + " to " + s2 + " = " + minEdits);
	}
	
	static int findEditDistance() {
		/*
		 * distance[i,j] = i when j=0;
		 * distance[i,j] = j when i=0;
		 * if (s1[i] == s2[i]) 
		 * 	distance[i,j] = distance[i-1,j-1]+1
		 * else 
		 *   distance[i,j] = min(distance[i-1,j],distance[i,j-1],distance[i-1][j-1]+1
		 */
		
		
		for (int i=0;i<len1+1;i++) 
			distances[i][0] = i;
		for (int j=0;j<len2+1;j++) 
			distances[0][j] = j;
		print();
		for (int i=1;i<len1+1;i++) {
			for (int j=1;j<len2+1;j++) {
				if (s1.charAt(i-1) == s2.charAt(j-1)) {
					distances[i][j] = distances[i-1][j-1];
					
				} else {
					int deletion = distances[i-1][j] + 1;
					int insert = distances[i][j-1] + 1;
					int replace = distances[i-1][j-1] + 1;
					distances[i][j]  = min(deletion,insert,replace);
				}
			}
		}
		return distances[len1][len2];
	}
	static int min(int n1,int n2, int n3) {
		return Math.min(Math.min(n1, n2),n3);
	}
	static void print() {
		for (int i=0;i<len1+1;i++) {
			for (int j=0;j<len2+1;j++) {
				System.out.print(distances[i][j]+" | ");
			}
			System.out.println("");
		}
	}
}

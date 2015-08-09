package dynamicprog;

import java.util.ArrayList;
import java.util.List;

public class CoinChange {
	static int[] coins = {1,3,5,9};
	static int sum = 15;
	static int[] MinChange = new int[sum+1];
	public static void main(String[] a) {
		int minChange = getMinChange();
		System.out.println("Min Change =" + minChange);
	}
	static int getMinChange() {
		/*
		 * MinChange(i) = Min {MinChange(i-v1),MinChange(i-v2),...MinChange(i-vN)} + 1
		 *                where vN <= i
		 * MinChange[0[ = 0;
		 * MinChange[1] = 1;
		 * MinChange[2] = Min {MinChange[2-1]} + 1 = Min {MinChange[1]} + 1 = 2;
		 * MinChange[3] = Min {MinChage[3-1],MinChange[3-3]} + 1
		 *              = Min {MinChange[2],MinChange[0]} + 1;
		 *              = Min {2,0}+1 = 0+1=1
		 * MinChange[4] = Min {MinChange[4-3],MinChange[4-1]}+1
		 * 		        = Min {MinChange[1],MinChange[3]}+1
		 * 				= Min {1,1}+1 = 1+1 = 2
		 * MinChange[5] = Min {MinChange[5-1],MinChange[5-3],MinChange[5-5]}+1
		 *              = Min {MinChange[4],MinChange[2],MinChange[0]}+1
		 *              = Min {2,2,0} + 1
		 *              = 0+1 = 1
		 * MinChange[6] = Min {MinChange[6-1],MinChange[6-3],MinChange[6-5]}+1
		 *              = Min {MinChange[5],MinChange[3],MinChange[1]}+1
		 *              = Min {1,1,1} + 1
		 *              = 1+1 = 2
		 */
		
		MinChange[0] = 0;
		//MinChange[1] = 1;
		
		for (int i=1;i<=sum;i++) {
			List<Integer> minCoins = new ArrayList<Integer>();
			
			for (int j=0;j<coins.length;j++) {
				
				if (coins[j] <= i) {
					
					minCoins.add(MinChange[i-coins[j]]);
				}
				else {
					
					break;
				}
			}
			
			
			MinChange[i] =  findMinOfAllCoins(minCoins) + 1;
			
			
		}
		return MinChange[sum];
	}
	
	static int findMinOfAllCoins(List<Integer> list) {
		int min = Integer.MAX_VALUE;
		for (int i=0;i<list.size();i++) {
			if (list.get(i) < min) 
				min = list.get(i);
		}
		
		return min;
	}
	
}

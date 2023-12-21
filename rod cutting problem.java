import java.util.*;
public class Solution {

	public static int MaxRod(int price[], int ind, int n, int[][] dp){
		if(ind == 0){
			return n*price[0];
		}
		if(dp[ind][n] != -1){
			return dp[ind][n];
		}
		int notTake = 0 + MaxRod(price, ind-1, n, dp);
		int take = Integer.MIN_VALUE;
		int rodlength = ind + 1;
		if(rodlength <= n){
			take = price[ind] + MaxRod(price, ind, n - rodlength, dp);
		}
		return dp[ind][n] = Math.max(notTake, take);
	}
	public static int cutRod(int price[], int n) {
		int[][] dp = new int[n][n+1];
		for(int[] row:dp)
		Arrays.fill(row,-1);
		return MaxRod(price, n-1, n, dp);
		
	}
}

// dp interview 
// main
//

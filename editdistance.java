class Solution {

    public int findmin(String s1, String s2, int i, int j, int[][] dp){
        if(i<0){
            return j + 1;
        }
        if(j<0){
            return i + 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j))
            return dp[i][j] = 0 + findmin(s1,s2,i-1,j-1,dp);
        
       else 
        return dp[i][j] = 1+Math.min(findmin(s1,s2,i-1,j-1,dp),
    Math.min(findmin(s1,s2,i-1,j,dp),findmin(s1,s2,i,j-1,dp)));
    }
    public int minDistance(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];
        for(int row[]:dp)
        Arrays.fill(row,-1);
        return findmin(s1,s2,n-1,m-1,dp);
    }
}
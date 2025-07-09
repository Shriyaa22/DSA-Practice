class Solution {
    public int maxValue(int[][] events, int k) {
        int n=events.length;
        int[][]dp=new int [k+1][n+1];
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        for(int j=n-1;j>=0;j--){
            int next=binary(events,events[j][1]);
            for(int i=1;i<=k;i++){
                int inc=events[j][2]+dp[i-1][next];
                int exc=dp[i][j+1];
                dp[i][j]=Math.max(inc,exc);
            }
        }
        return dp[k][0];
    }
    public static int binary(int[][]events,int lastDay){
        int l=0;
        int r=events.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(events[mid][0]<=lastDay){
                l=mid+1;
               
            }
            else{
                r=mid;
            }
        }
        return l;
    }
}
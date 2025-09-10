class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        final int mod = 1_000_000_007;
        long[]dp=new long[n+1];
        dp[1]=1;
        for(int d=1;d<=n;d++){
            long people=dp[d];
            if(people==0){
                continue;
            }
            int s=d+delay;
            int e=d+forget-1;
            for(int i=s;i<=e && i<=n;i++){
                dp[i]=(dp[i]+people)%mod;
            }

        }
        long res=0;
        for(int day=n-forget+1;day<=n;day++){
            if(day>=1){
                res=(res+dp[day])%mod;
            }
        }
        return (int)res;
    }
}
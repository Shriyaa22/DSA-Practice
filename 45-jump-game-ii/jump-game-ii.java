class Solution {
    public int jump(int[] nums) {
        int jump=0,close=0,far=0;
        if(nums.length==1){
            return 0;
        }

        for(int i=0;i<nums.length;i++){
            
            far=Math.max(far,i+nums[i]);
            if(i==close){
                jump++;
                close=far;
                if(close==nums.length-1){
                    return jump;
                }
            }
        }
        return jump;

    }
}
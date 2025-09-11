class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1 ){
            return true;
        }
        int jump=0,far=0,close=0;
        for(int i=0;i<nums.length;i++){
             far=Math.max(far,nums[i]+i);
            if(i==close){
                jump++;
                close=far;
            }
            if(close>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}
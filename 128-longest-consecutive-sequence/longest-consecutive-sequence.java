class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        int max=0;
        HashSet<Integer>map=new HashSet<>();
        for(int i:nums){
            map.add(i);
        }
        for(int i:map){
        if(!map.contains(i-1)){
            int curr=i;
            int len=1;
            while(map.contains(curr+1)){
                curr++;
                len++;
            }
            max=Math.max(max,len);
        }
        }
        return max;
    }
}
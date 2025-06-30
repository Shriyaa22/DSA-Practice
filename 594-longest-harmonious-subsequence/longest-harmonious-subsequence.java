class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int mx=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
           
        }
        for(int i:map.keySet()){
            if(map.containsKey(i+1)){
                int len=map.get(i)+map.get(i+1);
                mx=Math.max(mx,len);
            }
        }
        return mx;
        

    }
}
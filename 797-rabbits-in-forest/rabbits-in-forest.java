class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i:answers){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            int x=i;
            int y=map.get(i);
            int groupSize=x+1;
            int total=(int)Math.ceil((double)y/groupSize);
            count+=total*groupSize;
        }
        return count;
    }
    

}
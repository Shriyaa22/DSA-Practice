class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean []res=new boolean[fruits.length];
        int count=0;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(!res[j]&&fruits[i]<=baskets[j]){
                    count++;
                    res[j]=true;
                    break;
                }
            }
        }
        return fruits.length-count;
    }
}
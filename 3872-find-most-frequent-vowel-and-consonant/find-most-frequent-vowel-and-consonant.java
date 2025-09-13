class Solution {
    public static boolean isVo(char ch){
        
            return(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');

           
    }
    public  static int maxFreqSum(String s) {
        int m1=0;
        int m2=0;
        
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(char ch:s.toCharArray()){
             if(isVo(ch)){
                map1.put(ch,map1.getOrDefault(ch,0)+1);
                
             } 
             else{
                map2.put(ch,map2.getOrDefault(ch,0)+1);
             }
        }
        for(char ch:map1.keySet()){
            m1=Math.max(m1,map1.get(ch));
        }
        for(char ch:map2.keySet()){
            m2=Math.max(m2,map2.get(ch));
        }
        return m1+m2;
        
           
    }
}
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[]word=text.split(" ");
       int count=0;
       for(String ch:word){
       boolean can=true;
        for(char c:brokenLetters.toCharArray()){
            if(ch.indexOf(c)!=-1){
                can=false;
               break; 
            }
        }
        if(can)count++;
       }
       return count;
    }
}
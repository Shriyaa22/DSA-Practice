class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vow=new ArrayList<>();
        ArrayList<Integer>con=new ArrayList<>();
       
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vow.add(ch);
                con.add(i);
            }
        }
             char[]res=s.toCharArray();
            Collections.sort(vow);
            for(int i=0;i<con.size();i++){
                res[con.get(i)]=vow.get(i);
            }

        
        return new String (res);
    }
}
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char og=s.charAt(i);
            char rep=t.charAt(i);

            if(!map.containsKey(og)){
                if(!map.containsValue(rep)){
                    map.put(og,rep);
                }else{
                    return false;
                }
            }else{
                char mapChar = map.get(og);
                if(mapChar!=rep){
                    return false;
                }
            }
        }
        return true;
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        Map<Character,Integer> map1 = new HashMap<>();
        for(int i =0; i < s.length(); i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)-1);
        }
        for(int i: map1.values()){
            if(i!=0)return false;
        }
        
      return true;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String val: strs){
            char[] ch = val.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if(!map.containsKey(str)) map.put(str,new ArrayList<String>());
            map.get(str).add(val);
        }
        res.addAll(map.values());
        return res;
        
    }
}

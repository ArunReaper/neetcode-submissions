class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            if(map.containsKey(str)){
                map.get(str).add(s);
            }else{
                map.put(str, new ArrayList<>(List.of(s)));
            }
        }
        return new ArrayList<>(map.values());
    }
}

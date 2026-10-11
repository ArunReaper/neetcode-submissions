class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        Map<Character, Integer> map = new HashMap<>();
        int  maxlen = 0;
        while(r < s.length()){
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) >= l) {
                l = map.get(s.charAt(r)) + 1;
                map.put(s.charAt(r), r);
            }
            map.put(s.charAt(r), r);
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }
}

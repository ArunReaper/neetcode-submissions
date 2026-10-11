class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxlen = 0, len = 0;
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            set = new HashSet<>();
            for(int j = i; j < s.length(); j++){
                if(set.contains(s.charAt(j))) break;
                set.add(s.charAt(j));
                len = j - i + 1;
            }
            maxlen = Math.max(maxlen, len);
        }

        return Math.max(len, maxlen);
    }
}

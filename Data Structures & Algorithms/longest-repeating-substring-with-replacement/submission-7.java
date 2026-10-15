class Solution {
    
public int characterReplacement(String s, int k) {
    Map<Character, Integer> map = new HashMap<>();
    int maxlen = 0;
    int r = 0, l = 0;
    int windowlen = 0, maxFreqCharLen = 0;

    while (r < s.length()) {
        map.put(s.charAt(r),
                map.getOrDefault(s.charAt(r), 0) + 1);

        windowlen = r - l + 1;

        maxFreqCharLen = 0;
        for (int i : map.values()) {
            maxFreqCharLen = Math.max(maxFreqCharLen, i);
        }

        if (windowlen - maxFreqCharLen > k) {
            char leftChar = s.charAt(l);
            map.put(leftChar, map.get(leftChar) - 1);

            if (map.get(leftChar) == 0) {
                map.remove(leftChar);
            }

            l++;
            windowlen = r - l + 1;

            maxFreqCharLen = 0;
            for (int i : map.values()) {
                maxFreqCharLen = Math.max(maxFreqCharLen, i);
            }
        }

        maxlen = Math.max(maxlen, windowlen);
        r++;
    }

    return maxlen;
}
}

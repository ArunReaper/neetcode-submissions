class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[Math.abs(97 - s.charAt(i))]++;
        }

        for(int i = 0; i < t.length(); i++){
            if(count[Math.abs(97 - t.charAt(i))] <= 0) return false;
            count[Math.abs(97 - t.charAt(i))]--;
        }

        return true;
    }
}

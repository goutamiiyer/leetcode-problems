import java.util.HashMap;
import java.util.Map;

public class lengthLongestSubstring {
    public static void main(String[] args) {
        String str = "pwwkew";
        lengthLongestSubstring ls = new lengthLongestSubstring();
        int output = ls.lengthOfLongestSubstring(str);
        System.out.println(output);
    }
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        Map<Character, Integer> map = new HashMap<>();
        int leftWindow = 0;
        for (int rightWindow = 0; rightWindow < s.length(); rightWindow++) {
            if (map.containsKey(s.charAt(rightWindow))) {
                leftWindow = Math.max(map.get(s.charAt(rightWindow)), leftWindow);
            }
            longest = Math.max(longest, rightWindow - leftWindow + 1);
            map.put(s.charAt(rightWindow), rightWindow + 1);
        }
        return longest;
    }
}

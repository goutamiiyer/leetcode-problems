import java.util.*;
public class LongestSubstringKDistinctChars {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringKDistinct("eceba", 2));
    }
    private static int lengthOfLongestSubstringKDistinct(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxLength = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            while (map.size() > k) {
                int charCount = map.get(s.charAt(start));
                charCount--;
                if (charCount == 0) {
                    map.remove(s.charAt(start));
                }
                start++;
            }
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
}

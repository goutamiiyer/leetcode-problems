import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "google";
        FirstUniqueCharacter fuc = new FirstUniqueCharacter();
        int output = fuc.firstUniqueChar(str);
        System.out.println(output);
    }

    int firstUniqueChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(!map.containsKey(current)) {
                map.put(current, i);
            } else {
                map.put(current, -1);
            }
        }
        int min = Integer.MAX_VALUE;
        for (char c: map.keySet()) {
            if(map.get(c) > -1 && map.get(c) < min) {
                min = map.get(c);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}

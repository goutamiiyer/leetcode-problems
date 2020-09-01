import java.util.*;
public class GenerateParentheses {
    public static void main(String[] args) {
        List<String> output = generateParentheses(3);
        System.out.println(output);
    }
    private static List<String> generateParentheses(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, n, 0, 0, "");
        return list;
    }
    private static void backtrack(List<String> list, int n, int open, int close, String str) {
        if (str.length() == n*2) {
            list.add(str);
            return;
        }
        if (open < n) {
            backtrack(list, n, open+1, close, str+"(");
        }
        if (close < open) {
            backtrack(list, n, open, close+1, str+")");
        }
    }
}

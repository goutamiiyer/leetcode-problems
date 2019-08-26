public class ReverseString {
    // Purpose: Strings are immutable objects
    public static void main(String[] args) {
        String str = "hello";
        ReverseString rs = new ReverseString();
        String output = rs.reverseString(str);
        System.out.println(output);
    }

    String reverseString(String s) {
        char[] characters = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
            i++;
            j--;
        }
        return new String(characters);
    }
}

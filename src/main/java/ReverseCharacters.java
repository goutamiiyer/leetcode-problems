public class ReverseCharacters {
    public static void main(String[] args) {
        ReverseCharacters rc = new ReverseCharacters();
        char[] s = {'h','e','l','l','o','i'};
        rc.reverseChar(s);
        System.out.println(s);
    }

    void reverseChar(char[] s) {
        int len = s.length;
        for(int i = 0; i < len / 2; i++) {
            char temp = s[i];
            s[i] = s[len - 1 -i];
            s[len - 1 - i] = temp;
        }
    }
}

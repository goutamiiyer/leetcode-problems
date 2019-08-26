public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        ValidAnagram va = new ValidAnagram();
        boolean output = va.validAnagram(s1, s2);
        System.out.println(output);
    }

    boolean validAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        int[] counts = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i) - 'a']++; // See ASCII table
            counts[s2.charAt(i) - 'a']--;
        }
        for(int i: counts) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}

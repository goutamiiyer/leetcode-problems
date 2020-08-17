import java.util.ArrayList;
import java.util.List;

public class stringManipulation {
    // Given a string and a character, check if character occurs somewhere in the string.
    // Find the index of the first occurence of the character
    // Replace the character in all the places in the string with this index preceded by $
    // Suppose this is a string"I didn't get the problem. Can you explain?"
    // If 'i' occurs somewhere else in this string, the first occurence of 'i' is at position 0.
    // You have to replace 'i' with $0 throughout the string
    public static void main(String[] args) {
        String str = "i am a developer and i like to code";
        char search = 'e';
        stringManipulation s = new stringManipulation();
        String output = s.manip(str,search);
        System.out.println(output);
    }
    public String manip(String str, char search) {
        List<Integer> list = new ArrayList<>();
        char[] characters = str.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (search == characters[i]) {
                list.add(i);
            }
        }
        char[] outChar = new char [characters.length + list.size()];
        int replaceInt = list.get(0);
        char replaceChar = (char) (replaceInt+'0');
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (search ==  characters[i]) {
                outChar[index] = '$';
                index++;
                outChar[index] = replaceChar;
            } else {
                outChar[index] = characters[i];
            }
            index++;
        }
        return new String(outChar);
    }
}

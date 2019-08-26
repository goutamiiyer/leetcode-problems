import java.util.HashSet;
import java.util.Set;

public class Nonunique {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 2};
        Nonunique nonunique = new Nonunique();
        int output = nonunique.findNonUnique(input);
        if(output != 0) {
            System.out.println(output + " is duplicate");
        }
    }

    int findNonUnique(int[] input) {
        Set<Integer> dupSet = new HashSet<>();
        for(int i = 0; i < input.length; i++) {
            if(dupSet.contains(input[i])) {
                return input[i];
            }
            dupSet.add(input[i]);
        }
        return 0;
    }
}

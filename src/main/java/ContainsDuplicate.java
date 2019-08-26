import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        ContainsDuplicate cd = new ContainsDuplicate();
        boolean output = cd.containsDuplicateValues(nums);
        System.out.println(output);
    }

    boolean containsDuplicateValues(int[] nums) {
        Set<Integer> dupSet = new HashSet<>();
        for (int num: nums) {
            if (!dupSet.contains(num)) {
                dupSet.add(num);
            } else {
                return true;
            }
        }
        return false;
    }
}

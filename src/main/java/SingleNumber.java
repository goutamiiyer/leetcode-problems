import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
//        int[] nums = {4,1,2,1,2};
        int[] nums = {2, 2, 1};
        SingleNumber sn = new SingleNumber();
        int output = sn.ocurringOnceInArray(nums);
        System.out.println(output);
    }

    int ocurringOnceInArray(int[] nums) {
        Set<Integer> singleSet = new HashSet<>();
        for (int num: nums) {
            if (!singleSet.contains(num)) {
                singleSet.add(num);
            } else {
                singleSet.remove(num);
            }
        }
        for (int num: singleSet) {
            return num;
        }
        return -1;
    }
}

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 1, 5};
        int target = 9;
        TwoSum ts = new TwoSum();
        int[] output = ts.twoSum(nums, target);
        System.out.println("{"+output[0]+","+output[1]+"}");
    }

    int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int difference = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i];
            if (map.containsKey(difference)) {
                result[0] = map.get(difference);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}

public class maximumSubArray {
    public static void main(String[] args) {
        maximumSubArray ms = new maximumSubArray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int output = ms.maxSubArray(nums);
        System.out.println(output);
    }
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int currentMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            currentMax = Math.max(nums[i], sum);
            if (currentMax == nums[i]) {
                sum = nums[i];
            }
            if (currentMax > max) {
                max = currentMax;
            }
        }
        return max;
    }
}

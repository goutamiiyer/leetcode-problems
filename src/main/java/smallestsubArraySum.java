public class smallestsubArraySum {
    public static void main(String[] args) {
        System.out.println(smallestSum(new int[]{2, 1, 5, 2, 3, 2}, 7));
    }
    private static int smallestSum(int[] arr, int s) {
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum >= s) {
                minLength = Math.min(minLength, end-start+1);
                sum -= arr[start++];
            }
        }
        return minLength == Integer.MAX_VALUE? 0: minLength;
    }
}

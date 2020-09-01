import java.util.*;

public class subArrayAverage {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        double[] output = contiguousAverage(arr, k);
        System.out.println(Arrays.toString(output));
    }
    public static double[] contiguousAverage(int[] arr, int k) {
        double[] result = new double[arr.length - k + 1];
        int start = 0;
        double sum = 0;
        double average = 0.0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            if (end >= k-1) {
                average = sum/k;
                result[start] = average;
                sum -= arr[start];
                start++;
            }
        }
        return result;
    }
}

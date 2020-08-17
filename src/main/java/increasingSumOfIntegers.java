/* Given an array of integers, return a list of integers which contains the
* [1st integer, Sum of 2 integers (2nd, 3rd), Sum of next 3 integers (4th, 5th, 6th)...] and so on
* Input
* [1,6,8,5,9,4,7,2]
* Output
* [1,14,18,9]
* */
import java.util.*;
public class increasingSumOfIntegers {
    public static void main(String[] args) {
        System.out.println(summation(new int[] {1,6,8,5,9,4,7,2}));
    }
    private static List<Integer> summation(int[] arr) {
        // Output List
        List<Integer> list = new ArrayList<>();
        //Edge case: If there are no input elements
        if (arr.length == 0) {
            return list;
        }
        // add the first element to the output list
        list.add(arr[0]);
        int n = arr.length-1;

        int limit = 2;
        int leftIndex = 1;
        // To check if the array length does not exceed
        while(n >= 0) {
            int sum = 0;
            // add all the elements in the input within the limit
            for (int i = leftIndex; i < leftIndex + limit && i < arr.length && n >= 0; i++) {
                sum += arr[i];
            }
            list.add(sum);
            // decrement the length left in the array
            n = n-limit;
            // adjust the left index to the next place
            leftIndex = leftIndex + limit;
            // increment the limit to 3, 4, 5 and so on
            limit++;
        }
        return list;
    }
}

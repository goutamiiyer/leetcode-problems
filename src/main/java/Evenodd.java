import java.util.ArrayList;
import java.util.List;

public class Evenodd {
    public static void main(String[] args) {
        List<Integer> integerArray = new ArrayList<Integer>();
        integerArray.add(1);
        integerArray.add(2);
        integerArray.add(3);
        System.out.println(getMaximumScore(integerArray));
    }
    public static long getMaximumScore(List<Integer> integerArray) {
        // Write your code here
        int arraySize = integerArray.size();
        int[] sumArray = new int[arraySize + 1];
        if (integerArray.size() == 1) {
            return integerArray.get(0);
        }
        for (int i = 1; i <= sumArray.length-1; i++) {
            sumArray[i] = sumArray[i-1] + integerArray.get(i-1);
        }
        boolean oddOperation = integerArray.size() % 2 == 1;
        int[][] dp = new int[integerArray.size()][integerArray.size()];
        for (int j = 0; j < integerArray.size(); j++) {
            for (int k = 0; k+1 < integerArray.size(); k++) {
                if (j == 0) {
                    dp[k][k] = oddOperation?integerArray.get(k):-integerArray.get(k);
                    continue;
                } else {
                    if (oddOperation) {
                        dp[k][k+1] = Math.max(dp[k+1][k+1], dp[k][k+j-1]) + sumArray[k+j+1] - sumArray[k];
                    } else {
                        dp[k][k+1] = Math.max(dp[k+1][k+1], dp[k][k+j-1]) - sumArray[k+j+1] + sumArray[k];
                    }
                }
            }
            oddOperation = !oddOperation;
        }
        return dp[0][integerArray.size()-1];
    }
}

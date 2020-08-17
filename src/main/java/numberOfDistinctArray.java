import java.util.*;
public class numberOfDistinctArray {
    public static void main(String[] args) {
        int[] inputArray = new int[] {2,3,2,3,3};
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            arr.add(inputArray[i]);
        }
        int count = solve(arr);
        System.out.println(count);
    }
    private static int solve(List<Integer> arr) {
        if (arr.size() <= 2) {
            return arr.size();
        }
        List<Integer> newArr = new ArrayList();
        for (int i = 0; i < arr.size(); i++) {
            newArr.add(arr.get(i));
        }
        Set<List<Integer>> set = new HashSet<>();
        set.add(newArr);
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i != j) {
                    int temp = newArr.get(i);
                    newArr.set(i, newArr.get(j));
                    newArr.set(j, temp);

                    if (!set.contains(newArr)) {
                        set.add(newArr);
                    }

                    temp = newArr.get(j);
                    newArr.set(j, newArr.get(i));
                    newArr.set(i, temp);
                }
            }
        }

        return set.size();
    }
}

import java.util.*;
public class AdjacentCells {
    public static void main(String[] args) {
        Integer[] inp = new Integer[]{1,1,1,0,1,1,1,1};
        List<Integer> input = new ArrayList(Arrays.asList(inp));
        List<Integer> output = adjacentCells(input, 2);
        for (int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i));
            if (i < output.size()-1) {
                System.out.print(",");
            }
        }
    }
    private static List<Integer> adjacentCells(List<Integer> input, int numOfDays) {
        List<Integer> orgList = new ArrayList<>();
        List<Integer> modList = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            orgList.add(input.get(i));
            modList.add(input.get(i));
        }
        int num = 0;
        while (num < numOfDays) {
            int prev = 0;
            int after = 0;
            for (int i = 0; i < 8; i++) {
                if (i-1 == -1) {
                    prev = 0;
                } else {
                    prev = orgList.get(i-1);
                }
                if (i+1 == input.size()) {
                    after = 0;
                } else {
                    after = orgList.get(i+1);
                }
                if (prev == after) {
                    modList.set(i, 0);
                } else {
                    modList.set(i, 1);
                }
            }
            for (int i = 0; i < orgList.size(); i++) {
                orgList.set(i, modList.get(i));
            }
            num++;
        }
        return modList;
    }
}

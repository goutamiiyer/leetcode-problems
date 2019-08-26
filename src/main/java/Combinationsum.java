public class Combinationsum {
    public static void main(String[] args) {
        int [] arr = {2,3,6,7};
        int target = 7;
        Combinationsum cs = new Combinationsum();
        boolean csprint = cs.printCombinationSum(arr, target);
        System.out.println(csprint);
    }

    boolean printCombinationSum(int [] arr, int target){
        for (int i = 0; i <  arr.length; i++)
        {
            for (int j = 1; j < arr.length; j++)
            {
                int arrsum = arr[i] + arr[j];
                if (arrsum == target)
                {
                    System.out.println("Target reached");
                    return true;
                }
                arrsum = 0;
            }
        }
        return false;
    }
}

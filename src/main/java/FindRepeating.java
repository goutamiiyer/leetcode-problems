public class FindRepeating {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        FindRepeating fr = new FindRepeating();
        int outputIndex = fr.findRepeatingElement(arr, 0, arr.length-1);
        if (outputIndex != -1) {
            System.out.println(outputIndex);
        }
    }

    int findRepeatingElement(int[] arr, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low+(high-low)/2;
        if (arr[mid] != arr[mid+1]) {
            if (arr[mid] == arr[mid-1]) {
                return mid;
            }
            return findRepeatingElement(arr, low, mid-1);
        }
        return findRepeatingElement(arr, mid+1, high);
    }
}

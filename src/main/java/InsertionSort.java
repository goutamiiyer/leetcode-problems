public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {5,2,4,6,1,3};
        InsertionSort is = new InsertionSort();
        is.insertSort(a);
        is.printarray(a);
    }

    void insertSort(int[] a) {
        for(int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j-1;
            while(i >= 0 && a[i] > key) {
                a[i+1] = a[i];
                i = i-1;
            }
            a[i+1] = key;
        }
        return;
    }

    void printarray(int[] a) {
        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k] + " ");
        }
        return;
    }
}

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;
        ReverseInteger ri = new ReverseInteger();
        int output = ri.reverseInt(x);
        System.out.println(output);
    }
    int reverseInt(int x) {
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x = x * -1;
        }
        long reversed = 0;
        while(x > 0) {
            reversed = (reversed*10) + (x % 10);
            x = x / 10;
        }

        if (reversed > Integer.MAX_VALUE) {
            return 0;
        }
        if (negative) {
            reversed = -1 * reversed;
        }
        return (int) reversed;
    }
}

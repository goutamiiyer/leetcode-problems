import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int num = 19;
        HappyNumber hn = new HappyNumber();
        boolean output = hn.happyNum(num);
        if(output) {
            System.out.println(num + " is a happy number :) ");
        } else {
            System.out.println(num + " is not a happy number :( ");
        }
    }

    boolean happyNum(int n) {
        Set<Integer> seenset = new HashSet<Integer>();
        seenset.add(n);
        while(n != 1) {
            int current = n;
            int sum = 0;
            while (current != 0) {
                sum += ((current%10)*(current%10));
                current = current/10;
            }
            if(seenset.contains(sum)) {
                return false;
            }
            seenset.add(sum);
            n = sum;
        }
        return true;
    }
}

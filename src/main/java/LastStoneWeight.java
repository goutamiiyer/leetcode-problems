public class LastStoneWeight {
    public static void main(String[] args) {
        LastStoneWeight lsw = new LastStoneWeight();
        int [] stones = new int[] {2,7,4,1,8,1};
        int output = lastStoneWeight(stones);
        System.out.println(output);
    }

    public static int lastStoneWeight(int[] stones) {

        // Set up the bucket array.
        int maxWeight = stones[0];
        for (int stone: stones) {
            maxWeight = Math.max(maxWeight, stone);
        }
        int[] buckets = new int[maxWeight + 1];

        // Bucket sort.
        for (int weight : stones) {
            buckets[weight]++;
        }

        // Scan through the buckets.
        int biggestWeight = 0;
        int currentWeight = maxWeight;
        while (currentWeight > 0) {
            if (buckets[currentWeight] == 0) {
                currentWeight--;
            } else if (biggestWeight == 0) {
                buckets[currentWeight] %= 2;
                if (buckets[currentWeight] == 1) {
                    biggestWeight = currentWeight;
                }
                currentWeight--;
            } else {
                buckets[currentWeight]--;
                if (biggestWeight - currentWeight <= currentWeight) {
                    buckets[biggestWeight - currentWeight]++;
                    biggestWeight = 0;
                } else {
                    biggestWeight -= currentWeight;
                }
            }
        }
        return biggestWeight;
    }
}
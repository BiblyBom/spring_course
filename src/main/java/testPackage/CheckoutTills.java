package testPackage;

import java.util.Arrays;
import java.util.List;

public class CheckoutTills {
    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] queues = new int[n];
        for (int customer : customers) {
            queues[0] += customer;
            Arrays.sort(queues);
        }
        return queues[n-1];
    }
}


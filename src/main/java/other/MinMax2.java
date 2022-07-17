package other;

import java.util.Arrays;

public class MinMax2 {
    private static int min;
    private static int max;
    private static long start;
    private static long end;

    public static void main(String[] args) {
        start = System.currentTimeMillis();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i + 3*(int)(Math.random()*5);
        }

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        min = array[0];
        max = array[9];
        end = System.currentTimeMillis();
        System.out.println("min = " + min
                + "\nmax = " + max + "\ntime = " + (end-start));
    }
}

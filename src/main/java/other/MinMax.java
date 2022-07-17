package other;

import java.util.Arrays;

public class MinMax {
    private static int min;
    private static int max;
    private static long start;
    private static long end;

    public static void main(String[] args) {
        start = System.currentTimeMillis();
        int[] array = new int[10];

        fillArray(array);

        System.out.println(Arrays.toString(array));

        findMinMax(array);
        end = System.currentTimeMillis();
        System.out.println("min = " + min
                + "\nmax = " + max + "\ntime = " + (end-start));
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 3*(int)(Math.random()*5);
        }
    }

    public static void findMinMax(int[] arr) {
        min = arr[0];
        max = arr[0];
        for (int i = 1; i < 10; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            else if (arr[i] > max) {
                max = arr[i];
            }
        }
    }
}

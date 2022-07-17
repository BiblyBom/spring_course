package testPackage;

// *** Ascending - Descending ***

public class TestClass {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(ascendDescend(83,-2, 11));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static String ascendDescend(int length, int minimum, int maximum) {
        String ascDesc = ascDesc(minimum, maximum);

        StringBuilder builder = new StringBuilder();

        while (builder.length() < length) {
        builder.append(ascDesc);
        }

        return builder.length() == length ? builder.toString() : (builder.delete(length, builder.length())).toString();
    }

    public static String ascDesc(int minimum, int maximum) {
        StringBuilder result = new StringBuilder();
        for (int i = minimum; i <= maximum; i++) {
            result.append(i);
        }
        for(int i = maximum -1; i > minimum; i--) {
            result.append(i);
        }

        return result.toString();
    }
}

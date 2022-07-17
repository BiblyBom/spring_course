package testPackage;

public class LargestSequence {
    public static void main(String[] args) {
        System.out.println(solve("283910"));
    }

    public static int solve(final String digits) {
        int largest = 0;
        int current = 0;
        for (int i = 0; i < digits.length() - 4; i++) {
            if ((current = Integer.parseInt(digits.substring(i, i + 5))) > largest) {
                largest = current;
            }
        }
        return largest; // you code here
    }
}

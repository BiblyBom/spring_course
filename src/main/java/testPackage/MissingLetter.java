package testPackage;

public class MissingLetter {
    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[] { 'O','Q','R','S' }));
    }

    public static char findMissingLetter(char[] array)
    {
        for (int i = 0; i < array.length - 1; i++) {
            if((int) array[i+1] - (int) array[i] > 1) {
                return (char) (array[i] + 1);
            }
        }
        return ' ';
    }
}

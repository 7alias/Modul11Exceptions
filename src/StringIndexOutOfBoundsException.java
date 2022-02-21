public class StringIndexOutOfBoundsException {
    public static void main(String[] args) {
        String str = "Hello World";
        char charAtNegativeIndex = str.charAt(-1); // Trying to access at negative index
        char charAtLengthIndex = str.charAt(11); // Trying to access at index equal to size of the string

    }
}


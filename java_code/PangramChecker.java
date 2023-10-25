import java.util.HashSet;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input.toLowerCase()); // Convert input to lowercase for case-insensitivity

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        HashSet<Character> set = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                set.add(c);
            }
        }

        return set.size() == 26; // There are 26 letters in the English alphabet
    }
}

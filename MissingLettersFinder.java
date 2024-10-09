import java.util.HashSet;

public class MissingLettersFinder {
    public static void main(String[] args) {
        String word = "Urvish"; // The word to check
        findMissingLetters(word);
    }

    public static void findMissingLetters(String word) {
        // Create a set to store all letters in the word
        HashSet<Character> lettersInWord = new HashSet<>();

        // Convert the word to uppercase and add each letter to the set
        for (char c : word.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                lettersInWord.add(c);
            }
        }

        // Check for missing letters in the alphabet
        StringBuilder missingLetters = new StringBuilder();
        for (char c = 'A'; c <= 'Z'; c++) {
            if (!lettersInWord.contains(c)) {
                missingLetters.append(c).append(" ");
            }
        }

        // Output the result
        if (missingLetters.length() > 0) {
            System.out.println("Missing letters from A-Z: " + missingLetters.toString().trim());
        } else {
            System.out.println("No missing letters. All letters are present.");
        }
    }
}

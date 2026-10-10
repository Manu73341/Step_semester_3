import java.util.Scanner;

public class TypingAccuracyChecker {

    static void checkTypingAccuracy(String original, String typed) {
        int matched = 0;
        int firstMismatch = -1;

        int length = Math.min(original.length(), typed.length());

        for (int i = 0; i < length; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }

        double accuracy = original.length() == 0 ? 100.0 :
                (matched * 100.0 / original.length());

        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%",
                matched, original.length(), accuracy);

        if (firstMismatch == -1 &&
                original.length() == typed.length()) {
            System.out.println(" | No Mismatches");
        } else if (firstMismatch != -1) {
            System.out.printf(
                " | First Mismatch at position %d ('%c' vs '%c')%n",
                firstMismatch + 1,
                original.charAt(firstMismatch),
                typed.charAt(firstMismatch));
        } else {
            System.out.println(" | Length Mismatch");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original passage: ");
        String original = sc.nextLine();

        System.out.print("Enter typed passage: ");
        String typed = sc.nextLine();

        checkTypingAccuracy(original, typed);
        sc.close();
    }
}
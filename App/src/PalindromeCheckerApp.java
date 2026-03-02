import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Strategy 1 - Two Pointer
        long startTime = System.nanoTime();
        boolean result = twoPointerCheck(input);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + duration + " ns");

        scanner.close();
    }

    /**
     * Two-pointer palindrome check
     */
    private static boolean twoPointerCheck(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
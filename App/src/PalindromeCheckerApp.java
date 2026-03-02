
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//usecase5
        public class PalindromeCheckerApp {

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                // Read input from user
                System.out.print("Input: ");
                String input = sc.nextLine();

                // Convert to lowercase (optional, for case-insensitive check)
                input = input.toLowerCase();

                // Create Queue (FIFO)
                Queue<Character> queue = new LinkedList<>();

                // Create Stack (LIFO)
                Stack<Character> stack = new Stack<>();

                // Insert each character into queue and stack
                for (char c : input.toCharArray()) {
                    queue.add(c);      // Enqueue
                    stack.push(c);     // Push
                }

                boolean isPalindrome = true;

                // Compare dequeue (queue) and pop (stack)
                while (!queue.isEmpty()) {
                    if (queue.remove() != stack.pop()) {
                        isPalindrome = false;
                        break;
                    }
                }

                System.out.println("Is Palindrome? : " + isPalindrome);

                sc.close();
            }
}



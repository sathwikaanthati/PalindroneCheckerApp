
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;;

//usecase7
        public class PalindromeCheckerApp {

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                // Read input string
                System.out.print("Input: ");
                String input = sc.nextLine();

                // Convert to lowercase (optional for case-insensitive check)
                input = input.toLowerCase();

                // Create a Deque
                Deque<Character> deque = new LinkedList<>();

                // Add each character into deque
                for (char c : input.toCharArray()) {
                    deque.addLast(c);   // insert at rear
                }

                boolean isPalindrome = true;

                // Compare front and rear elements
                while (deque.size() > 1) {

                    char front = deque.removeFirst();  // remove from front
                    char rear  = deque.removeLast();   // remove from rear

                    if (front != rear) {
                        isPalindrome = false;
                        break;
                    }
                }

                System.out.println("Is Palindrome? : " + isPalindrome);

                sc.close();
            }
}


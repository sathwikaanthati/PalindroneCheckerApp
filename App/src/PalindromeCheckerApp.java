
import java.util.Stack;
//usecase5
        public class PalindromeCheckerApp {

            public static void main(String[] args) {


                        // Declare and initialize the input string
                        String input = "noon";

                        // Create a Stack to store characters
                        Stack<Character> stack = new Stack<>();

                        // Push characters into stack
                        for (char c : input.toCharArray()) {
                            stack.push(c);
                        }

                        // Assume palindrome initially
                        boolean isPalindrome = true;

                        // Pop and compare
                        for (char c : input.toCharArray()) {
                            if (c != stack.pop()) {
                                isPalindrome = false;
                                break;
                            }
                        }

                        // Print output in required format
                        System.out.println("Input : " + input);
                        System.out.println("Is Palindrome? : " + isPalindrome);
                    }
                }

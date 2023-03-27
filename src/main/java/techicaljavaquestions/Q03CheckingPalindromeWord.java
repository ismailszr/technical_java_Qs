package techicaljavaquestions;

import java.util.Scanner;

public class Q03CheckingPalindromeWord {
    /*
     * Create a method in Java to check if a given inputted string is palindrome or not.
     * You have to use recursion.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give me a word so that I can check whether it is palindrome or not");
        String str = input.next();

        String reverseOfStr = "";

        for (int i = (str.length()-1); i >= 0 ; i--) {

            reverseOfStr = reverseOfStr + str.charAt(i);

        }

        if(str.equalsIgnoreCase(reverseOfStr)){

            System.out.println("Your word is palindrome!");

        } else {

            System.out.println("Your word is NOT palindrome!");
        }
    }
}

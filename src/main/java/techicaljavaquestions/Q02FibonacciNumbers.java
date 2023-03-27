package techicaljavaquestions;

import java.util.Scanner;

public class Q02FibonacciNumbers {

    /*

Ask user how many fibonacci numbers he wants to see. Then type the code that prints
these fibonacci numbers.
Ex: if user enters 6 output will be 112358

 */
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    System.out.println("How many numbers would you like to see in the Fibonacci sequence?");
    int num = input.nextInt();

        System.out.println("Your Fibonacci sequence is: ");
        int firstNum = 1;
        int secondNum = 1;

        if(num==1){
            System.out.println(firstNum);
        } else if (num==2) {
            System.out.println(""+firstNum+secondNum);
        } else if (num>2) {
            System.out.print(""+firstNum+secondNum);
            int fibNum=0;
            for (int i = 2; i < num; i++) {

                fibNum = firstNum + secondNum;
                System.out.print(fibNum);
                firstNum=secondNum;
                secondNum=fibNum;

            }

        }


    }
}
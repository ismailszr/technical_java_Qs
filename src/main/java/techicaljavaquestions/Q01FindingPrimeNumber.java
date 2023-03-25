package techicaljavaquestions;

import java.util.Scanner;

public class Q01FindingPrimeNumber {
    /*
     * Create a method in Java to check if a given inputted number is prime number or not
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please give me a number");
        int num = input.nextInt();
        System.out.println("Your number is = " + num);

        int counter=0;

        for (int i = 2; num > i ; i++) {

            if(num%i==0){
                counter++;
            }
        }

        if(counter==0){

            System.out.println("number is a prime number");
        } else {
            System.out.println("number is NOT a prime number");
        }


    }

}

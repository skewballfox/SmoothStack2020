package Day1;

import java.util.Scanner;

public class guessingGame {

    public static void main(String[] args) {
        int number = (int) ((Math.random() * (100 - 1)) + 1);
        int i = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Please enter a number between 1 and 100");
            int guess = (int) (input.nextInt());
            if (guess == number) {
                System.out.println("you got it, hooray!");
                System.exit(0);
            } else {
                System.out.println("That's not it, please try again");
            }
            i++;
        } while (i < 5);
        System.out.println("Sorry, the number was " + number + ", better luck next time");
    }
}

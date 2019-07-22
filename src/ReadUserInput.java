/*
* -Read 10 numbers from the console entered by the user and print the sum of those numbers.
-Create a Scanner like we did in the previous video.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message �gInvalid Number�h. Continue reading until you have read 10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message �gEnter number #x:�h where x represents the count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be �gEnter number #1:�h, the next �gEnter number #2: �h, and so on.

Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don�ft need it anymore.
-Create a project with the name ReadingUserInputChallenge.
*
* */
import java.util.Scanner;

public class ReadUserInput {

    public static void readUserInput() {
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        int input = 0;
        int counter = 0;
        int order = 1;
        while (order <= 10) {

            System.out.print("enter your number #" + order + ": ");
            if (!keyboard.hasNextInt()) {
                System.out.println("invalid input!");
                keyboard.nextLine();
                continue;

            }
            input = keyboard.nextInt();
            keyboard.nextLine();
            sum += input;
            order++;
        }

        System.out.println("sum = " + sum);
        keyboard.close();
    }

}

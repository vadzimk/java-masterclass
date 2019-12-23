/*-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.

        -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.

        -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.

        -In the main() method read the count from the console and call the method readIntegers() with the count parameter.

        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.

        -Finally, print the minimum element in the array.

        Tips:
        -Assume that the user will only enter numbers, never letters
        -For simplicity, create a Scanner as a static field to help with data input
        -Create a new console project with the name ЃeMinElementChallengeЃf
*/

import java.util.Scanner;

public class MinimumElementChallenge {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the count: ");
        int count = keyboard.nextInt();
        int[] arr = readIntegers(count);

        int min = findMin(arr);
        System.out.println("The minimum element is: " + min);
        keyboard.close();


    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " integers");
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = keyboard.nextInt();
        }
        return arr;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
}

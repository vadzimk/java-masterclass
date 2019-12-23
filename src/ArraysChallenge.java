/* Create a program using arrays that sorts a list of integers in descending order.
Descending order is highest value to lowest.
In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
ultimately have an array with 106,81,26, 15, 5 in it.

Set up the program so that the numbers to sort are read in from the keyboard.

Implement the following methods - getIntegers, printArray, and sortIntegers

getIntegers returns an array of entered integers from keyboard

printArray prints out the contents of the array

and sortIntegers should sort the array and return a new array containing the sorted numbers

you will have to figure out how to copy the array elements from the passed array into a new
array and sort them and return the new sorted array. */

import java.util.Scanner;

public class ArraysChallenge {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = getIntegers(4); // get 4 integers

        int[] sorted = sortIntegers(arr);

        printArray(sorted);


    }

    public static int[] getIntegers(int n) {
        System.out.println("enter " + n + " integers: ");
        int[] arr = new int[n]; //create new int array with n length

        for (int i = 0; i < n; i++) {
            arr[i] = keyboard.nextInt();
        }
        keyboard.close();
        return arr;
    }

    public static int[] sortIntegers(int[] input) {

        int[] arr = new int[input.length];
        //copy array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input[i];
        }

        //bubble sort arr
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

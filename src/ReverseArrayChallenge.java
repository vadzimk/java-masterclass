 /*-Write a method called reverse() with an int array as a parameter.

-The method should not return any value. In other words, the method is allowed to modify the array parameter.

-In main() test the reverse() method and print the array both reversed and non-reversed.

-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


Tip:
	-Create a new console project with the name ЃeReverseArrayChallengeЃf*/

import java.util.Arrays;
public class ReverseArrayChallenge {

    public static void main(String[] args){
        //print array
        int[] arr = {1, 2, 3, 4, 5, 6,7};
        System.out.println("initial array: " + Arrays.toString(arr));
        //print reversed array

        reverse(arr);

        System.out.println("sorted array: " + Arrays.toString(arr));
    }

    public static void reverse(int[] arr){
        for(int i=0; i<arr.length/2; i++){
            int temp= arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i]=temp;
        }
    }


}

/*
* -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message ЃgEnter number:Ѓh
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

Hint:
-Use an endless while loop.

Bonus:
-Create a project with the name MinAndMaxInputChallenge.*/

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void minMax(){
        Scanner keyboard =  new Scanner(System.in);

        int min=0, max=0, input=0;
        boolean first =true;

        while(true) {
            System.out.println("Enter a number: ");


            if(!keyboard.hasNextInt()){
                System.out.println("min = " + min + "\nmax = " + max);
                return;
            }

            input=keyboard.nextInt();
            if(first){
                min=input;
                max=input;
                first=false;
            }
            if(input>max){
                max=input;
            }

            if(input<min){
                min=input;
            }



        }
    }
}

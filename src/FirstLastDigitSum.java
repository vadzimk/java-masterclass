public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int num){

        if (num < 0)
            return -1;

        int number=num;
        int lastDigit= number%10;

        while (number>=10){
            number/=10;
        }
        return number+lastDigit;
    }
}

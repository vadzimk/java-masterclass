public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0)
            return -1;

        int sum = 0;
        int num=number;
        int digit=0;

        while (num>0){
            digit=num%10;
            if (digit%2==0){
                sum+=digit;
            }

            num/=10;
        }

        return sum;
    }
}

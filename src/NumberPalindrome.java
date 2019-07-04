public class NumberPalindrome {

    public static boolean isPalindrome (int num){
        if (num<0){
            num=-num;
        }
        int number=num;
        int reverse=0;
        int lastDigit=0;
        while(number>0) {
            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return num==reverse;

    }
}

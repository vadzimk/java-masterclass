public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            return -1;
        }

        int largest;

        if(first>second){
            largest=first;
        } else {
            largest=second;
        }

        for(int i=largest; i>0; i--){
            if(first%i==0 && second%i==0){
                return i;
            }
        }

        return 1;

    }
}

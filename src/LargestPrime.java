public class LargestPrime {
    // write your code here
    public static int getLargestPrime(int number) {
        // if negative, no prime numbers:
        if (number < 0) {
            return -1;
        }

    //find factor
        for(int i=number; i>1; i--){
            if(number%i==0){ //is a factor
                //check if is a prime
                //if has factors then is not a prime

                int current;
                for( current =i-1; current>1; current--){
                    if(i%current==0){
                        //is not a factor of a factor
                        //next current
                        continue;
                    }
                }
                System.out.println(current);

                if (current !=1 ){
                    return current;
                }
            }
        }

        return -2;
    }





//        for(int i=number; i>1; i--){
//            if(number %i==0 && isPrime(i)){
//                return i;
//            }
//        }
//        return 0;

    public static boolean isPrime(int i){


            if(i<=1)
                return false;

            for (int j = i-1 ; j > 1; j--) {
                if (i % j == 0) {
                    return false;
                }

            }

            return true;

    }
}

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    // write your code here

    public static int getLargestPrime(int number) {
        if (number < 0 || number == 0 || number == 1) return -1;
        int n = number;
        int factor = 2;

        while (n > 1) {
            if (n % factor == 0) {
                n = n / factor;
            } else {
                int next = factor+1;

                boolean isPrime = true;
                for (int i=next-1; i>1; i--){
                    if(next%i==0){
                        isPrime= false;
                    }
                }

                if (!isPrime){
                    next++;
                }
                factor = next;
            }
        }


        return factor;
    }

//    public static int nextPrime(int n){
//       int next = n+1;
//
//       if (!isPrime(next)){
//           next++;
//       }
//
//        return next;
//    }
//
//    public static boolean isPrime(int n){
//        for (int i=n-1; i>1; i--){
//            if(n%i==0){
//                return false;
//            }
//        }
//
//        return true;
//    }

}

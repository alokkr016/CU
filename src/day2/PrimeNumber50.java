package day2;

public class PrimeNumber50 {
    public static boolean isPrime(int n){

        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int i = 2;
        int count = 1;
        while(count <= 50){
            if(isPrime(i)){
                System.out.println(count + " " + i);
                count++;
            }
            i++;
        }
    }
}

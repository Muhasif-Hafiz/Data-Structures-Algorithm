package basicmaths;

public class checkForPrime {
    public static void main(String[] args) {

        System.out.println(isPrime(36));
    }
    public static boolean isPrime(int n){

        for(int i=2;i*i<=n;i++){
            if(n%2==0) return false;
        }
        return true;
    }
}

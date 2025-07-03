package basicmaths;

import java.util.Arrays;

public class sieve {
    public static void main(String[] args) {

        primes(30);
    }
    public static void primes(int n){
        int [] arr = new int[n+1];

        fillArray(arr, n);
        for(int i=2;i<=n;i++){
            if(arr[i]==1){
                for(int j=i*2 ;j<n;j+=i){
                    arr[j]= 0;
                }
            }
        }

        for(int i=2;i<n ;i++){
            if(arr[i]==1){
                System.out.println(i+     " ");
            }
        }

    }
    static int  [] fillArray(int  [] arr, int  n){

        for(int i=0;i<=n;i++){
            arr[i]= 1;
        }
        return arr;
    }
}

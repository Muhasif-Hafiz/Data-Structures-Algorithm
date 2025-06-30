package basicmaths;

import java.util.ArrayList;

public class printDivisors {
    public static void main(String[] args) {

//        ArrayList<Integer> ans = divisors(36);
//        System.out.println(ans);
        optimizedDivisors(36);

    }

    public static ArrayList<Integer> divisors(int N){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<=N;i++ ){
            if(N%i==0) list.add(i);
        }
        
        return list;
    }
    public static void  optimizedDivisors(int N){
        int limit =(int) Math.sqrt(N);

        for(int i =1;i<=limit;i++){

            if(N%i==0){
                System.out.print(i + " ");

                if(N/i != i){
                    System.out.print( N/i + " ");
                }
            }
        }
    }
}

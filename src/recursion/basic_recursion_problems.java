package recursion;
public class basic_recursion_problems {
    public static void main(String[] args) {

        //print_linearly_1_to_N(10);
       // print_reverse_linearly_N_to_1(10);
     //   print_names(10);
      int ans=   sumOfNumbers(10, 0);
        System.out.println(ans);
    }
    static void print_linearly_1_to_N(int n){
        if(n==0) return;
        print_linearly_1_to_N( n-1);
        System.out.println(n);
    }
    static void print_reverse_linearly_N_to_1(int n){
        if(n==0) return;
        System.out.println(n);
        print_reverse_linearly_N_to_1(n-1);
    }
    static void print_names(int n){
        if(n==0) return;
        System.out.println("Muhasib Hafeez");
        print_names(n-1);
    }
    public static int sumOfNumbers(int n,int sum){
        if(n==0) return sum;
        return sumOfNumbers(n-1 , sum+n);

    }
}

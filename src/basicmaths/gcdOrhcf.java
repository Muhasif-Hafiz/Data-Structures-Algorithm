package basicmaths;

public class gcdOrhcf {
    public static void main(String[] args) {

        //gcd(9,12) ;
        int ans = HCF(20,40);
        System.out.println(" GCD : " + ans);
    }
    static  void gcd(int n1, int n2){
        int gcd =1;
        int num = Math.min(n1,n2);

        for(int i=1;i*i<=num ;i ++){

            if(n1%i==0 && n2%i==0){

                gcd = i;
            }
        }
        System.out.print(" GCD of Number " +  n1 + "  and  " + n2 + " is : " + gcd + " " );
    }
    static int HCF(int n1, int n2){

        while(n1>0 && n2>0){

            if(n1>n2) n1= n1%n2;
            else n2 = n2%n1;

        }
        if(n1==0) return n2;

        return n1;
    }
}

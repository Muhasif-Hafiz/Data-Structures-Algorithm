package basicmaths;

public class armstrongNumbers {
    public static void main(String[] args) {
        int num= 54742;

       System.out.println("IsArmstrongNumber : " + isArmStrong(num));



    }
    public static boolean isArmStrong(int N){
        int original_Number = N;
        int armstrong_Number =0;
        int length= multiplyingFactor(N);

        while(N>0){
            int lastDigit = N%10;
            armstrong_Number=armstrong_Number + (int)Math.pow(lastDigit, length);
            N/=10;
        }
        return  original_Number==armstrong_Number;

    }
    public static  int multiplyingFactor(int N){
        int cnt =0;
        while (N>0){
            cnt++;
            N/=10;
        }
        return cnt;
    }
}

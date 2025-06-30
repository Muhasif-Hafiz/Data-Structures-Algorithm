package basicmaths;

public class Palindrome {
    public static void main(String[] args) {

        int number = 101;

        System.out.println("Is the Number palindrome : " + isPalindrome(number));

    }
    public static boolean isPalindrome(int N){
        int reversed = reversed(N);
        return N==reversed;
    }
    public static int reversed(int N){
        int num = 0;
        while(N>0){
            num = (num *10) + N%10;
            N/=10;
        }
        return num;
    }
}

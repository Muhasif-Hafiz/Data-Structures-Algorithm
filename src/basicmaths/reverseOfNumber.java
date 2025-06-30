package basicmaths;

public class reverseOfNumber {
    public static void main(String[] args) {

        int number = 10300;
        System.out.println("Original Number : " + number+ "\n" + "Reversed Number : " + reverse(number));

    }
    public static int reverse(int N){
        int newNum = 0;
        while(N>0){
            newNum = (newNum *10) +  N%10;
            N/=10;
        }
        return newNum;
    }
}

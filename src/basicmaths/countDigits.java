    package basicmaths;

    public class countDigits {
        public static void main(String[] args) {

            int ans=anotherWay(32134);
            System.out.println("Total Digits : " + ans);

        }
        public static int totalDigits(int N){
            int count=0;
            while(N>0){
                count++;
                N/=10;
            }
            return count;
        }
        public static int anotherWay(int N){
           return (int)Math.log10(N) +1;
        }
    }

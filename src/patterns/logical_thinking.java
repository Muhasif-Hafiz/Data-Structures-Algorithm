package patterns;

public class logical_thinking {
    public static void main(String[] args) {

        //square(5);
        // starRightAngledTriangle(5);
        // NumberedRightAngledTriangle(5);
        //inverseRightAngledTriangle(5);
       // inverseNumberedRightAngledTriangle(5);
      //  Diamond(10);
        hollowWall(5);

    }

    public static void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void starRightAngledTriangle(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void NumberedRightAngledTriangle(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void inverseRightAngledTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void inverseNumberedRightAngledTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
    public static void Diamond(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<n-1-i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<n-2-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hollowWall(int n){

        for(int i=0;i<n;i++){
            int space= n+2;
            for(int j=0;j<=i;j++){
                System.out.print(j+1 + " ");
            }
            for(int k =0; k< space -(i*2); k++){
                System.out.print("  ");
            }
            for(int l=0;l<=i;l++){
                System.out.print(i-l+1 + " ");
            }
            System.out.println();
        }
    }
}

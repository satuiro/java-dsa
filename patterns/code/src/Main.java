// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        pattern1(6);
        pattern13(5);
        }

    static void pattern2(int n){
        for (int rows = 1; rows <=n ; rows++) {
            // for col
            for (int column = 1; column <=n ; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int rows = 1; rows <=n ; rows++) {
            // for col
            for (int column = 1; column <=rows ; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int rows = 1; rows <=n ; rows++) {
            // for col
            for (int column = 5; column >=rows ; column--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int rows = 1; rows <=n ; rows++) {
            // for col
            for (int column = 1; column <=rows ; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row = 0; row < 2 * n; row++) {
            int c = row > n ? (2*n-row) :row;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern13(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {
            int c = row > n ? (2*n-row) :row;
            int noOfSpaces = n - c;

            for (int spaces = 0; spaces < noOfSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern30(int n){
        for (int rows = 1; rows <= n; rows++) {
//            int cols = rows;
            for (int spaces = 1; spaces <= n - rows; spaces++) {
                System.out.print(" ");
            }
            for (int col = rows; col >= 1 ; col--) {
                System.out.print(col + "");
            }
            for (int col = 2; col <= rows ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        for (int row = 0; row <=2 * n ; row++) {
            for (int col = 0; col <=2 * n ; col++) {
                int atEveryIndex = n -  Math.min(Math.min(row, col),Math.min(2*n-row,2*n-col));
                System.out.print(atEveryIndex);
            }
            System.out.println();
        }
    }
}

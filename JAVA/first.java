import java.util.Scanner;

public class first {

    public static void printSquarePattern(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printRightTrianglePattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printInvertedRightTrianglePattern(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPyramidPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Square Pattern:");
        printSquarePattern(rows);

        System.out.println("\nRight Triangle Pattern:");
        printRightTrianglePattern(rows);

        System.out.println("\nInverted Right Triangle Pattern:");
        printInvertedRightTrianglePattern(rows);

        System.out.println("\nPyramid Pattern:");
        printPyramidPattern(rows);
    }
}

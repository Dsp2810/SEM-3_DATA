import java.util.Scanner;

public class second {

    public static void printthesum(int arr[], int x) {
        int sum = 0;
        for (int p = 0; p < x; p++) {
            sum += arr[p];

        }
        System.out.println("THE SUM OF THE ALL THE GIVEN ARRAY IS...");
        System.out.print(sum);
    }

    public static void main(String args[])
    {
        int x[]={1,2,3,4,5};
        printthesum(x, 5);
    }
}

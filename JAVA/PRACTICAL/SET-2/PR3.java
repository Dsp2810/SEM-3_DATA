import java.util.*;

public class PR3 {
    public static boolean check(int[] a) {
        int size = a.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == 9 && i < 4) {
                count++;
            }
        }
        if (count != 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int size;
        Scanner dp = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        size = dp.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("a[" + (i + 1) + "]=");
            a[i] = dp.nextInt();
            System.out.println();
        }
        System.out.println("one of the first 4 elements in the array is 9 " + check(a));
        System.out.println("THIS PROGRAM IS PERFORED BY 23CS060-DHAVAL S PATEL");

    }
}

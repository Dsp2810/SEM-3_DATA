
import java.util.*;

public class PR2 {

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
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == 9) {
                count++;
            }
        }
        System.out.println("OCUURANCE IF TTHE NUMBER 9 IS: [" + count + "]  TIMES");
        System.out.println("THIS PROGRAM IS PERFORED BY 23CS060-DHAVAL S PATEL");

    }
}

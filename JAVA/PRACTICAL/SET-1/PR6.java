import java.util.*;

public class PR6 {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner dp = new Scanner(System.in);
        int n;
        n = dp.nextInt();
        dp.close();
        int reminder, sum = 0;
        while (n != 0) {
            reminder = n % 10;
            sum = sum * 10 + reminder;
            n = n / 10;
        }
        System.out.println("The reverse number is...");
        System.out.print(sum);
        System.out.println("THIS PROGRAM IS PERFORED BY 23CS060-DHAVAL S PATEL");
        System.out.println(12/10);;

    }
}

import java.util.Scanner;

public class PR1 {
    public static void main(String[] args) {
        double pound, rupees;
        Scanner dp = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF POUND:");
        pound = dp.nextDouble();
        rupees = pound * 100;
        System.out.println("CONVERTION OF POUND INTO RUPEES IS :" + pound * 100);
    }
}
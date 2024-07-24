import java.util.*;

public class member {
    static double salary;
    static String name;
    static int age;
    static long phone_num;
    static String address;

    public static void get_data() {
        Scanner dp = new Scanner(System.in);
        System.out.println("ENTER THE NAME:");
        name = dp.nextLine();
        System.out.println("ENTER THE AGE:");
        age = dp.nextInt();

        System.out.println("ENTER THE PHONE NUMBER:");
        phone_num = dp.nextLong();

        dp.nextLine(); 

        System.out.println("ENTER THE ADDRESS:");
        address = dp.nextLine();

        System.out.println("ENTER THE SALARY:");
        salary = dp.nextDouble();
    }

    public static void printdata() {
        System.out.println("---------------------------");
        System.out.println("|NAME: " + name+" |");
        System.out.println("|AGE: " + age+" |");
        System.out.println("|PHONE NUMBER: " + phone_num+" |");
        System.out.println("|ADDRESS: " + address+" |");
        System.out.println("|SALARY IS: " + salary+" |");
    }
}

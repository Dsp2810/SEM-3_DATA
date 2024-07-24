import java.util.*;

public class manager extends member {
    static String department;

    public static void get_data() {
        System.out.println("FOR MANAGER");
        Scanner dp = new Scanner(System.in);
        member.get_data();
        System.out.println("ENTER THE DEPARTMENT:");
        department = dp.nextLine();
    }

    public static void printdata() {
        member.printdata();
        System.out.println("DEPARTMENT:" + department + " |");
        System.out.println("---------------------------");
    }
}

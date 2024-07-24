
import java.util.*;
public class employee extends member{
    static String specialization;
    public static void get_data()
    {
        Scanner dp = new Scanner(System.in);          
        System.out.println(":FOR THE EMPLOYEE:");
        member.get_data();
        System.out.println("ENTER THE SPECIALIZATION:");
        specialization = dp.nextLine();
    }
    public static void printdata()
    {
        member.printdata();
        System.out.println("|SPECIALIZATION:"+specialization+" |");
        System.out.println("---------------------------");

    }
    
}

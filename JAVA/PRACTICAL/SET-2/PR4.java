import java.util.*;

public class PR4 {

    public static String print(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            s1 += s.charAt(i);
            s1 += s.charAt(i);

        }
        return s1;

    }

    public static void main(String[] args) {
        String s1;
        Scanner dp = new Scanner(System.in);
        System.out.println("ENTER THE STRING:");
        s1 = dp.nextLine();
        System.out.println("THE STRING:" + print(s1));
        System.out.println("THIS PROGRAM IS PERFORED BY 23CS060-DHAVAL S PATEL");

    }
}

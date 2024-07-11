import java.util.*;
import java.lang.String;

public class PR5 {

    public static String work(String s1) {
        String[] s2 = s1.split(" ");
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < s2.length; i++) {
            String reversedWord = new StringBuilder(s2[i]).reverse().toString();
            ss.append(reversedWord).append(" ");
        }
        return ss.toString().trim();
    }

    public static void main(String[] args) {
        String s1 = "";
        Scanner dp = new Scanner(System.in);
        System.out.println("ENTER THE STRING:");
        s1 = dp.nextLine();
        System.out.println(work(s1));
        System.out.println("THIS PROGRAM IS PERFORED BY 23CS060-DHAVAL S PATEL");

    }
}

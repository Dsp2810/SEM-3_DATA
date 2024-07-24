import java.util.Scanner;

public class PR1 {

    public static void main(String args[]) {
        String s;
        Scanner dp = new Scanner(System.in);
        System.out.println("ENTER STRING::");
        s = dp.nextLine();
        if (s.length() < 3) {
            System.out.println("ENTER THE STRING PROVIDED HAS MINIMUM 3 CHARACTERS");
        } else {
            int n;
            System.out.println("ENTER THE NUMBER FOR YOU WANT TO PRINT FIRST 3 CHARACTERS");
            n = dp.nextInt();
            String s1 = s.substring(0, 3);
            for (int i = 0; i < n; i++) {
                System.out.print(s1);
            }
            String s12 =null;
        }
        dp.close();
        System.out.println("THIS PROGRAM IS PERFORED BY 23CS060-DHAVAL S PATEL");

    }
}
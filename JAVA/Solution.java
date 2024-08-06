import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lineNumber = 1;

        while (s.hasNext()) {
            String line = s.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;   
        }

        s.close();
    }
}

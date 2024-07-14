import java.lang.String;
import java.util.*;

public class PR7 {

    public static String repl(String s,char first,char last){
        return (s.replace(first, last));
    }
    public static String toextract(String s,String s1)
    {
        return ();

    }
    public static void main(String[] args) {
        String s1;
        Scanner dp = new Scanner(System.in);
        System.out.println("ENTER THE STRING:");
        s1 = dp.nextLine();
        System.out.println("THE LENGTH OF THE GIVEN STRING IS:" + s1.length());
        System.out.println("THE REPLACING OF THE CHAR OF THE GIVEN STRING IS:" + repl(s1,'H','N')); 
        System.out.println("CONVERTING IN UPPER CASSE OF THE GIVEN STRING IS:"+s1.toUpperCase());
       System.out.println("THIS PROGRAM IS PERFORMED BY 23CS060-DHAVAL S PATEL");
    }
}

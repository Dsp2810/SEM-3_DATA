import java.util.*;

public class PRACTICALR6 {

    
    public static String tolwr(String s)
    {
        return s.toLowerCase();
    }
    public static String toupr(String s)
    {
        return s.toUpperCase();
    }
    public static String rev(String s)
    {
       return new StringBuilder(s).reverse().toString();
    }
    public static String sort(String s)
    {
            char s1[]=new char[s.length()];
            s1=s.toCharArray();
            Arrays.sort(s1);
            return new String(s1);
    }

    
    public static void main(String[]args)
    {

        String s1 ;
        Scanner dp = new Scanner(System.in);
        System.out.println("ENTER THE STRING:");
        s1 = dp.nextLine();
        System.out.println("THE LENGTH OF THE GIVEN STRING IS:"+s1.length());
        System.out.println("CONVERTING IN LOWER CASSE OF THE GIVEN STRING IS:"+tolwr(s1));
        System.out.println("CONVERTING IN UPPER CASSE OF THE GIVEN STRING IS:"+toupr(s1));
        System.out.println("CONVERTING IN REVERSE THE GIVEN STRING IS:"+rev(s1));
        System.out.println("CONVERTING IN SORT IN THE GIVEN STRING IS:"+sort(s1));

    }
}
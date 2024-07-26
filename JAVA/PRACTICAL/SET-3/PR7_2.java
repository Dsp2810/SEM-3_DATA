import java.util.*;
public class PR7_2{
    public static void main(String[] args){
        StringBuilder s = new StringBuilder("HELLO");
        System.out.println("Before modify == "+ s);
        modify(s);
        System.out.println("After modify == "+ s);
        System.out.println("THIS PROGRAM IS PERFORED BY 23CS060-DHAVAL S PATEL");
    }
    public static void modify(StringBuilder s){
        s.append(" world");
        System.out.println("Modify == "+s);
    }
}
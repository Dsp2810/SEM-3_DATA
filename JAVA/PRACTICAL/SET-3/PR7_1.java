import java.util.*;
public class PR7_1{
    public static void main(String[] args){
        int count = 60;
        System.out.println("Before value = "+count);
        modify(count);
        System.out.println("After modification = "+count);
        System.out.println("THIS PROGRAM IS PERFORED BY 23CS060-DHAVAL S PATEL");
    }
    public static void modify(int y){
        y++;
        System.out.println("Modify value = "+y);
    }
}
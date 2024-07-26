import java.time.Month;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

class Date {

   private int month, day, year;

    Date() {
        month = 0;
        day = 0;
        year = 0;
    }

    public void Setdata(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void getdata() {
        Scanner dp = new Scanner(System.in);
        System.out.println("ENTER DAY:");
        day = dp.nextInt();
        System.out.println("ENTER MONTH:");
        month = dp.nextInt();
        System.out.println("ENTER YEAR:");
        year = dp.nextInt();
        dp.close();
    }

    public void printdata() {
        System.out.println("THE OUTPUT AS IN THE FORMAT OF DD/MM/YY");
        System.out.println(day + " / " + month + " / " + year);
    }

}

public class PR4 {
    public static void main(String[] args) {
        Date d1= new Date();
        d1.getdata();
        d1.printdata();
        System.out.println("THIS PROGRAM IS PERFORED BY 23CS060-DHAVAL S PATEL");

    }
    }


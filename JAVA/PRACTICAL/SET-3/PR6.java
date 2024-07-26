import java.util.Scanner;

public class PR6 {
    public static void main(String[] args) {
        complex c1 = new complex();
        complex c2 = new complex();
        complex c3 = new complex();
        complex c4 = new complex();
        complex c5 = new complex();
        c1.get_data();
        c2.get_data();
        c3 = c1.adiition(c2);
        c4 = c1.subtraction(c2);
        c5 = c1.multipication(c2);
        System.out.println("ADITION OF TWO COMPLEX NUMBER IS:\n [ " + c3.real + " + " + c3.imaginary + "j ]");
        System.out.println("SUBTRACTION OF TWO COMPLEX NUMBER IS:\n [ " + c4.real + " + " + c4.imaginary + "j ]");
        System.out.println("MULTIPICATION OF TWO COMPLEX NUMBER IS:\n [ " + c5.real + " + " + c5.imaginary + "j ]");
        System.out.println("THIS PROGRAM IS PERFORED BY 23CS060-DHAVAL S PATEL");

    }
}

class complex {
    int real, imaginary;

    complex() {
        real = 0;
        imaginary = 0;
    }

    public void get_data() {
        Scanner dp = new Scanner(System.in);
        System.out.println("ENTER THE REAL PART OF THE COMPLEX NUMBER: ");
        real = dp.nextInt();
        System.out.println("ENTER THE IMAGINARY PART OF THE COMPLEX NUMBER: ");
        imaginary = dp.nextInt();
    }

    public complex adiition(complex x) {
        complex c = new complex();
        c.real = real + x.real;
        c.imaginary = imaginary + x.imaginary;
        return c;
    }

    public complex subtraction(complex x) {
        complex c = new complex();
        c.real = real - x.real;
        c.imaginary = imaginary - x.imaginary;
        return c;
    }

    public complex multipication(complex x) {
        complex c = new complex();
        c.real = (real * x.real) - (imaginary * x.imaginary);
        c.imaginary = (real * x.imaginary) + (imaginary * x.real);
        return c;
    }
}
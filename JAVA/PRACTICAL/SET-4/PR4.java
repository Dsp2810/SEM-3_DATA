public class PR4 {
    public static void main(String[] args) {
        A a1 = new A(1);
        B b1 = new B(3);
        B.printBoth();
        System.out.println("THIS PROGRAM IS PERFORMED BY DHAVAL S PATEL 23CS060");
    }

}

class A {
    static int x;
    A()
    {

    }
    A(int x) {
        this.x = x;
    }
}

class B extends A {
    static int x;

    B(int x) {
        super();
        this.x = x;
    }

    public static void printBoth() {
        System.out.println("THE VALUE OF PARENT CLASS'S  X IS:" + A.x);
        System.out.println("THE VALUE OF CHILD CLASS'S  X IS:" + x);
    }
}

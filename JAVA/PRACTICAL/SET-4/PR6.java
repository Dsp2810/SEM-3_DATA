public class PR6 {
    public static void main(String[] args) {
        Q q1 = new Q();
        q1.displayP1();
        q1.displayP2();
        q1.displayP12();
    }
}

interface p1 {
    final static int x = 10;

    public void displayP1();

}

interface p2 {
    final static int y = 20;

    public void displayP2();
}

interface p12 extends p1, p2 {
    public void displayP12();
}

class Q implements p12 {
    public void displayP1() {
        System.out.println("THE VALUE OF X IS: {" + p1.x + "} FROM P1");
    }

    public void displayP2() {
        System.out.println("THE VALUE OF Y IS: {" + p2.y + "} FROM P2");
    }

    public void displayP12() {
        System.out.println("THE VALUE OF X IS: {" + p1.x + "} FROM P1");
        System.out.println("THE VALUE OF Y IS: {" + p2.y + "} FROM P2");
    }

}

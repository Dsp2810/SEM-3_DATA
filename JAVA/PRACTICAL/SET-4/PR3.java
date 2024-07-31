import org.w3c.dom.css.Rect;

public class PR3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 3);
        Square s1 = new Square(2, 3, 4);
        Rectangle.printArea();
        Rectangle.printPeremeter();
        Square.printArea();
        Square.printPeremeter();

    }

}

class Rectangle {
    static double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static void printArea() {
        System.out.println("THE ARE OF THE RECTANGLE IS " + (length * breadth));
    }

    public static void printPeremeter() {
        System.out.println("THE Paremeter OF THE RECTANGLE IS " + 2 * (length + breadth));
    }
}

class Square extends Rectangle {
    static double side;

    Square(double length, double breadth, double side) {
        super(length, breadth);
        this.side = side;
    }

    public static void printArea() {
        System.out.println("****************************");
        Rectangle.printArea();
        System.out.println("THE ARE OF THE Square IS " + (side * side));
        System.out.println("****************************");
    }

    public static void printPeremeter() {
        System.out.println("****************************");
        System.out.println("THE ARE OF THE RECTANGLE IS " + (length * breadth));
        Rectangle.printPeremeter();
        System.out.println("THE ARE OF THE Square IS " + 4 * side);
        System.out.println("****************************");
    }
}

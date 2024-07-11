//  SET-3;

public class PR2 {
    public static void main(String[] args) {
        TriangleArea t1 = new TriangleArea();
        TriangleArea t2 = new TriangleArea(2);
        TriangleArea t3 = new TriangleArea(2, 3);
        System.out.println("THIS PROGRAM IS PERFORED BY 23CS060-DHAVAL S PATEL");
    }

}

class TriangleArea {
    private double radius;
    private double length, height;

    TriangleArea() {
        radius = 0;
        length = 0;
        height = 0;
        System.out.println("DEFAULT CONSTRUCTOR CALLED");
    }

    TriangleArea(double r) {
        radius = r;
        System.out.println("THE AREA OF THE CIRCLE IS::" + (3.14 * radius * radius));
    }

    TriangleArea(double l, double h) {
        length = l;
        height = h;
        System.out.println("THE AREA OF THE TRIANGLE IS::" + (length * height) / 2);
    }
}

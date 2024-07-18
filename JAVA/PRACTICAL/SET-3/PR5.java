class Area{

    double length,breadth;

    Area(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public double rectangle_area()
    {
        return (length*breadth);
    }
}

public class PR5 {
    public static void main(String[] args) {
        Area a1 = new Area(12, 14);
        double area= a1.rectangle_area();
        System.out.println("THE AREA OF THE RECTANGLE IS: "+area);
    }
    
}

class Area{

    double length,breadth;

    Area(double length, double breadth)
    {
        if(length<0 || breadth <0)
        {
            System.out.println("no");
        }
        else{

            this.breadth = breadth;
            this.length = length;
        }
    }
    public double rectangle_area()
    {
        return (length*breadth);
    }
}

public class PR5 {
    public static void main(String[] args) {
        Area a1 = new Area(-12, 14);
        double area= a1.rectangle_area();
        System.out.println("THE AREA OF THE RECTANGLE IS: "+area);
        System.out.println("THIS PROGRAM IS PERFORED BY 23CS060-DHAVAL S PATEL");

    }
    
}

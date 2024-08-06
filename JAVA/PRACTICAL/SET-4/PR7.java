public class PR7 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue");

        // Create signs
        Sign circleSign = new Sign(circle, "Welcome to the Circle Zone");
        Sign rectangleSign = new Sign(rectangle, "Welcome to the Rectangle Zone");

        // Display signs
        circleSign.displaySign();
        System.out.println();
        rectangleSign.displaySign();

        System.out.println("THIS PROGRAM IS PERFORMED BY DHAVAL S PATEL 23CS060");
    }
}

interface Shape {
    double getArea();

    String getColor();

    default String getInfo() {
        return "AREA IS: " + getArea() + " COLOR IS: " + getColor();
    }
}

class Circle implements Shape {
    private double radius;
    private String color;

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return color;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getColor() {
        return color;
    }
}

class Sign {
    private Shape shape;
    private String text;

    Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void displaySign() {
        System.out.println("Sign Text: " + text);
        System.out.println("Shape Info: " + shape.getInfo());
    }
}

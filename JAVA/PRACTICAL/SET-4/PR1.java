
public class PR1 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();
        c1.printData();
        p1.printData();
    }
}

class Parent {
    public void printData() {
        System.out.println("THIS IS PARENT CLASS");
    }
}

class Child extends Parent {
    public void printData() {
        super.printData();
        System.out.println("THIS IS CHILD CLASS");
    }
}

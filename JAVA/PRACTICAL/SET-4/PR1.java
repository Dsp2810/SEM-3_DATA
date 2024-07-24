public class PR1 {
    public static void main(String[] args) {
        parent p1 = new parent();
        child c1 = new child();
        c1.printdata();
        p1.printdata();
    }
}

class parent {
    public void printdata() {
        System.out.println("THIS IS PARENT CLASS");
    }
}

class child extends parent {
    public void printdata() {
        super.printdata();
        System.out.println("THIS IS CHILD CLASS");
    }
}
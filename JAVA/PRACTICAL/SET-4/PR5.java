public class PR5 {
    public static void main(String[] args) {
        Degree d1 = new Degree();
        UnderGraduate u1 = new UnderGraduate();
        PostGraduate p1 = new PostGraduate();
        Degree.getDegree();
        UnderGraduate.getDegree();
        PostGraduate.getDegree();
        
    }
}


class Degree{
    public static void getDegree()
    {
        System.out.println("I GOT A DEGRREE");
    }
}

class  UnderGraduate extends Degree{
    public static void getDegree()
    {
        System.out.println("I AM UnderGraduate");
    }
}

class  PostGraduate extends Degree{
    public static void getDegree()
    {
        System.out.println("I AM PostGraduate");
    }
}
import java.util.Scanner;

public class PR5 {
    public static void main(String[] args) {
        int[] code = { 1, 2, 3, 4, 5 };
        float[] tax = { 8, 12, 5, 7.5f, 3 };
        String[] product = { "Motor", "Fan", "Tube", "Witres", "Other" };
        int[] price = { 100, 234, 131, 56, 576 };
        for (int i = 0; i < code.length; i++) {
            System.out.println(code[i] + " code for the " + product[i]);
        }
        Scanner h = new Scanner(System.in);
        System.out.println("ENTER CODE FOR GENERATE BILL...");
        int x = h.nextInt();
        h.close();
        switch (x) {
            case 1:
                System.out.println("PRICE OF MOTOR ==");
                float y;
                y = price[x - 1] + ((price[x - 1] * tax[x - 1]) / 100);
                System.out.println(y);
                break;
            case 2:
                System.out.println("PRICE OF FAN ==");
                float m;
                m = price[x - 1] + ((price[x - 1] * tax[x - 1]) / 100);
                System.out.println(m);
                break;
            case 3:
                System.out.println("PRICE OF TUBE ==");
                float v;
                v = price[x - 1] + ((price[x - 1] * tax[x - 1]) / 100);
                System.out.println(v);
                break;
            case 4:
                System.out.println("PRICE OF WIRES ==");
                float b;
                b = price[x - 1] + ((price[x - 1] * tax[x - 1]) / 100);
                System.out.println(b);
                break;
            case 5:
                System.out.println("PRICE OF OTHERS ==");
                float c;
                c = price[x - 1] + ((price[x - 1] * tax[x - 1]) / 100);
                System.out.println(c);
                break;
            default:
                System.out.println("CODE IS WRONG!!!");
                System.out.println("PLESE ENTER THE CORRECT CODE...");
                System.out.println("THIS PROGRAM IS PERFORED BY 23CS060-DHAVAL S PATEL");

        }
    }
}

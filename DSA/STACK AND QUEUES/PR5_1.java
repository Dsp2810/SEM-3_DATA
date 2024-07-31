import java.util.Scanner;

public class PR5_1 {
    private int[] arr;
    private int top;
    private int size;

    public PR5_1(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void pushStack() {
        Scanner DP = new Scanner(System.in);
        if (top == size - 1) {
            System.out.println("[YOU HAVE REACHED THE MAXIMUM SIZE OF THE STACK]....");
        } else {
            System.out.println("Enter the element to push:");
            int x = DP.nextInt();
            arr[++top] = x;
        }
    }

    public void popStack() {
        if (top == -1) {
            System.out.println("[STACK IS EMPTY]....");
        } else {
            System.out.println("Popped element: " + arr[top--]);
        }
    }

    public void peakStack() {
        if (top == -1) {
            System.out.println("[NO ELEMENTS IN THE STACK]......");
        } else {
            System.out.println("TOP ELEMENT IS: " + arr[top]);
        }
    }

    public void displayStack() {
        if (top == -1) {
            System.out.println("[STACK IS EMPTY]......");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner DP = new Scanner(System.in);
        PR5_1 stack = new PR5_1(7);
        int choice = -1;

        while (choice != 5) {
            System.out.println("****************************");
            System.out.println("ENTER YOUR CHOICE FOR");
            System.out.println("1. PUSHING ELEMENTS IN STACK");
            System.out.println("2. POPPING ELEMENTS FROM THE STACK");
            System.out.println("3. PEEK ELEMENT IN STACK");
            System.out.println("4. DISPLAY ELEMENTS FROM THE STACK");
            System.out.println("5. EXIT");
            System.out.println("****************************");

            choice = DP.nextInt();

            switch (choice) {
                case 1:
                    stack.pushStack();
                    break;
                case 2:
                    stack.popStack();
                    break;
                case 3:
                    stack.peakStack();
                    break;
                case 4:
                    stack.displayStack();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("ENTER A VALID CHOICE");
            }
        }

        DP.close();
    }
}

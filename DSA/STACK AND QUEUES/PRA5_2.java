import java.util.Scanner;

public class PRA5_2 {

    static int[] arr = new int[7];
    static int front = -1, rear = -1;

    public static void add_queue(int[] arr) {
        Scanner dp = new Scanner(System.in);
        if (rear == arr.length - 1) {
            System.out.println("OVERFLOW CONDITION");
        } else {
            if (front == -1 && rear == -1) {
                front++;
                rear++;
            } else {
                rear++;
            }
            int val;
            val = dp.nextInt();
            arr[rear] = val;
        }
        System.out.println();
    }

    public static void del_queue(int[] arr) { // o(1)
        if (front == -1) {
            System.out.println("UNDER FLOW CONDITION");
        } else {
            if (front == rear) {
                front = rear = -1;
            } else {
                int r_e = arr[front];
                System.out.println(" " + r_e + " ");
                front++;
            }
            System.out.println();
        }
    }

    // public static void del_queue1(int[] arr) { // o(n)
    // if (front == -1) {
    // System.out.println("UNDER FLOW CONDITION");
    // } else {
    // if (front == rear) {
    // front = rear = -1;
    // } else {
    // int r_e = arr[front];
    // System.out.println(" " + r_e + " ");
    // rear--;
    // for (int i = 0; i <= rear; i++) {
    // arr[i] = arr[i + 1];
    // }
    // }
    // System.out.println();
    // }
    // }

    public static void peak_element(int[] arr) {
        System.out.println("PEAK ELEMENT IS: " + arr[front]);
    }

    public static void display_queue(int[] arr) {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int choice = 0;
        Scanner dp1 = new Scanner(System.in);
        while (choice != 5) {
            System.out.println("ENTER YOUR CHOICE:");
            System.out.print(
                    " 1 . PUSHING ELEMNTS IN STACK \n 2. POPING ELEMENTS FROM THE STACK\n 3 . PEACK ELEMENT  IN STACK\n 4. DISPLAY ELEMENTS FROM THE STACK\n 5. EXIT \n");
            choice = dp1.nextInt();
            switch (choice) {
                case 1:
                    add_queue(arr);
                    break;
                case 2:
                    del_queue(arr);
                    break;
                case 3:
                    peak_element(arr);
                    break;
                case 4:
                    display_queue(arr);
                    break;
                default:
                    System.out.println("ENTER THE VALID CHOICE ");
            }
        }

        // System.out.println("THIS PROGRAM IS PERFORMED BY DHAVAL S PATEL 23CS060");
    }
}
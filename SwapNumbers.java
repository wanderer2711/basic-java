import java.util.Scanner;
public class SwapNumbers {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter another number: ");
        int b = sc.nextInt();
        int c;
        System.out.println("Number before swapping: " + "a = " + a + " b = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("Number after swapping: " + "a = " + a + " b = " + b);
    }
}
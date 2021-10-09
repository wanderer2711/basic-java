import java.util.Scanner;

public class LargestNumber {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        System.out.println("Enter number 3: ");
        int c = sc.nextInt();
        int temp;
        int largest;

        if (a > b) {
            temp = a;
        } else {
            temp = b;
        }
        if (c > temp) {
            largest = c;
        } else {
            largest = temp;
        }
        System.out.println("Largest Number is: " + largest);
    }
}
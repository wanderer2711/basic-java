import java.util.Scanner;

public class PowerOfTwo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        if (a <= 31) {
            for (int i =0; i <= a; i++) {
                int p = (int) Math.pow(2, i);
                System.out.println("2 ^ " + i + " = " + p);
            }
        } else {
            System.out.println("Enter number less than 31");
        }
    }
}
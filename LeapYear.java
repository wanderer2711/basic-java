import java.util.Scanner;
public class LeapYear {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int a = sc.nextInt();
        if (a < 999) {
            System.out.println("Enter number greater than 999");
        } else {
            if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
                System.out.println("It's a Leap Yesr");
            } else {
                System.out.println("It's not a Leap Year");
            }
        }
    }
}
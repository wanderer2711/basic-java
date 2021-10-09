import java.util.Scanner;
public class FlipCoin {
    public static void main (String[] args) {
        int tails = 0;
        int heads = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter number of times to flip coin: " + a);
        int b =0;

        while (b < a) {
            double coin = Math.random();
            if (coin <= 0.5) {
                System.out.println("It's Tails");
                tails++;
            } else {
                System.out.println("It's heads");
                heads++;
            }
            b += 1;

        }
        System.out.println(b);
        System.out.println(tails);
        System.out.println(heads);
        int tailsPercent = (tails * 100) / b;
        System.out.println(tailsPercent);
        int headsPercent = (heads * 100) / b;
        System.out.println(headsPercent);
    }
}
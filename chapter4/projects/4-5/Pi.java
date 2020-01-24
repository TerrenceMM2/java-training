import java.util.Scanner;

public class Pi {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        double a = 0;
        double count = 0;
        double sum = 0;
        double d = 1;
        double pi = 0.0;

        System.out.print("Number of iterations: ");
        a = reader.nextInt();

        for (int i = 0; i < a; i++) {
            if (a == 1) {
                System.out.println("1 iteration");
                sum = 1.0;
            } else if (count % 2 == 0) {
                System.out.println("Odd number.");
                sum = (sum + (1 / d));
                count++;
            } else if (count % 2 != 0) {
                System.out.println("Even number.");
                sum = (sum - (1 / d));
                count++;
            }
            d += 2;
        }

        System.out.println("Sum is " + sum);
        pi = 4.0 * sum;

        System.out.println("Pi with " + a + " number of iterations is " + pi);

    }

}
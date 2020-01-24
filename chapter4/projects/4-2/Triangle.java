import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        double a = 0;
        double b = 0;
        double c = 0;

        System.out.print("Side A: ");
        a = Math.pow(reader.nextDouble(), 2);

        System.out.print("Side B: ");
        b = Math.pow(reader.nextDouble(), 2);

        System.out.print("Side C: ");
        c = Math.pow(reader.nextDouble(), 2);

        System.out.println("Side A^2 = " + a);
        System.out.println("Side B^2 = " + b);
        System.out.println("Side C^2 = " + c);

        if (c == a + b) {
            System.out.println("This is a right triangle.");
        } else if (c != a + b) {
            System.out.println("This is NOT a right triangle.");
        }

    }

}
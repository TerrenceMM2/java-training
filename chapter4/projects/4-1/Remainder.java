import java.util.Scanner;

public class Remainder {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int q = 0;
        int r = 0;

        System.out.print("Number: ");
        a = reader.nextInt();

        System.out.print("divided by Number: ");
        b = reader.nextInt();

        if (a > b) {
            q = a / b;
            r = a % b;
        } else if (b > a) {
            q = b / a;
            r = b % a;
        }

        System.out.println("Quotient = " + q);
        System.out.println("Remainder = " + r);

    }

}
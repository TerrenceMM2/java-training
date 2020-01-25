import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter base system: ");
        double base = reader.nextDouble();

        System.out.print("Enter an exponent: ");
        double power = reader.nextDouble();

        while (power != -1) {
            double output = Math.pow(base, power);
            System.out.println(base + " to the power of " + power + " is " + output);
        
            System.out.print("Enter base system: ");
            base = reader.nextDouble();

            System.out.print("Enter an exponent: ");
            power = reader.nextDouble();
        }
        

    }

}
import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter an exponent: ");
        double power = reader.nextDouble();

        while (power != -1) {
            double output = Math.pow(2, power);
            System.out.println("2 to the power of " + power + " is " + output);
        
            System.out.print("Enter an exponent: ");
            power = reader.nextDouble();
        }
        

    }

}
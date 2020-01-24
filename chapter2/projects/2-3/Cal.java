import java.util.Scanner;

public class Cal {

    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        double kilometers;
        double nauticalMiles;

        System.out.print("Enter number of kilometers: ");
        kilometers = reader.nextDouble();

        nauticalMiles = kilometers / 1.852;

        System.out.print("This equates to " + nauticalMiles + " in nautical miles.");
    }

}
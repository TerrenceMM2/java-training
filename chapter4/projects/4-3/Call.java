import java.util.Scanner;

public class Call {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        double minutes = 0;
        double cost = 0.50;
        double total = 1.15;

        System.out.print("Call phone length in minutes: ");
        minutes = reader.nextDouble();

        if (minutes > 2) {
            total += cost * (minutes - 2);
            System.out.println("Your total is $" + total);
        } else {
            System.out.println("Your total is $" + total);
        }

    }

}
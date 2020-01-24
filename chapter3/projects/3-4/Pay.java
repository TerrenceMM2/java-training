import java.util.Scanner;
import java.text.DecimalFormat;

public class Pay {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        double wage;
        double hours;
        double overtimeHours;
        double total;

        System.out.print("Enter the hourly rate: ");
        wage = reader.nextDouble();

        System.out.print("Enter the total hours worked: ");
        hours = reader.nextDouble();

        System.out.print("Enter the overtime hours worked: ");
        overtimeHours = reader.nextDouble();

        total = wage * hours + (overtimeHours * (wage * 1.5));

        System.out.println("The calculated pay is " + df.format(total) + ".");
    }

}
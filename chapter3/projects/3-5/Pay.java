import java.util.Scanner;
import java.text.DecimalFormat;

public class Pay {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        double wage;
        double hours = 0;
        double overtime = 0;
        double total;

        System.out.print("Enter the hourly rate: ");
        wage = reader.nextDouble();

        System.out.print("Monday hours worked: ");
        hours += reader.nextDouble();

        System.out.print("Monday OVERTIME hours worked: ");
        overtime += reader.nextDouble();

        System.out.print("Tuesday hours worked: ");
        hours += reader.nextDouble();

        System.out.print("Tuesday OVERTIME hours worked: ");
        overtime += reader.nextDouble();

        System.out.print("Wednesday hours worked: ");
        hours += reader.nextDouble();

        System.out.print("Wednesday OVERTIME hours worked: ");
        overtime += reader.nextDouble();

        System.out.print("Thursday hours worked: ");
        hours += reader.nextDouble();

        System.out.print("Thursday OVERTIME hours worked: ");
        overtime += reader.nextDouble();

        System.out.print("Friday hours worked: ");
        hours += reader.nextDouble();

        System.out.print("Friday OVERTIME hours worked: ");
        overtime += reader.nextDouble();

        System.out.println("Hours: " + hours);
        System.out.println("Overtime: " + overtime);
        
        total = wage * hours + (overtime * (wage * 1.5));

        System.out.println("The calculated pay is " + df.format(total) + ".");
    }

}
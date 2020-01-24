import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double number, sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a positive number or -1 to quit: ");
            number = reader.nextDouble();
            if (number == -1) break;
            sum += number;
            count++;
        }

        if (count == 0 )
            System.out.println("The list is empty.");
        else
            System.out.println("The average is " + sum / count);

    }

}

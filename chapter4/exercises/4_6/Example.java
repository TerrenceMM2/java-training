import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double number, sum = 0;
        int i, count;

        System.out.print("How long is the list? ");
        count = reader.nextInt();
        for (i = 1; i <= count; i++) {
            System.out.print("Enter a positive number: ");
            number = reader.nextDouble();
            sum += number;
        }

        if (count == 0)
            System.out.println("You entered no numbers.");
        else
            System.out.println("The average is " + sum / count);

    }

}

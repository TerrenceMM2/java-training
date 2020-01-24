import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number greater than 0: ");
        int number = reader.nextInt();
        long product = 1;
        int count = 1;
        while (count <= number) {
            product = product * count;
            System.out.println(product);
            System.out.println("Number = " + number);
            System.out.println("Count = " + count);
            count++;
        }
        System.out.println("Tha factorial of " + number + " is " + product);
    }

}
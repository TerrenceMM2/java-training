import java.util.Scanner;
import java.io.*;

public class Average {

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(new File("numbers.txt"));
        double number, sum = 0;
        int count = 0;

        while (reader.hasNext()) {
            number = reader.nextDouble();
            sum += number;
            count++;
        }

        if (count == 0 )
            System.out.println("The file had no numbers.");
        else
            System.out.println("The average of " + count + " numbers is " + sum / count);

    }

}

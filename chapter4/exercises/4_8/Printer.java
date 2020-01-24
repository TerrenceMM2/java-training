import java.util.Scanner;
import java.io.*;

public class Printer {

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(new File("numbers.txt"));
        PrintWriter writer = new PrintWriter(new File("new_numbers.txt"));

        while (reader.hasNext()) {
            int number = reader.nextInt();
            if (number != 0)
                writer.println(number);
        }

        writer.close();

    }

}

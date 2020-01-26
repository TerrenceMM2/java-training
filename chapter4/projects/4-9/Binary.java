import java.util.Scanner;
import java.io.*;

public class Binary {

    public static void main(String[] args) throws IOException {

        Scanner reader = new Scanner(new File("numbers.txt"));      

        while (reader.hasNext()) {
            double base = reader.nextDouble();
            double power = reader.nextDouble();
            double output = Math.pow(base, power);

            System.out.println(base + " to the power of " + power + " is " + output);
        }
        

    }

}
import java.util.Scanner;

public class Cube {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double length;
        double area;
        final double sides = 6.0;

        System.out.print("Please enter the length of the cube: ");
        length = reader.nextDouble();

        area = sides * (length * length);

        System.out.println("The area of the cube is " + area + " feet squared.");

    }

}
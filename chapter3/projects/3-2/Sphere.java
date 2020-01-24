import java.util.Scanner;

public class Sphere {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double radius;
        double diameter;
        double circumference;
        double area;
        double volume;

        System.out.print("Please enter the radius of the sphere: ");
        radius = reader.nextDouble();

        diameter = 2.0 * radius;
        circumference = 2.0 * 3.14 * radius;
        area = 4 * 3.14 * (radius * radius);
        volume = (4.0 / 3.0) * 3.14 * (radius * radius * radius);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("The diameter of the sphere is " + diameter + ".");
        System.out.println("The circumference of the sphere is " + circumference + ".");
        System.out.println("The area of the sphere is " + area + ".");
        System.out.println("The volume of the sphere is " + volume + ".");

    }

}
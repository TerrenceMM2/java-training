import java.util.Scanner;

public class Momentum {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int mass;
        int velocity;
        int momentum;

        System.out.print("Enter the mass of the object: ");
        mass = reader.nextInt();

        System.out.print("Enter the velocity of the object: ");
        velocity = reader.nextInt();

        momentum = mass * velocity;

        System.out.println("The calculated momentum of your object is " + momentum + ".");
    }

}
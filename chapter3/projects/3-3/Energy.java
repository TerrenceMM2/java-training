import java.util.Scanner;

public class Energy {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double mass;
        double velocity;
        double momentum;
        double energy;

        System.out.print("Enter the mass of the object: ");
        mass = reader.nextInt();

        System.out.print("Enter the velocity of the object: ");
        velocity = reader.nextInt();

        momentum = mass * velocity;
        energy = (1.0 / 2.0) * mass * (velocity * velocity);

        System.out.println("The calculated momentum of your object is " + momentum + ".");
        System.out.println("The calculated kinetic energy of your object is " + energy + ".");
    }

}
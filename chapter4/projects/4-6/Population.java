import java.util.Scanner;

public class Population {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        int organisms = 0;
        int growthRate = 0;
        int growthHours = 0;
        int totalHours = 0;

        System.out.print("Number of starting organisms: ");
        organisms = reader.nextInt();

        System.out.print("Growth rate (*): ");
        growthRate = reader.nextInt();

        System.out.print("Hours of growth cycle: ");
        growthHours = reader.nextInt();

        System.out.print("Total growth period: ");
        totalHours = reader.nextInt();

        while (totalHours > 0) {
            organisms = organisms * growthRate;
            totalHours = totalHours - growthHours;
        }

        System.out.println("The total population is now " + organisms);
    }

}
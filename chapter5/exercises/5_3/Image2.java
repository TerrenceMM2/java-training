import images.APImage;
import images.Pixel;
import java.util.Scanner;

public class Image2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String filename = reader.nextLine();
        APImage image = new APImage("otter.jpeg");

        for (Pixel p : image) {
            int red = p.getRed();
            int green = p.getGreen();
            int blue = p.getBlue();
            int average = (red + green + blue) / 3;
            p.setRed(average);
            p.setGreen(average);
            p.setBlue(average);
        }
        image.save();
        System.out.print("Image converted and saved.");
        System.exit(0);
    }

}
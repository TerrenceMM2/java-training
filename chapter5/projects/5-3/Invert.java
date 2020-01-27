import images.APImage;
import images.Pixel;
import java.util.Scanner;

public class Invert {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        APImage image = new APImage("otter.jpeg");
        image.draw();

        for (Pixel p : image) {
            int red = 255 - p.getRed();
            int green = 255 - p.getGreen();
            int blue = 255 - p.getBlue();
            int average = (red + green + blue) / 3;
            if (average < 128) {
                p.setRed(red);
                p.setGreen(green);
                p.setBlue(blue);
            } else {
                p.setRed(red);
                p.setGreen(green);
                p.setBlue(blue);
            }
        }
        System.out.print("Press return to continue:");
        reader.nextLine();
        image.draw();
    }
}
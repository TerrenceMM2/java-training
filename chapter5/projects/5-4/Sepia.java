import images.APImage;
import images.Pixel;
import java.util.Scanner;

public class Sepia {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        APImage image = new APImage("otter.jpeg");
        image.draw();

        for (Pixel p : image) {
            int red = p.getRed();
            int green = p.getGreen();
            int blue = p.getBlue();
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

            if (red < 63) {
                red = (int)(red * 1.1);
                blue = (int)(blue * 0.9);
            } else if (red < 192) {
                red = (int)(red * 1.15);
                blue = (int)(blue * 0.85);
            } else {
                red = Math.min((int)(red * 1.08), 255);
                blue = (int)(blue * 0.93);
            }
        }
        System.out.print("Press return to continue:");
        reader.nextLine();
        image.draw();
    }
}
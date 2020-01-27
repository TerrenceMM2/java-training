import images.APImage;
import images.Pixel;
import java.util.Scanner;

public class Filter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        APImage image = new APImage("otter.jpeg");
        image.draw();

        for (Pixel p : image) {
            int red = p.getRed();
            int green = p.getGreen();
            int blue = p.getBlue();

            int filterRed = 50;
            int filterGreen = 0;
            int filterBlue = 0;

            red += filterRed;
            blue += filterBlue;
            green += filterGreen;

            p.setRed(red);
            p.setGreen(green);
            p.setBlue(blue);
        }
        System.out.print("Press return to continue:");
        reader.nextLine();
        image.draw();
    }
}
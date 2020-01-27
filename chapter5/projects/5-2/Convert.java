import images.APImage;
import images.Pixel;
import java.util.Scanner;

public class Convert {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        APImage image = new APImage("otter.jpeg");
        image.draw();
        for (Pixel p : image) {
            double red = p.getRed();
            double green = p.getGreen();
            double blue = p.getBlue();
            double average = ((red * .299) + (green * .587) + (blue * .114));
            if (average < 128) {
                p.setRed(0);
                p.setGreen(0);
                p.setBlue(0);
            } else {
                p.setRed(255);
                p.setGreen(255);
                p.setBlue(255);
            }
        }
        System.out.print("Press return to continue:");
        reader.nextLine();
        image.draw();
    }

}
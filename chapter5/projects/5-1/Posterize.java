import images.APImage;
import images.Pixel;
import java.util.Scanner;
import java.util.Random;

public class Posterize {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        APImage image = new APImage("otter.jpeg");
        image.draw();
        Random gen = new Random();

        int color1 = gen.nextInt(256);
        int color2 = gen.nextInt(256);
        int color3 = gen.nextInt(256);
        int color4 = gen.nextInt(256);
        int color5 = gen.nextInt(256);
        int color6 = gen.nextInt(256);

        for (Pixel p : image) {
            int red = p.getRed();
            int green = p.getGreen();
            int blue = p.getBlue();
            int average = (red + green + blue) / 3;
            if (average < 128) {
                p.setRed(color1);
                p.setGreen(color2);
                p.setBlue(color3);
            } else {
                p.setRed(color4);
                p.setGreen(color5);
                p.setBlue(color6);
            }
        }
        System.out.print("Press return to continue:");
        reader.nextLine();
        image.draw();
    }
}
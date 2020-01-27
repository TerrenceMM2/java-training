import images.APImage;
import images.Pixel;
import java.util.Scanner;

public class Blur {

    public static void main(String[] args) {
        Scanner intReader = new Scanner(System.in);

        APImage image = new APImage("otter.jpeg");
        image.draw();

        int width = image.getWidth();
        int height = image.getHeight();
        APImage theSketch = new APImage(width, height);

        for (int y = 1; y < height - 2; y++) {
            for (int x = 1; x < width - 2; x++) {
                Pixel leftPixel = image.getPixel(x - 1, y);
                Pixel bottomPixel = image.getPixel(x, y + 1);
                Pixel rightPixel = image.getPixel(x + 1, y);
                Pixel topPixel = image.getPixel(x, y - 1);

                int redAve = (leftPixel.getRed() + bottomPixel.getRed() + rightPixel.getRed() + topPixel.getRed()) / 4;
                int blueAve = (leftPixel.getBlue() + bottomPixel.getBlue() + rightPixel.getBlue() + topPixel.getBlue()) / 4;
                int greenAve = (leftPixel.getGreen() + bottomPixel.getGreen() + rightPixel.getGreen() + topPixel.getGreen()) / 4;

                Pixel newPixel = theSketch.getPixel(x, y);
                newPixel.setRed(redAve);
                newPixel.setGreen(greenAve);
                newPixel.setBlue(blueAve);
            }
        }
        theSketch.draw();

        theSketch.saveAs();
        System.out.print("Image converted and saved.");
        System.exit(0);
    }

}
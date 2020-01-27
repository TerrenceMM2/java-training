import images.APImage;
import images.Pixel;
import java.util.Scanner;

public class Blur {

    public static void main(String[] args) {
        Scanner intReader = new Scanner(System.in);
        System.out.print("Enter an integer threshold: ");
        int threshold = intReader.nextInt();

        System.out.print("Enter the degree of sharpening: ");
        int degree = intReader.nextInt();

        APImage image = new APImage("otter.jpeg");
        image.draw();

        int width = image.getWidth();
        int height = image.getHeight();
        APImage theSketch = new APImage(width, height);

        for (int y = 0; y < height - 1; y++) {
            for (int x = 1; x < width; x++) {
                Pixel oldPixel = image.getPixel(x, y);
                Pixel leftPixel = image.getPixel(x - 1, y);
                Pixel bottomPixel = image.getPixel(x, y + 1);

                int red = oldPixel.getRed();
                int green = oldPixel.getGreen();
                int blue = oldPixel.getBlue();

                int oldAve = (oldPixel.getRed() + oldPixel.getGreen() + oldPixel.getBlue()) / 3;
                int leftAve = (leftPixel.getRed() + leftPixel.getGreen() + leftPixel.getBlue()) / 3;
                int bottomAve = (bottomPixel.getRed() + bottomPixel.getGreen() + bottomPixel.getBlue()) / 3;

                Pixel newPixel = theSketch.getPixel(x, y);
                if (Math.abs(oldAve - leftAve) <= threshold || Math.abs(oldAve - bottomAve) <= threshold) {
                    newPixel.setRed(red + degree);
                    newPixel.setGreen(green + degree);
                    newPixel.setBlue(blue + degree);
                }
            }
        }
        theSketch.draw();
    }

}
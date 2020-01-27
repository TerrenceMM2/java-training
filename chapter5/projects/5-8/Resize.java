import images.APImage;
import images.Pixel;
import java.util.Scanner;

public class Resize {

    public static void main(String[] args) {
        Scanner resizeFactor = new Scanner(System.in);
        System.out.print("Enter the shrink factor: ");
        int factor = resizeFactor.nextInt();

        APImage image = new APImage("otter.jpeg");
        image.draw();

        int width = image.getWidth();
        int height = image.getHeight();
        APImage theSketch = new APImage(width, height);

        for (int y = 1; y < height; y++) {
            if (y % factor == 0) {
                for (int x = 1; x < width; x++) {
                    if (x % factor == 0) {
                        Pixel oldPixel = image.getPixel(x, y);
                        Pixel newPixel = theSketch.getPixel((x / factor), (y / factor));
    
                        int red = oldPixel.getRed();
                        int green = oldPixel.getGreen();
                        int blue = oldPixel.getBlue();
                        
                        newPixel.setRed(red);
                        newPixel.setGreen(green);
                        newPixel.setBlue(blue);
                    }                    
                }
            }
        }
        theSketch.draw();
        // theSketch.saveAs();
        // System.out.print("Image converted and saved.");
        // System.exit(0);
    }

}
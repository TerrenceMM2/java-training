import images.APImage;
import images.Pixel;
import java.util.Scanner;

public class Rotate {

    public static void main(String[] args) {
        APImage image = new APImage("otter.jpeg");
        image.draw();

        int width = image.getWidth();
        int height = image.getHeight();
        APImage theSketch = new APImage(width, height);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Pixel oldPixel = image.getPixel(x, y);
                Pixel newPixel = theSketch.getPixel(y, (width - x) - 1);

                int red = oldPixel.getRed();
                int green = oldPixel.getGreen();
                int blue = oldPixel.getBlue();  
                
                newPixel.setRed(red);
                newPixel.setGreen(green);
                newPixel.setBlue(blue); 
            }
        }
        theSketch.draw();
        // theSketch.saveAs();
        // System.out.print("Image converted and saved.");
        // System.exit(0);
    }

}
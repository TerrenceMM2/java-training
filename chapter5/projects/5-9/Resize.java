import images.APImage;
import images.Pixel;
import java.util.Scanner;

public class Resize {

    public static void main(String[] args) {
        Scanner resizeFactor = new Scanner(System.in);
        System.out.print("Enter the growth factor: ");
        int factor = resizeFactor.nextInt();

        APImage image = new APImage("otter.jpeg");
        image.draw();

        int width = image.getWidth();
        int height = image.getHeight();
        APImage theSketch = new APImage((width * factor), (height * factor));

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Pixel oldPixel = image.getPixel(x, y);
                Pixel newPixel = theSketch.getPixel(x, y);

                int red = oldPixel.getRed();
                int green = oldPixel.getGreen();
                int blue = oldPixel.getBlue();  

                for (int z = 0; z < ; z++) {
                    Pixel leftPixel = theSketch.getPixel((x + factor), y);

                }
                Pixel rightPixel = theSketch.getPixel((theSketch.getWidth() - factor), y);    
                
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
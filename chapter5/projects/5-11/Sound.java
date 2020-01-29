import sounds.APSoundClip;
import sounds.Sample;
import java.util.Scanner;

public class Sound {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a volume factor: ");
        double factor = reader.nextDouble();
        APSoundClip clip = new APSoundClip("money.wav");
        for (Sample s : clip) {
            int newValue = (int)(s.getValue() * factor);
            if (newValue > s.MAX_VALUE) {
                newValue = s.MAX_VALUE;
                s.setValue(newValue);
            } else if (newValue < s.MIN_VALUE) {
                newValue = s.MIN_VALUE;
                s.setValue(newValue);
            }
            s.setValue(newValue);
        }
        clip.draw();
        clip.play();
    }

}
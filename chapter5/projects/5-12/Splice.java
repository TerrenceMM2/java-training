import sounds.APSoundClip;
import sounds.Sample;
import java.util.Scanner;

public class Splice {

    public static void main(String[] args) {
        APSoundClip clip1 = new APSoundClip("test_1.wav");
        APSoundClip clip2 = new APSoundClip("test_2.wav");
        for (Sample s : clip1) {
            int newValue = (int)(s.getValue());
            clip1.setValue(newValue);
        }
        for (Sample s : clip2) {
            int newValue = (int)(s.getValue());
            clip1.setValue(newValue);
        }
        clip1.draw();
        clip1.play();
    }

}
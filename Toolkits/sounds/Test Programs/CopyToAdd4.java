import sounds.*;

public class CopyToAdd4{

   public static void main(String[]args){
      APSoundClip clip = new APSoundClip("money.wav");
      clip.draw();
      clip.play();
      APSoundClip aCopy = clip.clone();
      for (Sample s: aCopy)
         s.setValue(s.getValue() + 4);               
      aCopy.draw();
      aCopy.save();
   }
}
      
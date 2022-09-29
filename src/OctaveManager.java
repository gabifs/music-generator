public class OctaveManager {
  static final int DEFAULT_OCTAVE = 5;
  static int octave = DEFAULT_OCTAVE;

  public static void increaseOctave(int num){
    octave += 1;
    if(octave > 9) resetOctave();
  }

  public static void resetOctave(){
    octave = DEFAULT_OCTAVE;
  }
}

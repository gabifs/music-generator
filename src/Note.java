public class Note {
  static final int DEFAULT_OCTAVE = 5;

  int octave = DEFAULT_OCTAVE;

  public String runNote(String note){
    return note + octave + " ";
  }

  public void increaseOctave(int num){
    octave += 1;
    if(octave > 9) resetOctave();
  }

  public void resetOctave(){
    octave = DEFAULT_OCTAVE;
  }
}

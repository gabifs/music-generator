import java.util.ArrayList;

public class Parser {

  public static String parseCommands(String txt){

    Note notesManager = new Note();
    Instrument instrumentManager = new Instrument();
    Volume volumeManager = new Volume();

    String song = "X[Volume]="+volumeManager.VOLUME_DEFAULT+" ";

    for(int index = 0; index < txt.length(); index++){
      var currentChar = txt.charAt(index);

      switch(currentChar){
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
          song = song + notesManager.runNote(""+currentChar);
          break;

        case '.':
        case '?':
          notesManager.increaseOctave();
          break;

        case ' ':
          song = song + volumeManager.increase();
          break;

        case 'O':
        case 'o':
        case 'I':
        case 'i':
        case 'U':
        case 'u':
          song = song + instrumentManager.useHarpichord();
          break;

        case '\n':
          song = song + instrumentManager.useTubularBells();
          break;

        case ';':
          song = song + instrumentManager.usePanFlute();
          break;

        case ',':
          song = song + instrumentManager.useChurchOrgan();
          break;

        case '!':
          song = song + instrumentManager.useAgogo();
          break;

        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
          song = song + instrumentManager.increaseInstrument(Character.getNumericValue(currentChar));
          break;

        default:
          if(index > 0){
            String prevChar = Character.toString(txt.charAt(index-1));
            ArrayList<String> charSet = new ArrayList<String>();
            charSet.add("A");
            charSet.add("B");
            charSet.add("C");
            charSet.add("D");
            charSet.add("E");
            charSet.add("F");
            charSet.add("G");
            if(charSet.contains(prevChar)){
              song = song + notesManager.runNote(prevChar);
            }else {
              song = song + "R ";
            }
          } else {
            song = song + "R ";
          }

      }
    }

    return song;
  }


}

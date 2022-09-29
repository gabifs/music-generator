import java.util.ArrayList;

public class Parser {

  public static String parseCommands(String txt){

    String song = "";
    Note notesManager = new Note();

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
          // aumenta o volume

        case 'O':
        case 'o':
        case 'I':
        case 'i':
        case 'U':
        case 'u':
          // change instrument harp

        case '\n':
          // troca instrumengo tubular bells

        case ';':
          // troca instrumento pan flute

        case ',':
          // troca isntrumento church organ

        case '!':
          // troca instrumento agogo

        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
          // troca instrumento

        default:
          if(index-1 > 0){
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
            }
          }

      }
    }

    return song;
  }


}

import javax.swing.JFrame;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import org.jfugue.Pattern;


public class Files {

  public String loadTextFile(JFrame frame) {
    JFileChooser fileChooser = new JFileChooser();
    int state = fileChooser.showOpenDialog(frame);

    String text = "";

    if (state == JFileChooser.APPROVE_OPTION) {
      File file = fileChooser.getSelectedFile();

      try {
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);

        String line = buffer.readLine();

        while (line != null) {
          text = text + line + "\n";
          line = buffer.readLine();
        }

        reader.close();

      } catch (Exception ex) {
          ex.printStackTrace();
          return "Error loading file...";
      }

    }
    return text;
  }

  public void saveMidiFile(String txt){
    String fileName = "sua_musica.mid";
    File file = new File(fileName);

    org.jfugue.Player player = new org.jfugue.Player();
    try{
      player.saveMidi(new Pattern(txt), file);

    }catch (IOException err){
      System.out.println("Error saving the file.");
      err.printStackTrace();
    }
  }
}

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;


public class Gui extends JFrame implements ActionListener{

  JButton buttonPlay;
  JButton buttonLoadFile;
  JButton buttonSaveMidi;
  JTextArea textArea;
  JFrame frame;

  Gui(){
    JPanel panel = new JPanel(new FlowLayout());

    // Define Title
    JLabel title = new JLabel("Trabalho de TCP");
    title.setBounds(100, 100, 30, 30);
    title.setFont(new Font("Consolas", Font.PLAIN, 20));

    // Define TextArea
    this.textArea = new JTextArea();
    this.textArea.setLineWrap(true);
    this.textArea.setSize(448, 64);
    this.textArea.setFont(new Font("Consolas", Font.PLAIN, 20));
    this.textArea.setRows(10);
    JScrollPane scrollPane = new JScrollPane(textArea);

    // Define play button
    this.buttonPlay = new JButton("Play");
    this.buttonPlay.addActionListener(this);

    // Define load file button
    this.buttonLoadFile = new JButton("Carregar arquivo");
    this.buttonLoadFile.addActionListener(this);

    // Define save midi file
    this.buttonSaveMidi = new JButton("Salvar MIDI");
    this.buttonSaveMidi.addActionListener(this);

    // Adds components to panel, and panel to frame
    panel.add(title);
    panel.add(this.buttonLoadFile);
    panel.add(this.buttonSaveMidi);
    panel.add(scrollPane);
    panel.add(this.buttonPlay);

    this.add(panel);

    // Adds config to frame
    this.setTitle("Musicnator");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setSize(512, 400);;
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent event) {

    if (event.getSource() == this.buttonPlay) playCommands();

    if (event.getSource() == this.buttonLoadFile) loadFile();

    if (event.getSource() == this.buttonSaveMidi) saveMidi();

  }

  void playCommands(){
    String txt = this.textArea.getText();
    String song = Parser.parseCommands(txt);
    System.out.println(song);

    Player.play(song);
  }

  void loadFile(){
    Files file = new Files();
    String text = file.loadTextFile(this.frame);

    this.textArea.setText(text);
  }

  void saveMidi(){
    System.out.println("Salvar MIDI");
  }
}

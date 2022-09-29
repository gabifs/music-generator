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

  // JFrame frame;
  JButton playButton;
  JButton loadFileButton;
  JButton saveMidiButton;
  JTextArea textArea;

  Gui(){
    JPanel panel = new JPanel(new FlowLayout());

    // Define Title
    JLabel title = new JLabel("Trabalho de TCP");
    title.setBounds(100, 100, 30, 30);
    title.setFont(new Font("Consolas", Font.PLAIN, 20));

    // Define TextArea
    this.textArea = new JTextArea();
    textArea.setLineWrap(true);
    textArea.setSize(448, 64);
    textArea.setFont(new Font("Consolas", Font.PLAIN, 20));
    textArea.setRows(10);
    JScrollPane scrollPane = new JScrollPane(textArea);

    // Define play button
    this.playButton = new JButton("Play");
    playButton.addActionListener(this);

    // Define load file button
    this.loadFileButton = new JButton("Carregar arquivo");
    loadFileButton.addActionListener(this);

    // Define save midi file
    this.saveMidiButton = new JButton("Salvar MIDI");
    saveMidiButton.addActionListener(this);

    // Adds components to panel, and panel to frame
    panel.add(title);
    panel.add(scrollPane);
    panel.add(this.playButton);
    panel.add(this.loadFileButton);
    panel.add(this.saveMidiButton);

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


  }
}

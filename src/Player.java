import org.jfugue.Pattern;

public class Player {
  public static void play(String txt){
    org.jfugue.Player player = new org.jfugue.Player();
    Pattern song = new Pattern(txt);
    player.play(song);
  }
}

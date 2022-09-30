public class Volume {
  final int VOLUME_DEFAULT = 4000;
  int volume = VOLUME_DEFAULT;

  public String reset() {
    this.volume = VOLUME_DEFAULT;
    return "X[Volume]=" + this.volume + " ";
  }

  public String increase() {
    int newVolume = this.volume * 2;
    if(newVolume <= 16000){
      this.volume = newVolume;
      return "X[Volume]=" + this.volume + " ";
    }else{
      return reset();
    }
  }
}

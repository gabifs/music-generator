public class Instrument {
  int instrument = 0;
  final int harpichord = 6;
  final int tubularBells = 14;
  final int churchOrgan = 19;
  final int panFlute = 75;
  final int agogo = 113;

  public String buildInstrument(int midiNumber){
    return "I["+midiNumber+"]"+" ";
  }

  public String increaseInstrument(int increment){
    return buildInstrument(instrument + increment);
  }

  public String useHarpichord(){
    this.instrument = harpichord;
    return buildInstrument(harpichord);
  }

  public String useTubularBells(){
    this.instrument = tubularBells;
    return buildInstrument(tubularBells);
  }

  public String useChurchOrgan(){
    this.instrument = churchOrgan;
    return buildInstrument(churchOrgan);
  }

  public String usePanFlute(){
    this.instrument = panFlute;
    return buildInstrument(panFlute);
  }

  public String useAgogo(){
    this.instrument = agogo;
    return buildInstrument(agogo);
  }
}

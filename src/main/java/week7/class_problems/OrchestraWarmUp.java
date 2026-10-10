abstract class Instrument {Instrument(){super();}public abstract String play();}
class StringInstrument extends Instrument {StringInstrument(){super();}public String play(){return "Strumming the strings";}}
class Violin extends StringInstrument {Violin(){super();}public String play(){return super.play()+", with a bow drawn across four strings";}}
public class OrchestraWarmUp {public static void main(String[] args){StringInstrument s=new StringInstrument();Violin v=new Violin();System.out.println(s.play());System.out.println(v.play());}}
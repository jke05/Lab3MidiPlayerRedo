
public class TuneCreator
{
    // instance variables - replace the example below with your own
    private MidiPlayer player;
    private SimpleTune tune;

    
    public TuneCreator(){
        player = new MidiPlayer();
    }

    public void CreateAndPlay(){
        tune = new SimpleTune();
        tune.addNote("C", 7);
        tune.addNote("A", 10);
        tune.addNote("C#", 5);
        tune.addNote("D", 10);
        
        player.playTune(tune);
    }
}
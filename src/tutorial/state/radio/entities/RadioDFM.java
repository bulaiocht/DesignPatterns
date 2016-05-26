package tutorial.state.radio.entities;

/**
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class RadioDFM implements Station {
    @Override
    public void play() {
        System.out.println("Radio FM...");
    }
}

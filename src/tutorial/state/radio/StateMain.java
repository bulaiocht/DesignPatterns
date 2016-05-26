package tutorial.state.radio;

import tutorial.state.radio.entities.Radio;
import tutorial.state.radio.entities.RadioDFM;
import tutorial.state.radio.entities.Station;

/**
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class StateMain {
    public static void main(String[] args) {

        //State
        Station station = new RadioDFM();

        //Context
        Radio radio = new Radio();
        radio.setStation(station);
        for (int i = 0; i <= 10; i++) {
            radio.play();
            radio.nextStation();
        }
    }
}

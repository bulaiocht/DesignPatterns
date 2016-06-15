package tutorial.builder;

/**
 *
 * Created by Kocherha Vitalii on 15.06.16.
 */
public class FordMondeoBuilder extends AbstractCarBuilder {

    void buildModel() {
        car.setModel("Ford Mondeo");
    }

    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    void buildMaxSpeed() {
        car.setMaxSpeed(230);
    }
}

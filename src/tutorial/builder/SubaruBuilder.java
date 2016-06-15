package tutorial.builder;

/**
 *
 * Created by Kocherha Vitalii on 15.06.16.
 */
public class SubaruBuilder extends AbstractCarBuilder {



    void buildModel() {
        car.setModel("Subaru Impreza");
    }

    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    void buildMaxSpeed() {
        car.setMaxSpeed(320);
    }
}

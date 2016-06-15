package tutorial.builder;

/**
 *
 * Created by Kocherha Vitalii on 15.06.16.
 */
public class BuildDirector {

    AbstractCarBuilder carBuilder;

    public void setCarBuilder(AbstractCarBuilder builder){this.carBuilder = builder;}

    public Car buildCar(){
        carBuilder.createCar();
        carBuilder.buildModel();
        carBuilder.buildTransmission();
        carBuilder.buildMaxSpeed();
        Car car = carBuilder.getCar();
        return car;
    }

}
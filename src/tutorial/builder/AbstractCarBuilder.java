package tutorial.builder;

/**
 * Created by Kocherha Vitalii on 15.06.16.
 */
public abstract class AbstractCarBuilder {
    Car car;

    void createCar (){car = new Car();}

    abstract void buildModel();

    abstract void buildTransmission ();

    abstract void buildMaxSpeed();

    Car getCar (){return car;}
}

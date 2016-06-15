package tutorial.builder;

/**
 *
 * Created by Kocherha Vitalii on 12.06.16.
 */
public class CarBuilder {

    private String mod;
    private Transmission trans;
    int maxSpd;

    public CarBuilder (){
        this.mod = "Default";
        this.trans = Transmission.MANUAL;
        this.maxSpd = 120;
    }

    public CarBuilder buildModel(String model){
        this.mod = model;
        return this;
    }

    public CarBuilder buildTransmission(Transmission transmission){
        this.trans = transmission;
        return this;
    }

    public CarBuilder builMaxSpeed (int maxSpeed){
        this.maxSpd = maxSpeed;
        return this;
    }

    public Car build () {
        Car car = new Car();
        car.setModel(this.mod);
        car.setTransmission(this.trans);
        car.setMaxSpeed(this.maxSpd);
        return car;
    }


}

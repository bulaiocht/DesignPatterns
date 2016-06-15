package tutorial.builder;

/**
 *
 * Created by Kocherha Vitalii on 15.06.16.
 */
public class MainBuilder {
    public static void main(String[] args) {
        /*Car car = new CarBuilder().buildModel("Tatra").buildTransmission(Transmission.AUTO).builMaxSpeed(220).build();
        System.out.println(car);*/

        BuildDirector director = new BuildDirector();
        director.setCarBuilder(new SubaruBuilder());
        Car subaru = director.buildCar();
        System.out.println(subaru);
        director.setCarBuilder(new FordMondeoBuilder());
        Car ford = director.buildCar();
        System.out.println(ford);
    }
}

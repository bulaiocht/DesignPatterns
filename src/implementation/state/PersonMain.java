package implementation.state;

import implementation.state.entities.Person;
import implementation.state.entities.phenomena.Animal;
import implementation.state.entities.phenomena.Meadow;
import implementation.state.entities.phenomena.WaterBody;

/**
 * Class with static main method
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class PersonMain {

    public static void main(String[] args) {

        Person person = new Person();
        //Acting as a common person
        person.act();

        //observing some animal
        person.observe(new Animal());
        //acting as hunter
        person.act();

        //observing meadow
        person.observe(new Meadow());
        //acting as mushroomer
        person.act();

        //observing some water body
        person.observe(new WaterBody());
        //acting as fisherman
        person.act();
    }
}

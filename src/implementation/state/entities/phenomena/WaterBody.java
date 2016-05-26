package implementation.state.entities.phenomena;

import implementation.state.entities.Person;
import implementation.state.entities.activities.Fisherman;

/**
 * Representation of a water body
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class WaterBody implements Observable {
    /**
     * Setting persons activity to "Fisherman" state
     *
     * @param person object of Person class
     */
    @Override
    public void setActivity(Person person) {
        person.setPersonActivity(new Fisherman());
    }
}

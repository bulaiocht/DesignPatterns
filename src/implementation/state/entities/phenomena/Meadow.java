package implementation.state.entities.phenomena;

import implementation.state.entities.Person;
import implementation.state.entities.activities.Mushroomer;

/**
 * Representation of a meadow
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class Meadow implements Observable {
    /**
     * setting person activity to "Mushroomer" state
     *
     * @param person object of Person class
     */
    @Override
    public void setActivity(Person person) {
        person.setPersonActivity(new Mushroomer());
    }
}

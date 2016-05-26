package implementation.state.entities.phenomena;

import implementation.state.entities.Person;
import implementation.state.entities.activities.Hunter;

/**
 * Representation of an animal
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class Animal implements Observable {

    /**
     * Setting persons activity to "Hunter" state
     *
     * @param person object of Person class
     */
    @Override
    public void setActivity(Person person) {
        person.setPersonActivity(new Hunter());
    }
}

package implementation.state.entities.phenomena;

import implementation.state.entities.activities.Hunter;
import implementation.state.entities.Person;

/**
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class Animal implements Observable {
    @Override
    public void setActivity(Person person) {
        person.setPersonActivity(new Hunter());
    }
}

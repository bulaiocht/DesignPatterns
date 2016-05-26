package implementation.state.entities.phenomena;

import implementation.state.entities.activities.Mushroomer;
import implementation.state.entities.Person;

/**
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class Meadow implements Observable {

    @Override
    public void setActivity(Person person) {
        person.setPersonActivity(new Mushroomer());
    }
}

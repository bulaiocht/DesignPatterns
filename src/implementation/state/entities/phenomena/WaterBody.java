package implementation.state.entities.phenomena;

import implementation.state.entities.activities.Fisherman;
import implementation.state.entities.Person;

/**
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class WaterBody implements Observable {
    @Override
    public void setActivity(Person person) {
        person.setPersonActivity(new Fisherman());
    }
}

package implementation.state.entities;

import implementation.state.entities.activities.CommonMan;
import implementation.state.entities.activities.PersonActivity;
import implementation.state.entities.phenomena.Observable;

/**
 *
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class Person {

    //Context
    private PersonActivity personActivity;

    public Person() {
        this.personActivity = new CommonMan();
    }

    public void setPersonActivity(PersonActivity personActivity) {
        this.personActivity = personActivity;
    }

    /**
     * @param phenomena object describing some kind of phenomena.
     *                  Object implements interface Observable
     */
    public void observe(Observable phenomena) {
        phenomena.setActivity(this);
    }

    public void act() {
        personActivity.act();
    }


}

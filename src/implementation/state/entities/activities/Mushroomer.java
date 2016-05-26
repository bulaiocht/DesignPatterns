package implementation.state.entities.activities;

/**
 * Mushroomer state for Person
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class Mushroomer implements PersonActivity {

    @Override
    public void act() {
        System.out.println("Looking for mushrooms...");
    }
}

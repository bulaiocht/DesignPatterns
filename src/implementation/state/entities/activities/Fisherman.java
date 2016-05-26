package implementation.state.entities.activities;

/**
 * Fisherman state for Person
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class Fisherman implements PersonActivity {

    @Override
    public void act() {
        System.out.println("Taking fish-rod...");
    }
}

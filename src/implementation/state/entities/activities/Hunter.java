package implementation.state.entities.activities;

/**
 * Hunter state for Person
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class Hunter implements PersonActivity {

    @Override
    public void act() {
        System.out.println("Taking rifle...");
    }
}

package implementation.state.entities.activities;

/**
 * Common man state for Person
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class CommonMan implements PersonActivity {

    @Override
    public void act() {
        System.out.println("Wondering around...");
    }
}

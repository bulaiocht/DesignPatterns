package tutorial.state.human.entities;

/**
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class Weekend implements Activity {

    private int daysRested = 0;
    private int daysToRest = 3;

    @Override
    public void doSomething(Human context) {
        if (daysRested < daysToRest) {
            System.out.println("Resting...");
            daysRested++;
        } else {
            context.setState(new Work());
        }
    }
}

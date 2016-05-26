package tutorial.state.human.entities;

/**
 *
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class Work implements Activity {
    @Override
    public void doSomething(Human context) {
        System.out.println("Working...");
        context.setState(new Weekend());
    }
}

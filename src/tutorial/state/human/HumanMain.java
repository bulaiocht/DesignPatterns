package tutorial.state.human;

import tutorial.state.human.entities.Human;
import tutorial.state.human.entities.Work;

/**
 *
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new Work());

        for (int i = 0; i < 30; i++) {
            human.doSomething();
        }
    }
}
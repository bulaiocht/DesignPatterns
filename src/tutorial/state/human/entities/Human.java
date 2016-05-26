package tutorial.state.human.entities;

/**
 * Created by Kocherha Vitalii on 26.05.2016.
 */
public class Human {

    private Activity state;

    public void setState(Activity activity) {
        this.state = activity;
    }

    public void doSomething() {
        state.doSomething(this);
    }


}

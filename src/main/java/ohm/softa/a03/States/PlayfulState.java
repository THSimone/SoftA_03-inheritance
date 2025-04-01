package ohm.softa.a03.States;

import ohm.softa.a03.Cat;
import ohm.softa.a03.State;

public class PlayfulState extends State {

    PlayfulState(int duration) {
        super(duration);
    }

    @Override
    public State successor(Cat cat) {
        logger.info("Miiiiiiiiiiaaaaaauuuuuu... *purring noises*");
        return new SleepingState(cat.getSleeping());
    }
}

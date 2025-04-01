package ohm.softa.a03.States;

import ohm.softa.a03.Cat;
import ohm.softa.a03.State;

public class HungryState extends State {

    HungryState(int duration) {
        super(duration);
    }

    @Override
    public State successor(Cat cat) {
        logger.info("*dying noises*");
        return new DeadState();
    }

    public State feed(Cat cat){
        logger.info("nompf nmompf schleck nmompf");
        return new DigestingState(cat.getDigest(), getDuration() - getTime());
    }
}

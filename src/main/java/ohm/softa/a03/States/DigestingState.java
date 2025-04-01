package ohm.softa.a03.States;

import ohm.softa.a03.Cat;
import ohm.softa.a03.State;

public class DigestingState extends State {
    private final int remainingWakeTime;

    DigestingState(int duration, int remainingWakeTime) {
        super(duration);
        this.remainingWakeTime = remainingWakeTime;
    }

    @Override
    public State successor(Cat cat) {
        logger.info("miaau (spiel mit mir sonst zerstöre ich deinen Vorhang)");
        return new PlayfulState(remainingWakeTime - cat.getDigest());
    }
}

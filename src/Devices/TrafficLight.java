package Devices;

import Abstract.State;
import States.GreenState;
import States.RedState;
import States.YellowState;

public class TrafficLight {
    private State state;

    public TrafficLight() {
        this.state = new RedState(this);
    }

    public State getState() {
        return state;
    }
    public void nextState() {
        if (state instanceof RedState) {
            state = new YellowState(this);
        } else if (state instanceof YellowState) {
            state = new GreenState(this);
        } else {
            state = new RedState(this);
        }
    }
}

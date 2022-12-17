package Abstract;

import Devices.TrafficLight;

public abstract class State {
    public TrafficLight trafficLight;


    public State(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    public abstract String onRed();

    public abstract String onYellow();

    public abstract String onGreen();

    @Override
    public String toString() {
        return onRed() + " " + onYellow() + " " + onGreen();
    }

}

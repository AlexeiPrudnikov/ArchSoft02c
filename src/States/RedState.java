package States;

import Abstract.State;
import Devices.TrafficLight;

public class RedState extends State {
    public RedState(TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public String onRed() {
        return "Red";
    }

    @Override
    public String onYellow() {
        return "";
    }

    @Override
    public String onGreen() {
        return "";
    }
}

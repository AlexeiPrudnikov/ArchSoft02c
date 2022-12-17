package States;

import Abstract.State;
import Devices.TrafficLight;

public class GreenState extends State {
    public GreenState(TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public String onRed() {
        return "\t";
    }

    @Override
    public String onYellow() {
        return "\t\t";
    }

    @Override
    public String onGreen() {
        return "Green";
    }
}

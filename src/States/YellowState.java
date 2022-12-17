package States;

import Abstract.State;
import Devices.TrafficLight;

public class YellowState extends State {
    public YellowState(TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public String onRed() {
        return "\t";
    }

    @Override
    public String onYellow() {
        return "Yellow";
    }

    @Override
    public String onGreen() {
        return "";
    }
}

package lemaster.service;

public class TakeOffControlService implements TakeOffControl {

    @Override
    public String takeOff() {
        return "Taking off";
    }

    @Override
    public String land(){
        return "Landing....";
    }
    @Override
    public String stop() {
        return "Stopping...";
    }

    @Override
    public String start() {
        return "Starting...";
    }
}

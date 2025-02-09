package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    
    public Tesla(String model, int year) {
        super("Tesla", model, year);
        this.autopilotEnabled = false;
        this.charging = false;
    }

    
    @Override
    public void startEngine() {
        isRunning = true;
        System.out.println(make + " " + model + " started");
    }

    @Override
    public void stopEngine() {
        isRunning = false;
        System.out.println(make + " " + model + " stopped");
    }

    @Override
    public void accelerate() {
        System.out.println(make + " " + model + " is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println(make + " " + model + " is braking...");
    }

    
    @Override
    public void charge() {
        charging = true;
        System.out.println(make + " " + model + " is now charging");
    }

    @Override
    public boolean isCharging() {
        return charging;
    }

    
    @Override
    public void enableAutopilot() {
        autopilotEnabled = true;
        System.out.println("Autopilot enabled");
    }

    @Override
    public void disableAutopilot() {
        autopilotEnabled = false;
        System.out.println("Autopilot disabled");
    }

    @Override
    public boolean isAutopilotEnabled() {
        return autopilotEnabled;
    }
}

package academy.javapro;

public class Main {
    public static void main(String[] args) {
        
        Tesla myTesla = new Tesla("Model S", 2024);

        
        System.out.println("Initial Status:");
        System.out.println(myTesla.getMake() + " " + myTesla.getModel() + " " + myTesla.getYear());
        System.out.println("Running: " + myTesla.isRunning());
        System.out.println("Autopilot: " + myTesla.isAutopilotEnabled());
        System.out.println("Charging: " + myTesla.isCharging());

        
        System.out.println("\nTesting basic vehicle functions:");
        myTesla.startEngine();
        myTesla.accelerate();
        myTesla.brake();

        
        System.out.println("\nTesting autonomous features:");
        myTesla.enableAutopilot();
        System.out.println("Autopilot is currently: " + (myTesla.isAutopilotEnabled() ? "enabled" : "disabled"));
        myTesla.disableAutopilot();

        
        System.out.println("\nTesting electric features:");
        myTesla.charge();
        System.out.println("Charging status: " + myTesla.isCharging());


        System.out.println("\nFinal car status:");
        myTesla.stopEngine();
        System.out.println("Running: " + myTesla.isRunning());
        System.out.println("Autopilot: " + myTesla.isAutopilotEnabled());
        System.out.println("Charging: " + myTesla.isCharging());
    }
}

package jedlikstoycar;

public class JedliksToyCar {
    private static final int DISTANCE_PER_DRIVE = 20;

    private int distance = 0;
    private int battery = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        }
        return "Battery at " + battery + "%";
    }

    public void drive() {
        if (battery > 0) {
            distance += DISTANCE_PER_DRIVE;
            battery --;
        }
    }
}

public class Lamp {
    // Attributes of Lamp
    private String style;
    private boolean battery;
    private int globRating;

    // Initialization
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    // Getters
    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    // Behaviours of Lamp
    public void turnOn() {
        System.out.println("Lamp -> Turning on");
    }
}

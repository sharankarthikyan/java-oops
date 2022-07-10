/*
 * We have not extended any classes in this class. But we are able to create object inside this class without inheriting the class.
 * Composition is a `has-a` relationship.
 * PC has a case. PC has a monitor. PC has a motherboard.
 * Composition is also easily achieved at runtime, while inheritance provides its features at compile time.
 */
public class PC {
    // Attributes of PC
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    // Initialization
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // Getters
    /*
    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
     */

    // Behaviours of PC
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    public void drawLogo() {
        monitor.drawPixelAt(10, 10, "Yellow");
    }
}

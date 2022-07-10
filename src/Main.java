/*
 * We have used composition in this PC example.
 * Advantage of composition is we can create object of for any class without inheriting it. It is achieved during run-time.
 */
public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240W", dimensions);
        Monitor monitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540, 1400));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 4, "v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);

        // We have commented the below lines. Because, if user has direct access to the core, then some issue will happen.
        // Hence, we are commenting all the get methods in PC and giving an alternate solution.
        /*
        thePC.getMonitor().drawPixelAt(10, 10, "Red");
        // Here above, if we use inheritance, then we can call the drawPixelAt by thePC.drawPixelAt(). But, we used composition.
        thePC.getMotherboard().loadProgram("Windows 1.0");
        // Here above, if we use inheritance, then we can call the loadProgram by thePC.loadProgram(). But, we used composition.
        thePC.getTheCase().pressPowerButton();
        */

        thePC.powerUp();
    }
}
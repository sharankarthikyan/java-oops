public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    // Note, we were not implemented a setter for all the above because, while making (constructor) a car all the attributes are defined.
    // Look at the real, we were not change number of gears or doors or above any attribute of the car in the future. Hence, we are not implemented it.

    public void changeGear(int gear) {
        this.currentGear = gear;
        System.out.println("Car.changeGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(): Velocity " + speed + " in direction " + direction);
        move(speed, direction);
    }
}

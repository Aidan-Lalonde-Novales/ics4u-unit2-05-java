/*
* This file contains the characteristics
* of a Vehicle to be added to Main.java.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2022-10-23
*/

/**
 * Vehicle Class.
 */
public class Vehicle {

    /**
     * Declare vehicle speed.
     */
    private int speed = 0;

    /**
     * Declare the license plate number.
     */
    private String licensePlate;

    /**
     * Declare vehicle color.
     */
    private String color;

    /**
     * Declare the amount of doors.
     */
    private int doorCount;

    /**
     * Declare the max vehicle speed.
     */
    private int maxSpeed;

    /**
     * Vehicle Contructor - allows main to implement values for variables
     *
     * @param licensePlate - license plate number
     * @param color - color of the car
     * @param doorCount - number of doors
     * @param maxSpeed - maximum speed achievable
     */
    public Vehicle(
        String licensePlate,
        String color,
        int doorCount,
        int maxSpeed) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.doorCount = doorCount;
        this.maxSpeed = maxSpeed;
    }

    /**
     * status() method - prints all current values
     */
    public void status() {
        System.out.println("");
        System.out.println("    -> Speed: " + this.speed);
        System.out.println("    -> Max Speed: " + this.maxSpeed);
        System.out.println("    -> Number of Doors: " + this.doorCount);
        System.out.println("    -> License Plate: " + this.licensePlate);
        System.out.println("    -> Color: " + this.color);
        System.out.println("");
    }

    /**
     * getLicensePlate() method - returns the current licensePlate value
     *
     * @return licensePlate
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * setLicensePlate() method - changes the license plate value
     *
     * @param licensePlateInput - input from Main to replace licensePlate
     */
    public void setLicensePlate(String licensePlateInput) {
         this.licensePlate = licensePlateInput;
    }

    /**
     * getColor() method - returns the current color value
     *
     * @return color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * setColor() method - changes the color value
     *
     * @param colorInput - input from Main to replace color
     */
    public void setColor(String colorInput) {
         this.color = colorInput;
    }

    /**
     * getDoorCount() method - returns the current doorCount value
     *
     * @return doorCount
     */
    public int getDoorCount() {
        return this.doorCount;
    }

    /**
     * getMaxSpeed() method - returns the current maxSpeed value
     *
     * @return maxSpeed
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * getSpeed() method - returns the current speed value
     *
     * @return speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * accelerate() method - increases the speed of the vehicle
     *
     * @param accelPower
     * @param accelTime
     */
    public void accelerate(int accelPower, int accelTime) {
        this.speed += accelPower * accelTime;
        if (!(this.speed < this.maxSpeed)) {
            this.speed = this.maxSpeed;
        }
    }

    /**
     * breaking() method - decreases the speed of the vehicle
     *
     * @param breakPower
     * @param breakTime
     */
    public void breaking(int breakPower, int breakTime) {
        this.speed -= breakPower * breakTime;
        if (!(this.speed >= 0)) {
            this.speed = 0;
        }
    }
}

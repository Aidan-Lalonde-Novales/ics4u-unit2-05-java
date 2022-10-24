/*
* This file contains fields and methods to be applied to a Vehicle.
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
    private int speed;

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
     * Vehicle Constructor - allows main to implement values for variables.
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
     * Status() method - prints all current values.
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
     * GetLicensePlate() method - returns the current licensePlate value.
     *
     * @return licensePlate
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * SetLicensePlate() method - changes the license plate value.
     *
     * @param licensePlateInput - input from Main to replace licensePlate
     */
    public void setLicensePlate(String licensePlateInput) {
        this.licensePlate = licensePlateInput;
    }

    /**
     * GetColor() method - returns the current color value.
     *
     * @return color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * SetColor() method - changes the color value.
     *
     * @param colorInput - input from Main to replace color
     */
    public void setColor(String colorInput) {
        this.color = colorInput;
    }

    /**
     * GetDoorCount() method - returns the current doorCount value.
     *
     * @return doorCount
     */
    public int getDoorCount() {
        return this.doorCount;
    }

    /**
     * GetMaxSpeed() method - returns the current maxSpeed value.
     *
     * @return maxSpeed
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * GetSpeed() method - returns the current speed value.
     *
     * @return speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Accelerate() method - increases the speed of the vehicle.
     *
     * @param accelPower - power of the acceleration
     * @param accelTime - time to accelerate for
     */
    public void accelerate(int accelPower, int accelTime) {
        this.speed += accelPower * accelTime;
        if (!(this.speed < this.maxSpeed)) {
            this.speed = this.maxSpeed;
        }
    }

    /**
     * Breaking() method - decreases the speed of the vehicle.
     *
     * @param breakPower - power of the break
     * @param breakTime - time to break for
     */
    public void breaking(int breakPower, int breakTime) {
        this.speed -= breakPower * breakTime;
        if (!(this.speed >= 0)) {
            this.speed = 0;
        }
    }
}

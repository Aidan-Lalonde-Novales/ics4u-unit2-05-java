/*
* This file runs alongside Vehicle.java in order to
* create a vehicle with appropiate characteristics
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2022-10-23
*/

/**
 * This is a program that runs alongside Vehicle.java
*/

final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Create Ford Focus
        System.out.println("Created Ford Focus");
        final Vehicle fordFocus = new Vehicle("B40-C4RR0", "white", 4, 284);

        System.out.println("Status:");
        fordFocus.status();

        System.out.println("Accelerating, 10 of power for 10 sec.");
        fordFocus.accelerate(10, 10);
        System.out.println("New speed: " + fordFocus.getSpeed());

        System.out.println("Changing color to black:");
        fordFocus.setColor("black");
        System.out.println("New color: " + fordFocus.getColor());

        // Create Ferrari
        System.out.println("");
        System.out.println("Created Ferrari");
        final Vehicle ferrari = new Vehicle("VHD-35HU", "red", 2, 320);

        System.out.println("Status:");
        ferrari.status();

        System.out.println("Accelerating, 100 of power for 4 sec.");
        ferrari.accelerate(100, 4);
        System.out.println("New speed: " + ferrari.getSpeed());

        System.out.println("Breaking, 10 of power for 10 sec.");
        ferrari.breaking(10, 10);
        System.out.println("New speed: " + ferrari.getSpeed());

        System.out.println("Changing color to racing red:");
        ferrari.setColor("racing red!");
        System.out.println("New color: " + ferrari.getColor());

        // Create Citroen Ami
        System.out.println("");
        System.out.println("Created Citroen Ami");
        final Vehicle citroenAmi = new Vehicle("FS-695-DQ", "blue", 2, 45);

        System.out.println("Status:");
        citroenAmi.status();

        System.out.println("Accelerating, 5 of power for 10 sec.");
        citroenAmi.accelerate(5, 10);
        System.out.println("New speed: " + citroenAmi.getSpeed());

        System.out.println("Breaking, 2 of power for 10 sec.");
        citroenAmi.breaking(2, 10);
        System.out.println("New speed: " + citroenAmi.getSpeed());

        System.out.println("Changing color to purple:");
        citroenAmi.setColor("purple");
        System.out.println("New color: " + citroenAmi.getColor());

        System.out.println("\nDone.");
    }
}

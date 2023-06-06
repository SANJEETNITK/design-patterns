package creational_design_patterns.factory;

/**
 * LuxuryCar is concrete implementation of car type LUXURY.
 */
public class LuxuryCar extends Car {

    LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        // add accessories
    }
}

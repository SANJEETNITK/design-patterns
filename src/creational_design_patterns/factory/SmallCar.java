package creational_design_patterns.factory;

/**
 * SmallCar is concrete implementation of car type SMALL.
 */
public class SmallCar extends Car {

    SmallCar() {
        super(CarType.SMALL);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building small car");
        // add accessories
    }
}

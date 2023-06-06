package creational_design_patterns.factory;

/**
 * SedanCar is concrete implementation of car type SEDAN.
 */
public class SedanCar extends Car {

    SedanCar() {
        super(CarType.SEDAN);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building sedan car");
    }
}

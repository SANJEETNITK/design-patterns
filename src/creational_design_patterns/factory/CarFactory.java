package creational_design_patterns.factory;

/**
 * CarFactory.java is our main class implemented using factory pattern.
 * It instantiates a car instance only after determining its type.
 */
public class CarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SMALL:
                car = new SmallCar();
                break;
            case SEDAN:
                car = new SedanCar();
                break;
            case LUXURY:
                car = new LuxuryCar();
                break;
            default:
                break;
        }
        return car;
    }
}

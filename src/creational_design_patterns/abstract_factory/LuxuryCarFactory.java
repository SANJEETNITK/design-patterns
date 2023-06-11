package creational_design_patterns.abstract_factory;


public class LuxuryCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new LuxuryCar();
    }
}

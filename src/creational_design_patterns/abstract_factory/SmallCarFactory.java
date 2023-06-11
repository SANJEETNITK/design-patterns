package creational_design_patterns.abstract_factory;

public class SmallCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SmallCar();
    }
}

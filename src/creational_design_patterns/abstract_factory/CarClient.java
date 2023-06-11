package creational_design_patterns.abstract_factory;


import java.util.Arrays;

public class CarClient {
    public static void main(String[] args) {
        CarFactory smallCarFactory = getCarFactory("SMALL");
        Car smallCar = smallCarFactory.createCar();
        System.out.println(smallCar.getModel());

        int z;
        CarFactory sedanCarFactory = getCarFactory("SEDAN");
        Car sedanCar = sedanCarFactory.createCar();
        System.out.println(sedanCar.getModel());
    }

    public static CarFactory getCarFactory(String carType) {
        switch (carType) {
            case "SMALL":
                return new SmallCarFactory();
            case "SEDAN":
                return new SedanCarFactory();
            case "LUXURY":
                return new LuxuryCarFactory();
            default:
                throw new IllegalArgumentException("Invalid car type: " + carType);
        }
    }
}

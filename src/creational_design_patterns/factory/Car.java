package creational_design_patterns.factory;

/**
 * Car is parent class of all car instances and it will also contain the common logic applicable in car making of all types.
 */
public abstract class Car {

    public Car(CarType model) {
        this.model = model;
    }

    // Do subclass level processing in this method
    protected abstract void construct();

    private CarType model = null;

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
